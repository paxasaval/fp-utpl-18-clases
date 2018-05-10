/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad = 0;
        int contador = 1;
        int suma = 0;
        String cadena_final = String.format("%s\t%s\n", "EDAD", "SUMA");
        while (contador <= 5) {
            System.out.println("Ingrese la edad: ");
            Scanner entrada = new Scanner(System.in);
            edad = entrada.nextInt();
            cadena_final = String.format("%s%d\t%d\n", cadena_final, edad, suma);
            suma = suma + edad;
            contador = contador + 1;
        }
        System.out.printf("%s", cadena_final);
    }

}
