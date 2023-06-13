/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12.onnetbeans;

import java.sql.*;

/**
 *
 * @author bruno-fevereiro
 */
public class Professor {
    
    private String nome;
    private int idade, matricula;
    
    public Professor() {
        
    }
    
    public Professor(int matricula) {
        this.matricula = matricula;
    }
    
    public Professor(String nome, int idade, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public int getMatricula() {
        return this.matricula;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    } 
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String toString() {
        return "Nome: " + this.nome + "\nIdade: " + this.idade + "\nMatricula: " + this.matricula;
    }
    
    public void create(Connection conn) {
        String sqlInsert = "INSERT INTO PROFESSOR (nome, idade, matricula) VALUES (?, ?, ?)";
        
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlInsert);
            stm.setString(1, this.getNome());
            stm.setInt(2, this.getIdade());
            stm.setInt(3, this.getMatricula());
            stm.execute();
        } catch (Exception e){
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException e1) {
                System.out.print(e1.getStackTrace());
            }
        } finally {
            if(stm != null) {
                try {
                    stm.close();
                } catch (SQLException e1) {
                    System.out.print(e1.getStackTrace());
                }
            }
        }
        
    }
    
    public void update(Connection conn) {
        String sqlUpdate = "UPDATE PROFESSOR SET idade = ?, matricula = ? WHERE nome = ?";
        
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlUpdate);
            stm.setInt(1, this.getIdade());
            stm.setInt(2, this.getMatricula());
            stm.setString(3, this.getNome());
            stm.execute();
        } catch (Exception e){
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException e1) {
                System.out.print(e1.getStackTrace());
            }
        } finally {
            if(stm != null) {
                try {
                    stm.close();
                } catch (SQLException e1) {
                    System.out.print(e1.getStackTrace());
                }
            }
        }
    }
    
    public void delete(Connection conn) {
        String sqlDelete = "DELETE FROM PROFESSOR WHERE nome = ?";
        
        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlDelete);
            stm.setString(1, this.getNome());
            stm.execute();
        } catch (Exception e){
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException e1) {
                System.out.print(e1.getStackTrace());
            }
        } finally {
            if(stm != null) {
                try {
                    stm.close();
                } catch (SQLException e1) {
                    System.out.print(e1.getStackTrace());
                }
            }
        }
    }
    
    public void getData(Connection conn) {
        String sqlGetData = "SELECT Idade, Matricula FROM PROFESSOR WHERE nome = ?";
        
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            stm = conn.prepareStatement(sqlGetData);
            stm.setString(1, this.getNome());
            rs = stm.executeQuery();
            if (rs.next()) {
                this.setIdade(rs.getInt(1));
                this.setMatricula(rs.getInt(2));
            }
        } catch (Exception e){
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException e1) {
                System.out.print(e1.getStackTrace());
            }
        } finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e1) {
                    System.out.print(e1.getStackTrace());
                }
            }
            if(stm != null) {
                try {
                    stm.close();
                } catch (SQLException e1) {
                    System.out.print(e1.getStackTrace());
                }
            }
        }
        
    }
}
