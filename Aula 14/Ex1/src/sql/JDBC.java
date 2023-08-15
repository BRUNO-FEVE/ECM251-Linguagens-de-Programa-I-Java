package sql;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class JDBC {
    
    private String login;
    private String password;
    private String schoolSubjects;
    private String grade;
    private String absences;


    public boolean userFound = false;
    
    public JDBC() {
    } 

    public JDBC(Object[] newUser){
        this.login = newUser[0].toString();
        this.password = newUser[1].toString();
        this.schoolSubjects = newUser[2].toString();
        this.grade = newUser[3].toString();
        this.absences = newUser[4].toString();
    }

    public JDBC(String login, String password){
        this.login = login;
        this.password = password;
    }

    public JDBC(String login){
        this.login = login;
    }

    public JDBC(String login, String schoolSubjects, String grade, String absences){
        this.login = login;
        this.schoolSubjects = schoolSubjects;
        this.grade = grade;
        this.absences = absences;
    }
    
   //gets
    public String getLogin(){
        return this.login;
    }
    public String getPassword(){
        return this.password;
    }
    public String getSchoolSubjects() {
        return this.schoolSubjects;
    }
    
    public String getGrade() {
        return this.grade;
    }

    public String getAbsences() {
        return this.absences;
    }
    public boolean getUserFound() {
        return this.userFound;
    }

    
    //sets
    public void setLogin(String login){
        this.login = login;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setSchoolSubjects(String schoolSubjects){
        this.password = schoolSubjects;
    }
    public void setGrade(String grade){
        this.password = grade;
    }
    public void setAbsences(String absences){
        this.password = absences;
    }


public void insertLogin(Connection conn){
    String sqlInsert = 
    "INSERT INTO login (login,password) VALUES (?,?)";
    PreparedStatement stm = null;
    try {
        stm = conn.prepareStatement(sqlInsert);
        stm.setString(1, getLogin());
        stm.setString(2, getPassword());
        stm.execute();
        }
    catch (Exception e) {
        e.printStackTrace();
        try{
            conn.rollback();
        }
        catch (SQLException e1){
            System.out.print(e1.getStackTrace());
        }
}
finally {
    if (stm != null) {
        try {
            stm.close();
        }
        catch (SQLException e1) {
            System.out.print(e1.getStackTrace());
        }
    }
}
}

public boolean loadLogin(Connection conn) {
        String sqlSelect = "SELECT login, password FROM login WHERE login = ? AND password = ?";
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = conn.prepareStatement(sqlSelect);
            stm.setString(1, getLogin());
            stm.setString(2, getPassword());
            rs = stm.executeQuery();

            while (rs.next()) {
                setLogin(rs.getString(1));
                setPassword(rs.getString(2));
                this.userFound = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        try{
            conn.rollback();
        }
        catch (SQLException e1){
            System.out.print(e1.getStackTrace());
        }
            return false;
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                }
                catch (SQLException e1) {
                    System.out.print(e1.getStackTrace());
                }
            }
        }
        return this.userFound;
    }
    
public ArrayList<Object[]> loadGrades(Connection conn){
    ArrayList<Object[]> hoursList = new ArrayList<>();
    String sqlSelect = "SELECT schoolSubjects, grades, absences FROM school_report WHERE login = ?";
    PreparedStatement stm = null;
    ResultSet rs = null;
    try {
        stm = conn.prepareStatement(sqlSelect);
        stm.setString(1, getLogin());
        rs = stm.executeQuery();
        while (rs.next()) {
            String schoolSubjects = rs.getString(1);
            String grades = rs.getString(2);
            String absences = rs.getString(3);
            String[] hourData = {schoolSubjects,grades,absences};
            hoursList.add(hourData);
        }
    }
    catch (Exception e) {
        e.printStackTrace();
        try {
            conn.rollback();
        }
        catch (SQLException e1) {
            System.out.print(e1.getStackTrace());
        }
    }
    finally {
        if (stm != null) {
            try {
                stm.close();
            }
            catch (SQLException e1) {
                System.out.print(e1.getStackTrace());
            }
        }
    }
    return hoursList;
}
}