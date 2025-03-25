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
  private AppCrud MotoRepository = new AppCrud();
    
    public Moto obtenerJuguete(int id) throws SQLException {
        return MotoRepository.buscarPorId(id);
    }
    
    public void agregarJuguete(int id,int marca,String cilidraje,int precio,String color) throws SQLException {
       MotoRepository.agregarMoto(new Moto( id, marca,cilidraje, precio,color));
    }
}
