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
   public void agregarMoto(int id,int marca,String cilindrada,int precio,String color) throws SQLException {
  String query = "INSERT INTO moto (Marca, Cilindraje, Precio, Color) VALUES (?, ?, ?, ?)";
    try (Connection conn = DatabaseConfig.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {
        
        stmt.setInt(1, marca);
stmt.setString(2, cilindrada);
stmt.setInt(3, precio);
stmt.setString(4, color);
stmt.executeUpdate();
        
   
    }
}


public Moto buscarPorId(int id) throws SQLException {
    String consulta = "SELECT * FROM Moto WHERE id = ?";
    
    try (Connection conexion = DatabaseConfig.getConnection();
         PreparedStatement stmt = conexion.prepareStatement(consulta)) {
        
        stmt.setInt(1, id);
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return new Moto(rs.getInt("id"), rs.getInt("marca"), rs.getString("Cilindraje"), rs.getInt("Precio"), rs.getString("Color"));
            }
        }
    }
    return null; 
}


public boolean eliminarPorId(int id) throws SQLException {
    String consulta = "DELETE FROM Moto WHERE id = ?";
    
    try (Connection conexion = DatabaseConfig.getConnection();
         PreparedStatement stmt = conexion.prepareStatement(consulta)) {
        
        stmt.setInt(1, id);
        int filasAfectadas = stmt.executeUpdate();
        
        return filasAfectadas > 0; // Devuelve `true` si eliminó algo
    }
}

public boolean editarMoto(int id, int marca, String cilindrada, int precio, String color) throws SQLException {
        String consulta = "UPDATE moto SET Marca = ?, Cilindraje = ?, Precio = ?, Color = ? WHERE id = ?";

        try (Connection conexion = DatabaseConfig.getConnection();
             PreparedStatement stmt = conexion.prepareStatement(consulta)) {

            stmt.setInt(1, marca);
            stmt.setString(2, cilindrada);
            stmt.setInt(3, precio);
            stmt.setString(4, color);
            stmt.setInt(5, id);

            int filasAfectadas = stmt.executeUpdate();
            return filasAfectadas > 0;
        }
    }
}