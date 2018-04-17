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
public class Alumno_especial extends Alumno{
    private int nro_cretificado_discapacidad;
    private String discapacidad;

    public Alumno_especial() {
        nro_cretificado_discapacidad=-1;
        discapacidad="sin especificar";
    }

    public Alumno_especial(int nro_cretificado_discapacidad, String discapacidad, int registro, String carrera, String cabeza, int brazos, int piernas, String nombre) {
        super(registro, carrera, cabeza, brazos, piernas, nombre);
        this.nro_cretificado_discapacidad = nro_cretificado_discapacidad;
        this.discapacidad = discapacidad;
    }
    
    @Override
    public void andar(){
        System.out.println("andando desde alumno especial");
    }
    
}
