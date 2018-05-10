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
public class Ejercicio4 {
    public static void main(String[] arg){
        int contador =1;
        double estatura = 0;
        double promedio = 0;
        double suma = 0;
        boolean opcion = true;
        String cadenafinal=String.format("%s\n", "Lista de Estaturas");
        
        System.out.printf("Acontinuacion va ingresar las estaturas del equipo de basquet\n");
        
        while(opcion){
            Scanner entrada=new Scanner(System.in);
            System.out.printf("Ingrese la estatura del jugador %d :",contador);
            estatura=entrada.nextDouble();
            if (estatura<1.20){
                estatura=1.20;
            }
            cadenafinal=String.format("%s%.2f \n", cadenafinal,estatura);
            suma=suma+estatura;
            contador=contador+1;
            
            entrada.nextLine(); // Ojo usamos el limpiador del scanner.
            // proceso para salir del ciclo.
            
            System.out.println("Ingrese si(salir)");
            String temporal = entrada.nextLine();
            if(temporal.equals("si")){
                opcion = false;
            }  
        }
        promedio=suma/(contador-1);
        System.out.printf("\t\tReporte de Estaturas\n");
        System.out.printf("%s",cadenafinal);
        System.out.printf("%f",suma);
        System.out.printf("%d",contador);
        System.out.printf("El promedio de las estaturas es: %.2f \n",promedio);
        System.out.printf("Reporte generado por el Dept. Deportes");
        
        
        
    }
}
