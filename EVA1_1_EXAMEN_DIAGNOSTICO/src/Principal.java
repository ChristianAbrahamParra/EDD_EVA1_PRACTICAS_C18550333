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
        // TODO code application logic here
        Primo pNum = new Primo(); //Objeto
        pNum.setNumero(7); //Se guarda el número 7 en el objeto
        pNum.esPrimo(); //El objeto guardará el valor de la clase esPrimo

        Primo pNum2 = new Primo(6997); //Segundo objeto
        pNum2.esPrimo(); //El objeto guardará el valor de la clase es primo
    }

}

class Primo { //Tiene acceso default

    private int numero; //Atributo que tenga get y set tiene que ser privado

    public Primo() { //Se inserta el constructor sin parámetro
    }

    public Primo(int numero) { //Constructor
        this.numero = numero; //Método this generado automáticamente
    }

    public int getNumero() {
        return numero; //método return generado automáticamente para regresar el número
    }

    public void setNumero(int numero) { //Constructor con parámetro de tipo entero
        this.numero = numero; //método this que se iguala al númmero
    }

    public void esPrimo() { //Método que no regresa nada
        String sMensa = numero + " Es primo"; // sMensa es de tipo cadena y se enviará al system.out.println
        for (int i = 2; i < numero; i++) { //ciclo flor mientras i = 2, i menor al número otorgado, aumenta
            if((numero % i) == 0) { //Si el residuo es igual a cero, entonces no es primo
                sMensa = numero + "No es primo"; //Mensaje que se pasará all system.out.println si el número no es primo
                break; //break para cortar la condición y dejar que siga avanzando
            }
        }
        System.out.println(sMensa); //Mensaje de salida que contiene sMensa, el cual dirá si el número es primo o no
    }

}
