/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula12.onnetbeans;

import java.sql.*;
/**
 *
 * @author bruno-fevereiro
 */
public class Aula12OnNetBeans {

    public static void main(String[] args) throws SQLException{
        Connection conn = null;
        ConexaoBD bd = new ConexaoBD();
        conn = bd.conectar();
        
        Professor prof = new Professor();
        prof.setNome("Bruno");
        prof.setIdade(50);
        prof.setMatricula(146);
        
        prof.delete(conn);
        
        System.out.println(prof.toString());
        
        prof.setIdade(40);
        
        
        prof.getData(conn);
        
        System.out.println(prof.toString());
    }
}
