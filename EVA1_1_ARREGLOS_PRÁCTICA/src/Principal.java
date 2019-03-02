
import java.util.Scanner;
import javax.swing.JOptionPane;

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
        double desviacion = 0;
        double conteo = 0;
        Scanner sNum = new Scanner(System.in);

        double suma = 0;

        int matriz[], nFilas, nCol;
        Persona[] apDatos = new Persona[0];

        nCol = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la cantidad de edades a capturar"));

        matriz = new int[nCol];

        System.out.println("Digite la edad de la persona: ");

        for (int j = 0; j < nCol; j++) {
            System.out.print("\nMatriz [" + j + "]: ");
            matriz[j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la edad"));
            conteo = matriz[j];
        }

        System.out.println("\nLa edad de cada persona es: ");

        for (int j = 0; j < nCol; j++) {
            System.out.println(matriz[j]);
        }

        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i];
        }
        double media = (suma / matriz.length);

        System.out.println("La media es: " + media);

        double sumatoria;
        for (int i = 0; i < matriz.length; i++) {
            sumatoria = Math.pow(conteo - media, 2);

            desviacion = desviacion + sumatoria;
        }
        desviacion = desviacion / (nCol - 1);
        double Resu = Math.sqrt(desviacion);
        double redondeo = Math.rint(desviacion * 100) / 100;
        System.out.println("La desviación estándar es: " + redondeo);
    }

    class Persona {

        private String nombre;
        private String apellido;
        private int edad;
        private String carrera;

        public Persona() {
            nombre = "Christian";
            apellido = "Parra";
            edad = 19;
            carrera = "Sistemas";
        }

        public Persona(String nombre, String apellido, int edad, String carrera) {
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

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getCarrera() {
            return carrera;
        }

        public void setCarrera(String carrera) {
            this.carrera = carrera;
        }

    }
}
