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
public class Ejecutar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Operaciones op1=new Operaciones();
        Menu m=new Menu();
        int opcion=m.presentar_menu();
        while ((opcion==1)||(opcion==2)){ 
            if (opcion==1){
                int valor;
                System.out.println("Ingrese el valor del cual desea imprimir la tabla");
                valor=entrada.nextInt();
                int limite;
                System.out.println("Ingrese el valor hasta el cual desea imprimir la tabla");
                limite=entrada.nextInt();
                op1.obtener_tabla_sumada(valor,limite);
            }else{
                int valor;
                System.out.println("Ingrese el valor del cual desea imprimir la tabla");
                valor=entrada.nextInt();
                op1.obtener_tabla_multiplicar(valor);
            }
            opcion=m.presentar_menu();
            
        }
        
    }
    
}
