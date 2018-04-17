/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import clases_abstractas.Auto;
import clases_abstractas.Vehiculo;
import com.sun.org.apache.bcel.internal.generic.AASTORE;

/**
 *
 * @author cespe
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Alumno a=new Alumno(2005, "ing sis");
        System.out.println(a.nombre);
        a.hablar();*/
        
        /*Alumno_especial ae =new Alumno_especial();
        
        ae.hablar();
        ae.andar();*/
       
        Vehiculo v=new Auto();
       // v.mantenimiento();
        
        Auto auto=new Auto();
        auto.mantenimiento();
        auto.andar();
    }
    
}
