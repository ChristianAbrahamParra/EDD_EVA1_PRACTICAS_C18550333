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

        int[] arreglo = new int[100]; //Se crea un arreglo de 100 valores
        int pares = 0; //se inicializa la variable en cero en la clase
        int impares = 0; //se inicializa la variable impares en la clase

        for (int i = 0; i < arreglo.length; i++) { //ciclo for para empezar a contar los valores
            arreglo[i] = (int) (Math.random() * 100 + 1); //Se asignan valores del 1 al 100 aleatorios

            if (arreglo[i] % 2 == 0) { //Si el residuo del número es cero, entonces es par
                pares++; //aumenta
            } else { //si no es cero el residuo, entonces es impar
                impares++; //aumenta
            }
        }
        int[] par = new int[pares]; //Se crea un segundo arreglo para el conteo de los números pares
        int[] impar = new int[impares]; //Se crea otro arreglo para el conteo de los números impares

        pares = 0;
        impares = 0;

        for (int i = 0; i < 100; i++) { //Ciclo for paraempezar a contar los números
            if (arreglo[i] % 2 == 0) { //Si el número tiene residuo, entonces es par,
                par[pares] = arreglo[i]; //el número se guarda en la variable 
                pares++; //El conteo de los pares aumenta
            } else { //si no
                impar[impares] = arreglo[i]; //El arreglo para el conteo de impares de iguala al arreglo original
            }
        }

        System.out.println("Números pares: "); //Mensaje de salida para números pares
        for (int i = 0; i < pares; i++) { //Ciclo for para contar los números pares
            System.out.print("[" + par[i] + "]"); //Mensaje de salida para imprimir los valores del arreglo
        }
        System.out.println(""); //Mensaje vacío

        System.out.println("Impares: "); //Mensaje de salida para números impares
        for (int i = 0; i < impares; i++) { //Ciclo for para contar los números impares
            System.out.print("[" + impar[i] + "]"); //Mensaje de salida para imprimir los valores del arreglo
        }
        System.out.println(""); //Mensaje vacío
    }

}
