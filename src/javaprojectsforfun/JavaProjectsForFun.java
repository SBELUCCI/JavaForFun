/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaprojectsforfun;
import java.util.Scanner;
/**
 *
 * @author sowo
 */
public class JavaProjectsForFun {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Ingresa un numero entero: ");

            if (scanner.hasNextInt()) {
                // Read number (int)
                number = scanner.nextInt();
                break;  // If the entered number is valid, exit the loop
            } else {
                System.out.println("Error: eso no es un numero entero valido. Intenta de nuevo.");
                scanner.next(); // descarta la entrada inválida
            }
        }

        System.out.println("Ingresaste el numero: " + number);
        scanner.close();
    }
    
}
