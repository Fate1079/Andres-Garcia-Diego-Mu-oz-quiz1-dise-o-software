/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.quizdiseno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ANDRES FELIPE
 */
public class DataBaseCong {

    /**
     * @param args the command line arguments
     */

    private static final String URL = "jdbc:mysql://localhost:3307/motoclicleta";
    private static final String USER = "root";
    private static final String PASSWORD = "Kurumi107911";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
