/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizdiseno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author MI PC
 */
public class AppCrud {

    public void agregarTarea(String nombre) throws SQLException {
        String query = "INSERT INTO tareas (nombre) VALUES (?)";
        try (Connection conn = DatabaseConfig.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nombre);
            stmt.executeUpdate();
        }
    }

    public JugueteDTO buscarPorId(int id) throws SQLException {
        String consulta = "SELECT * FROM juguete WHERE id = " + id;
        try (Connection conexion = DatabaseConfig.getConnection();
             Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(consulta)) {
            
            if (rs.next()) {
                return new JugueteDTO(rs.getInt("id"), rs.getString("nombre"));
            }
            return null;
        }
    }
    
    public moto eliminarPorId(int id) throws SQLException {
        String consulta = "DELETE * FROM moto WHERE id = " + id;
        try (Connection conexion = DatabaseConfig.getConnection();
             Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(consulta)) {
            
            if (rs.next()) {
                return new JugueteDTO(rs.getInt("id"), rs.getString("nombre"));
            }
            return null;
        }
    }
}
