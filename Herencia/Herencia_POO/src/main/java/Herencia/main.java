/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author choko
 */
public class main {
    public static void main(String[] args){
        //Se crea un objeto de la clase estudiante con todos los parametros
        Estudiante estudiante = new Estudiante("David", "Garcia", 42,101, 7.33f);
        //necesarios para inicializar un objeto estudiante.
        estudiante.mostrarDatos();
        System.out.println(estudiante.mostrarObjetivos());
        //Se crea un objeto de la clase profesor con todos los parametros
        Profesor profesor = new Profesor("Luis", "Alvarez", 53, 29, "Fisica");
        profesor.mostrarDatos();
        System.out.println(profesor.mostrarObjetivos());
        
    }
    
}
