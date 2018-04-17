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
public class Alumno extends Persona{
    protected int registro;
    protected String carrera;

    public Alumno(int registro, String carrera) {
        this.registro = registro;
        this.carrera = carrera;
    }

    public Alumno() {
        registro= 01;
        carrera="sn car";
    }
    

    public Alumno(int registro, String carrera, String cabeza, int brazos, int piernas, String nombre) {
        super(cabeza, brazos, piernas, nombre);
        this.registro = registro;
        this.carrera = carrera;
    }
    
    
    
}
