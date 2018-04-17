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
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Alumno a=new Alumno(2005, "ing sis");
        System.out.println(a.nombre);
        a.hablar();*/
        
        Alumno_especial ae =new Alumno_especial();
        
        ae.hablar();
        ae.andar();
        
    }
    
}
