/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.quizdiseno;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author ANDRES FELIPE
 */
public class QuizDisenoMain {

    public static void main(String[] args) throws SQLException {
        Motoservice motoService = new Motoservice();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Registrar usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Agregar moto");
            System.out.println("4. Buscar moto");
            System.out.println("5. Editar moto");
            System.out.println("6. Eliminar moto");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpia el buffer

            if (choice == 1) {
                System.out.print("Introduce nombre de usuario: ");
                String username = scanner.nextLine();
                System.out.print("Introduce contraseña: ");
                String password = scanner.nextLine();

                boolean success = DatabaseConfig.register(username, password);
                if (success) {
                    System.out.println("Usuario registrado con éxito.");
                } else {
                    System.out.println("Error al registrar el usuario. Es posible que el nombre ya esté registrado.");
                }

            } else if (choice == 2) {
                System.out.print("Introduce nombre de usuario: ");
                String username = scanner.nextLine();
                System.out.print("Introduce contraseña: ");
                String password = scanner.nextLine();

                boolean success = DatabaseConfig.login(username, password);
                if (success) {
                    System.out.println("Inicio de sesión exitoso.");
                } else {
                    System.out.println("Usuario o contraseña incorrectos.");
                }

            } else if (choice == 3) {
                System.out.print("ID de la moto: ");
                int id = scanner.nextInt();
                System.out.print("Marca (ID de la marca): ");
                int marca = scanner.nextInt();
                scanner.nextLine(); // Limpia el buffer
                System.out.print("Cilindrada: ");
                String cilindro = scanner.nextLine();
                System.out.print("Precio: ");
                int precio = scanner.nextInt();
                scanner.nextLine(); // Limpia el buffer
                System.out.print("Color: ");
                String color = scanner.nextLine();

                motoService.agregarMoto(id, marca, cilindro, precio, color);
                System.out.println("Moto agregada con éxito.");

            } else if (choice == 4) {
                System.out.print("Ingrese el ID de la moto a buscar: ");
                int id = scanner.nextInt();

                Moto moto = motoService.obtenerMoto(id);
                if (moto != null) {
                    System.out.println("Moto encontrada: ");
                    System.out.println("Placa: " + moto.getPlaca());
                    System.out.println("Marca: " + moto.getPlaca());
                    System.out.println("Cilindrada: " + moto.getCilindraje());
                    System.out.println("Precio: " + moto.getPrecio());
                    System.out.println("Color: " + moto.getColor());
                } else {
                    System.out.println("Moto no encontrada.");
                }

            } else if (choice == 5) {

                System.out.print("Ingrese el ID de la moto a editar: ");
                int id = scanner.nextInt();
                System.out.print("Nueva marca (ID de la marca): ");
                int marca = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nueva cilindrada: ");
                String cilindro = scanner.nextLine();
                System.out.print("Nuevo precio: ");
                int precio = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nuevo color: ");
                String color = scanner.nextLine();

                boolean editado = motoService.editarMoto(id, marca, cilindro, precio, color);
                if (editado) {
                    System.out.println("Moto actualizada con éxito.");
                } else {
                    System.out.println("No se encontró la moto con ese ID.");
                }
            } else if (choice == 6) {
                System.out.print("Ingrese el ID de la moto a eliminar: ");
                int id = scanner.nextInt();

                boolean eliminado = motoService.eliminar(id);
                if (eliminado) {
                    System.out.println("Moto eliminada con éxito.");
                } else {
                    System.out.println("No se encontró la moto con ese ID.");
                }

            } else if (choice == 7) {
                System.out.println("Saliendo...");
                break;

            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }

        scanner.close();
    }
}
