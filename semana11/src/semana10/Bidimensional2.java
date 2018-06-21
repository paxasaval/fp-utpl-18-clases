/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10;

/**
 *
 * @author User
 */
public class Bidimensional2 {
     public static void main(String[] args){
         //Declaracion de variables
         int[][]valores= {{8,7,6,2},{12,13,15,11},{1,2,3,6},{4,8,12,15}};
         for (int i=0;i<valores.length;i++){
            int v=valores[i].length;
            //System.out.println(v);
            for (int j=0;j<v;j++){
                System.out.printf("%d\t(%d,%d)\n",valores[i][j],i,j);
            }
            System.out.println("-------------");
         }
     }
    
}
