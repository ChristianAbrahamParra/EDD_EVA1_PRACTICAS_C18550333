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
        
        int matriz[][] = new int[5][5];
        
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz.length; j++){
                matriz[i][j] = (int)(Math.random()*100 + 1);
            
            }
        }
    
   
    for(int i = 0; i<5; i++){
        for(int j = 0; j<5; j++){
            for(int x = 0; x<5; x++){
                for(int y = 0; y<5; y++){
                    if(matriz[i][j] < matriz[x][y]){
                        int a = matriz[i][j];
                        matriz[i][j] = matriz[x][y];
                        matriz[x][y] = a;
                    }
                }
            }
        }
    }
    
        System.out.print("");
        for(int i = 0; i< 5; i++){
            for(int j = 0; j<5; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
