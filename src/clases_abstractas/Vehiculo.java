/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_abstractas;

/**
 *
 * @author cespe
 */
public abstract class Vehiculo {
    protected int cantidad_llantas;
    protected boolean caja_mec;
    protected int cantidad_marchas;

    public Vehiculo() {
    }

    public Vehiculo(int cantidad_llantas, boolean caja_mec, int cantidad_marchas) {
        this.cantidad_llantas = cantidad_llantas;
        this.caja_mec = caja_mec;
        this.cantidad_marchas = cantidad_marchas;
    }
    
    public void andar(){
        // no ponemos protected por la clase cliente no podra acceder a ella por que la clase es 
        // abstracta
        System.out.println("andando desde vehiculo");
    }
    
    public abstract void mantenimiento();
    
    
}
