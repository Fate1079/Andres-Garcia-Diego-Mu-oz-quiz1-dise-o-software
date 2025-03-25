/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizdiseno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MI PC
 */
public class AppCrud {

    //aaa//
    public void agregarMoto(Moto id) throws SQLException {
        String query = "INSERT INTO Moto (nombre) VALUES (?)";
        try (Connection conn = DatabaseConfig.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.executeUpdate();
        }
    }

    public Moto buscarPorId(int id) throws SQLException {
        String consulta = "SELECT * FROM Moto WHERE id = " + id;
        try (Connection conexion = DatabaseConfig.getConnection();
             Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(consulta)) {
            
            if (rs.next()) {
                return new Moto(rs.getInt("id"), rs.getInt("placa"),rs.getString("Cilindro"),rs.getInt("Precio"),rs.getString("Color"));
            }
            return null;
        }
    }
    
    public Moto eliminarPorId(int id) throws SQLException {
        String consulta = "DELETE * FROM Moto WHERE id = " + id;
        try (Connection conexion = DatabaseConfig.getConnection();
             Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(consulta)) {
            
            if (rs.next()) {
                return new Moto(rs.getInt("id"), rs.getInt("placa"),rs.getString("Cilindro"),rs.getInt("Precio"),rs.getString("Color"));
            }
            return null;
        }
    }
}
