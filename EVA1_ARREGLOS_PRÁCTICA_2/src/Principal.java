
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Littl
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[][] matriz = new int[10][10];
        
        int valor = 1;
        
       
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz.length; j++){
                matriz[i][i] = 1;
                
               
        }
        }
        
            for(int i=0; i<matriz.length; i++){
                System.out.println(Arrays.toString(matriz[i]));
            }
        
    }

}