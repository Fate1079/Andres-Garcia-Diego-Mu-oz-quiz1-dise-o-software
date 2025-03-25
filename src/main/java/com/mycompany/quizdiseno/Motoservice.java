/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.quizdiseno;

import java.sql.SQLException;

/**
 *
 * @author ANDRES FELIPE
 */
public class Motoservice {
    private AppCrud motoRepository = new AppCrud(); // Cambio de mayúscula en "MotoRepository"

    public Moto obtenerMoto(int id) throws SQLException {
        return motoRepository.buscarPorId(id);
    }

    public void agregarMoto(int id, int marca, String cilindrada, int precio, String color) throws SQLException {
        Moto moto = new Moto(id, marca, cilindrada, precio, color);
        motoRepository.agregarMoto(id, marca, cilindrada, precio, color);
    }
    
    
    public boolean eliminar(int id) throws SQLException{
        return motoRepository.eliminarPorId(id);
    }
    
    public boolean editarMoto(int id, int marca, String cilindrada, int precio, String color) throws SQLException {
          Moto moto = new Moto(id, marca, cilindrada, precio, color);
        motoRepository.editarMoto(id, marca, cilindrada, precio, color);
        return true;
    
    }
}