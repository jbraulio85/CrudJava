
package org.braulioecheverria.models;

/**
 *
 * @author jbmon
 */
public class Profesor {
    public String nombres;
    public String apellidos;
    public int id;
    public int telefono;
    
    public Profesor(){
        
    }
    
    public Profesor(String nombres, String apellidos, int id, int telefono){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.id = id;
        this.telefono = telefono;
    }
    
    @Override
    public String toString(){
        return "Los datos del profesor son,  Nombres: " + nombres + 
                " " + apellidos + " Id: " + id + " Telefono: " + telefono;
    }
}
