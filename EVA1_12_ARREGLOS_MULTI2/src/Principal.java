/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian Abraham Parra Pérez
 * # Control: C18550333
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][][][][] aiArreX = new int [5][5][5][5][5]; //Arreglo multidimensional de 5 elementos cada uno
        
        for( int i = 0; i < aiArreX.length; i++){ //Ciclo for para el primer arreglo
            for( int j = 0; j < aiArreX[i].length; j++){ //Ciclo for aninado para el segundo arreglo
                for( int k = 0; k < aiArreX[i][j].length; k++){ //Ciclo for aninado para el tercer arreglo
                    for( int l = 0; l < aiArreX[i][j][k].length; l++){ //Ciclo for anidado para el cuarto arreglo
                        for( int m = 0; m < aiArreX[i][j][k][l].length; m++) //Ciclo for anidado para el quinto arreglo
                        aiArreX[i][j][k][l][m] = (int)(Math.random() *100 + 1);{ //Se llena con valores aleatorios del 1 al 100
                            
                        }
                    }
                }
            }
        }
     for( int i = 0; i < aiArreX.length; i++){ //Primer for para empezar a recorrer los valores
            for( int j = 0; j < aiArreX[i].length; j++){ //Segundo for para empezar a recorrer los valores del primer y segundo arreglo
                for( int k = 0; k < aiArreX[i][j].length; k++){ //Tercer for para empezar a recorrer los valores del primero, segundo y tercer arreglo
                    for( int l = 0; l < aiArreX[i][j][k].length; l++){ //Cuarto for para empezar a recorrer los valores del primero, segundo, tercero y cuarto arreglo
                        for( int m = 0; m < aiArreX[i][j][k][l].length; m++){ //Quinto for para empezar a recorrer los valores del primero, segundo, tercero , cuarto y quinto arreglo
                            System.out.print("[" + aiArreX[i][j][k][l][m] + "]"); //Se imprimen todos los valores de los arreglos
                        }
    
    }
    
}
            }
     System.out.println("");
     }
    }
}
