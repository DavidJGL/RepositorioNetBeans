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
//Hay que indicar que la clase estudiante hereda de la clase persona.
// añadiendo la palabla reservada "extends" despues del nombre de la clase hija.
// de este modo herederá todos los atributos y metodos de la clase padre
public class Estudiante extends Persona implements Objetivos {
    //Atributos 
    private int codigoEstudiante;
    private float notaFinal;

    //Metodo constructor de la clase
    //Parámetros del constructor: (String nombre,String apellido,int edad)
    //Heredados de la clase padre + los atributos propios de la clase hija.
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
        //Con la palabra reservada "super" indicamos a java que dichos atributos
        //ya estan inicializados dentro de la clase Padre(Persona).
        super(nombre, apellido, edad);
        //Por lo tanto solo hara falta inicializar los atributos correspondiestes
        //a la clase hija (Estudiante).
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public float getNotaFinal() {
        return notaFinal;
    }
    

    //Los metodos Get ya los hereda de la clase Padre(Persona), por lo tanto no 
    //hace falta ponerlos.
    //Metodo propio de la clase Hija (Estudiante).
    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Codigo de Estudiante: " + codigoEstudiante);
        System.out.println("Notal Final: " + notaFinal);

    }
    @Override
    public String mostrarObjetivos(){
        return "El estudiante debe estudiar";
        
    }

}
