/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana6;

/**
 *
 * @author User
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        // TODO code application logic here

        int edad = 0;
        int contador = 1;
        int suma = 0;
        System.out.printf("Edad \tSuma\n");
        while (contador <= 4) {
            suma = suma + contador;
            System.out.printf("%d\t\t%d\n", contador, suma);
            contador = contador + 1;

        }
    }

}
