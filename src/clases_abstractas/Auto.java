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
public class Auto extends Vehiculo {

    public Auto() {
        super(4,false,6);
    }
    
    
    @Override
    public void mantenimiento() {
        System.out.println("dando mantenimiento a auto");
    }
    
    
}
