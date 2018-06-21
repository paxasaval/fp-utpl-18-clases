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
public class Persona {
    public boolean acceder_estadio (int edad){
        //return (edad>=18)? true:false;(metodo abreviado)
        boolean valor;
        if (edad>=18){
            valor=true;
        }else{
            valor=false;
        }
        return valor;
    }
}
