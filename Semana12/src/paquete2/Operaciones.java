/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author User
 */
public class Operaciones {
    public void obtener_tabla_sumada(int numero, int limite){
        for (int i = 0; i <= limite; i++) {
            System.out.printf("%d + %d = %d\n",numero,i,(numero+i));      
        }
    }
    public void obtener_tabla_multiplicar(int valor){
        for (int i = 0; i <= 20; i++){
            System.out.printf("%d * %d = %d\n",valor,i,(valor*i)); 
        }
    }
}
