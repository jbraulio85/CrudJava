package org.braulioecheverria.controllers;

import java.util.ArrayList;
import java.util.Scanner;
import org.braulioecheverria.models.Profesor;

/**
 *
 * @author jbmon
 */
public class ProfesorController {
    ArrayList<Profesor> profesores = new ArrayList<Profesor>();    
    
    public ProfesorController(){
        
    }
    
    public void agregarProfesor(){
        Scanner leer = new Scanner(System.in);
        Profesor profesor = new Profesor();
        System.out.println("Ingresa el nombre del profesor:");
        profesor.nombres = leer.nextLine();
        System.out.println("Ingresa los apellidos: ");
        profesor.apellidos = leer.nextLine();
        System.out.println("Ingresa el ID:");
        profesor.id = leer.nextInt();
        System.out.println("Ingresa el telefono:");
        profesor.telefono = leer.nextInt();
        profesores.add(profesor);
    }
    
    public void listarProfesores(){
        for(int contador = 0; contador < profesores.size(); contador++){
            System.out.println(profesores.get(contador));
        }
    }
    
    public Profesor buscarProfesor(int id){
        Profesor profesorEncontrado = new Profesor();
        Profesor mostrarProfesor = new Profesor();
        for(int contador = 0; contador < profesores.size(); contador++){
            profesorEncontrado = profesores.get(contador);
            if(profesorEncontrado.id == id){
                mostrarProfesor = profesorEncontrado;
            }
        }
        return mostrarProfesor;
    }
    
    public Profesor actualizarProfesor(int id){
        Scanner leer = new Scanner(System.in);
        Profesor profesorEncontrado = new Profesor();
        Profesor profesorActualizado = new Profesor();
        for(int contador = 0; contador < profesores.size();contador++){
            profesorEncontrado = profesores.get(contador);
            if(profesorEncontrado.id == id){
                profesorActualizado = profesorEncontrado;
                profesores.remove(contador);
            }
        }
        
        System.out.println("Los datos el profesor que buscas son:");
        System.out.println(profesorEncontrado.toString());
        System.out.println("----------------------------------------------------------------");
        System.out.println("INGRESA LOS NUEVOS DATOS");
        System.out.println("NOMBRES:");
        profesorActualizado.nombres = leer.nextLine();
        System.out.println("APELLIDOS:");
        profesorActualizado.apellidos = leer.nextLine();
        System.out.println("TELEFONO");
        profesorActualizado.telefono = leer.nextInt();
        System.out.println("Estas seguro que seas actualizar?");
        System.out.println("1. para si, 2. para no");
        int eleccion = leer.nextInt();
        if(eleccion == 1){
            System.out.println("Datos Actualizados exitosamente");
            profesorEncontrado = profesorActualizado;
            profesores.add(profesorEncontrado);
        }else{
            System.out.println("No se realizaron cambios");
            profesores.add(profesorEncontrado);
        }
        return profesorEncontrado;
    }
    
    public String eliminarProfesor(int id){
        String respuesta = "";
        Profesor profesorEncontrado = new Profesor();
        for(int contador = 0; contador < profesores.size();contador++){
            profesorEncontrado = profesores.get(contador);
            if(profesorEncontrado.id == id){
                profesores.remove(contador);
                respuesta = "Profesor Eliminado Exitosamente!!!!";
            }
        }
        return respuesta;
    }
}
