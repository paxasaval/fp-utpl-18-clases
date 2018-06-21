/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Semana10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de ariables
        int[][] notas=new int[3][4];
        notas[0][0]=30;
        notas[0][3]=70;
        for (int i=0;i<notas.length;i++){
            //System.out.println(notas[i][0];)
            System.out.printf("%d\t(%d,%d)\n", notas[i][0], i, 0);
            System.out.printf("%d\t(%d,%d)\n", notas[i][1], i, 1);
            System.out.printf("%d\t(%d,%d)\n", notas[i][2], i, 2);
            System.out.printf("%d\t(%d,%d)\n", notas[i][3], i, 3);
            System.out.println("-------------");
        }
    }
    
}
