/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author cespe
 */
public class Persona {
    protected String cabeza;
    protected int brazos;
    protected int piernas;
    protected String nombre;

    public Persona() {
        cabeza="normal";
        brazos=2;
        piernas=2;
        nombre="sn";
    }

    public Persona(String cabeza, int brazos, int piernas, String nombre) {
        this.cabeza = cabeza;
        this.brazos = brazos;
        this.piernas = piernas;
        this.nombre = nombre;
    }

    protected void andar(){
        System.out.println("hablando desde persona");
    }
    
    protected void hablar(){
        System.out.println("hablando desde persona");
    }
    
    
}
