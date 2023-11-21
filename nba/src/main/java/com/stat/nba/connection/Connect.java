/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stat.nba.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ITU
 */
public class Connect {
    public static Connection getConnect() throws Exception
    {
        Connection con=null;
        String driver="org.postgresql.Driver";
        String username="postgres";
        String pass="adminp15";
        if(con==null){
            try{
                Class.forName(driver);
                con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/stat_nba",username,pass);
            }
            catch(ClassNotFoundException | SQLException e){
                System.out.println(e.getMessage());
            }
        }
        return con;
    }     
}
