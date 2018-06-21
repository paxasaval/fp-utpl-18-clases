/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana12;

/**
 *
 * @author User
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1=new Persona();
        int e=20;
        //System.out.println(p1.acceder_estadio(18));(verifico)
        //
        boolean bandera=p1.acceder_estadio(7);
        if (bandera){
            System.out.print("Puedes entrar al estadio\n");
        }else{
            System.out.print("No puedes entrar al estadio\n");
        }
        
    }
    
}
