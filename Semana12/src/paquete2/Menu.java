/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Menu {
    public int presentar_menu(){
        System.out.println("1. Desea imprmir la tabla de sumas");
        System.out.println("2. Desea imprimir la tabla de multiplicar");
        System.out.println("3. Salir");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la opcion que desee(1, 2 o 3): ");
        int opcion=entrada.nextInt();
        return opcion;
    }
    
}
