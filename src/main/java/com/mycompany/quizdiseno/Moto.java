/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizdiseno;

/**
 *
 * @author MI PC
 */
public class Moto {
    private int id;
    private String Placa;
    private String Cilindraje;
    private int Precio;
    private String Color;

    public Moto(int id, String Placa, String Cilindraje, int Precio, String Color) {
        this.id = id;
        this.Placa = Placa;
        this.Cilindraje = Cilindraje;
        this.Precio = Precio;
        this.Color = Color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(String Cilindraje) {
        this.Cilindraje = Cilindraje;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
    
}
