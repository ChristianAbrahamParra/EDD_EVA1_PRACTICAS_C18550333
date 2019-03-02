
import java.util.Scanner;

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
        
        Persona [] apDatos = new Persona [5]; //Arreglo de la clase persona con tamaño de 5
        //int [] aiDatos = new int[5];
        Scanner sCaptu = new Scanner(System.in); //Clase Scanner para introducir valores del teclado
        for(int i =0; i < apDatos.length; i++){ // Ciclo for para el arreglo apDatos
            apDatos[i] = new Persona(); //El arreglo apDatos se reserva memoria
            System.out.println("Nombre:"); //Mensaje de Nombre
            apDatos[i].setNombre(sCaptu.nextLine()); //Muestra el nombre con salto de línea
            System.out.println("Apellido");//Mensaje de Apellido
            apDatos[i].setApellido(sCaptu.nextLine()); //Muestra el apellido con un salto de línea
            System.out.println("Nacionalidad"); //Mensaje de Nacionalidad
            apDatos[i].setNacionalidad(sCaptu.nextLine()); //Muestra la nacionalidad con salto de línea
            System.out.println("Edad:"); //Mensaje de Edad
            apDatos[i].setEdad(sCaptu.nextInt()); //Muestra la edad con un salto de línea
            sCaptu.nextLine();
            
        }
    
        for(Persona apDato: apDatos){ //Se recorren los valores
            System.out.println("Datos de la persona:"); //Mensaje de datos de la persona
            System.out.println("Nombre completo: " + apDato.getNombre() + "" + apDato.getApellido()); //Mensaje que muestra el nombre y apellido
            System.out.println("Edad: " + apDato.getEdad()); //Mensaje que muestra la edad de la persona
            System.out.println("Nacionalidad " + apDato.getNacionalidad()); //Mensaje que muestra la nacionalidad de la persona
            System.out.println("--------"); //Líneas para apoyo visual
        }
    }
    
}

class Persona{ //Clase llamada Persona
    private String nombre; //Atribujo de tipo cadena nombre
    private String apellido; //Atributo dee tipo cadena apellido
    private int edad; //Atributo de tipo int edad
    private String nacionalidad; //atributo de tipo cadenna nacionalidad
    
    public Persona(){ //Constructor de la clase
        nombre = "Christian"; //Nombre = Christian
        apellido = "Parra"; //Apellido = Parra
        edad = 19; //Edad = 19
        nacionalidad = "Mexicana"; // Nacionalidad = Mexicana
    }

    public Persona(String nombre, String apellido, int edad, String nacionalidad) { //Constructor con parámetros nombre, apellido, edad, nacionalidad
        this.nombre = nombre; //Pasa la referencia de nombre
        this.apellido = apellido; //Pasa la referencia de apellido
        this.edad = edad; //Pasa la referencia de edad
        this.nacionalidad = nacionalidad; //Pasa la referencia de nacionalidad
    }

    public String getNombre() { //Método getNombre 
        return nombre; //Regresa el nombre
    }

    public void setNombre(String nombre) { //Método setNombre
        this.nombre = nombre; //Referencia del nombre y lo muestra
    }

    public String getApellido() { //Método getApellido
        return apellido; //Regresa el apellido
    }

    public void setApellido(String apellido) { //Método setApellido
        this.apellido = apellido; //Referencia del apellido
    }

    public int getEdad() { //Método getEdad
        return edad; //Regresa la edad
    }

    public void setEdad(int edad) { //Método setEdad
        this.edad = edad; //Referencia la edad
    }

    public String getNacionalidad() { //Método getNacionalidad
        return nacionalidad; //Regresa la nacionalidad
    }

    public void setNacionalidad(String nacionalidad) { //Método con parámetro setNacionalidad
        this.nacionalidad = nacionalidad; //Referencia la nacionalidad
    }


}