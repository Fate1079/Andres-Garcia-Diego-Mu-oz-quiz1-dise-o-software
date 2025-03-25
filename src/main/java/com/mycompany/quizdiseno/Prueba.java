/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.quizdiseno;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ANDRES FELIPE
 */
public class Prueba {

 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try (Connection conn = DataBaseCong.getConnection()) {
            System.out.println("¡Conexión exitosa!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
