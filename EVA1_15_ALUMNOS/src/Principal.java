
import java.util.Scanner;
import javax.swing.JOptionPane;

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
        
        Scanner sNum = new Scanner(System.in); //Clase Scanner para introducir valores del teclado
        
        int matriz[][], nFilas, nCol; //Se declara una matriz de tipo entero y variables para las filas y columnas
        Alumno[][] apDatos = new Alumno[0][]; //Se declara un nuevo arreglo
    
        nFilas = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el número de grupos")); //El usuario introduce el número de filas que quiere
        nCol = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la cantidad de alumnos")); //El usuario introduce el número de columnas que quiere
        String nombre = JOptionPane.showInputDialog(null, "Escriba el nombre del alumno:"); //El usuario introduce el nombre del alumno
        
        matriz = new int[nFilas][nCol]; //Se rellena la matriz con el número de filas y columnas de acuerdo a lo que el usuario introdujo
        
        System.out.println("Digite la edad del alumno: "); //Mensaje para introducir edad
        for(int i=0; i< nFilas; i++){ //Ciclo for  para el número de filas
            for(int j=0; j<nCol; j++){ //Ciclo for anidado para el número de columnas
                System.out.print("Matriz ["+i+"]["+j+"]: "); //Se imprimen los valores de la matriz
                matriz[i][j] = sNum.nextInt(); //El usuario introduce la edad de cada alumno y se convierte a int
                
            }
        }
        System.out.println("\nEl nombre y la edad es: "); //Mensaje de nombre y edad
        for(int i = 0; i<nFilas; i++){ //Ciclo for para el número de filas
            for(int j=0; j<nCol; j++){ //Ciclo for anidado para el número de columnas
                System.out.println(nombre + " " + matriz[i][j]); //Mensaje para mostrar el nombre y la edad del alumno
            }
            
            System.out.println("");
        }
        
    }
    
class Alumno{
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    
public Alumno(){
    nombre = "Christian";
    apellido = "Parra";
    edad = 19;
    carrera = "Sistemas";
}   

        public Alumno(String nombre, String apellido, int edad, String carrera) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad; 
            this.carrera = carrera;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public int getNumControl() {
            return edad;
        }

        public void setNumControl(int numControl) {
            this.edad = numControl;
        }

        public String getCarrera() {
            return carrera;
        }

        public void setCarrera(String carrera) {
            this.carrera = carrera;
        }

}
}
//Preguntar cuantos grupos tiene
//de cada grupo preguntar la cantidad de alumnos
//para cada alumno (clase alumno)
//nombre y edad

//hay que usar matrices <--
