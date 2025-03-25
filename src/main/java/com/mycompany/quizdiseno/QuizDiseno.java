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
public class QuizDiseno {

   public static void main(String[] args) throws SQLException {
      Motoservice motoService = new Motoservice();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Registrar usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. agregar moto");
            System.out.println("4. Buscar moto");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

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

            }else if(choice==3){
                
                motoService.agregarJuguete(1,1,"xfe",3000,"Amarillo");
                
            }else if(choice==4){
                  Moto juguete = motoService.obtenerJuguete(1);
            if (juguete != null) {
                System.out.println("Juguete encontrado: " + juguete.getPlaca());
            } else {
                System.out.println("Juguete no encontrado.");
            }
            } else if (choice == 5) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }

        scanner.close();
    }
}
