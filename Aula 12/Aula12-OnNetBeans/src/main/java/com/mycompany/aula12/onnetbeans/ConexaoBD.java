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
public class ConexaoBD {
    static { try {
        Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    }}
    
    public Connection conectar() throws SQLException {
        String servidor = "localhost";
        String porta = "3306";
        String database = "PROFESSOR";
        String professor = "root";
        String senha = "senhaSql";
        
        return DriverManager.getConnection("jdbc:mysql://"+servidor+":"+porta+"/"+database+"?user="+professor+"&password="+senha);
    }
}
