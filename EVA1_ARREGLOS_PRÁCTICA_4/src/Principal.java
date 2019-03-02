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
        
        int [][] Matriz1 = new int [5][5];
        int [][] Matriz2 = new int [5][5];
        int [][] MatrizResultado = new int [5][5];
        
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                Matriz1[i][j] = (int)(double)(Math.random() *5);
            }
        }
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                Matriz2[i][j] = (int)(double)(Math.random() *5);
            }
        }
        for(int i = 0; i<5; i++){
          
            if(MatrizResultado[0][0] == 0){
                int resultante = (Matriz1[0][0] * Matriz2[0][0])
                        + (Matriz1[0][1] * Matriz2[1][0])
                        + (Matriz1[0][2] * Matriz2[2][0])
                        + (Matriz1[0][3] * Matriz2[3][0])
                        + (Matriz1[0][4] * Matriz2[4][0]);
                
                MatrizResultado[0][1] = resultante;
            } else if (MatrizResultado[1][1] == 0){
                int resultante = (Matriz1[1][0] * Matriz2[0][1])
                        + (Matriz1[1][1] * Matriz2[1][1])
                        + (Matriz1[1][2] * Matriz2[2][1])
                        + (Matriz1[1][3] * Matriz2[3][1])
                        + (Matriz1[1][4] * Matriz2[4][1]);
                
                MatrizResultado[1][1] = resultante;
            }
        }
    
        for(int i = 0; i<5; i++){
            if(i<5){
                for(int j = 0; j<5; j++){
                    System.out.print("[" + Matriz1[i][j] + "]");
                }
                if (i == 1){
                    System.out.print(" x ");
                } else{
                    System.out.print("   ");
                }
            } else {
                System.out.print("                         ");
            
            for(int j = 0; j<5; j++){
                System.out.print("[" + Matriz2[i][j] + "]");
            }
            if (i == 1){
                System.out.print(" = ");
            } else {
                System.out.print("   ");
            }
            if(i<5){
                for(int j = 0; j<5; j++){
                    System.out.print("[" + MatrizResultado[i][j] + "]");
                }
            }
            }
        }
    }
    
}
