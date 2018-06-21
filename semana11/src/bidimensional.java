/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class bidimensional {
     public static void main(String[] args) {
       // Declaracion de variables
        int[][] notas=new int[3][4];
        notas[0][0]=30;
        notas[0][3]=70;
        for (int i=0;i<notas.length;i++){
            int v=notas[i].length;
            //System.out.println(v);
            for (int j=0;j<v;j++){
                System.out.printf("%d\t(%d,%d)\n",notas[i][j],i,j);
            }
            System.out.println("-------------");
            
        }  
     }
        
}
