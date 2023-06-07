
package org.braulioecheverria.system;

import java.util.Scanner;
import org.braulioecheverria.controllers.ProfesorController;

/**
 *
 * @author jbmon
 */
public class Main {

    public static void main(String[] args) {
        int op1, op2;
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        ProfesorController profesor = new ProfesorController();
        
        while(flag == true){
            System.out.println("Qué deseas hacer?");
            System.out.println("1. Agregar Profesor.");
            System.out.println("2. Listar profesores.");
            System.out.println("3. Buscar profesor");
            System.out.println("4. Actualizar profesor");
            System.out.println("5. Eliminar profesor");
            op1 = leer.nextInt();
            
            switch(op1){
                case 1: 
                    profesor.agregarProfesor();
                    System.out.println("Deseas continuar: 1. para si, 2. para no.");
                    op2 = leer.nextInt();
                    flag = menuRepetir(op2);
                    break;
                case 2:
                    profesor.listarProfesores();
                    System.out.println("Deseas continuar?: 1. para si, 2. para no");
                    op2 = leer.nextInt();
                    flag = menuRepetir(op2);
                    break;
                case 3:
                    System.out.println("Ingresa el ID del profesor a buscar");
                    int id = leer.nextInt();
                    System.out.println(profesor.buscarProfesor(id));
                    System.out.println("Deseas continuar? 1. para si, 2. para no");
                    op2 = leer.nextInt();
                    flag = menuRepetir(op2);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    System.out.println("Deseas continuar: 1. para si, 2. para no.");
                    op2 = leer.nextInt();
                    flag = menuRepetir(op2);
                    break;
            }
        }
    }
    
    public static boolean menuRepetir(int op){
        boolean flag = true; 
        if(op == 2){
            flag = false;
        }else{
            flag = true;
        }
        return flag;
    }
}
