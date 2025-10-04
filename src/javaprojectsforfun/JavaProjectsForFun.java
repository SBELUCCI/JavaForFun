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

        System.out.print("Ingresá un número: ");

        // Read number (int)
        int number = scanner.nextInt();

        System.out.println("Ingresaste el número: " + number);

        scanner.close();
    }
    
}
