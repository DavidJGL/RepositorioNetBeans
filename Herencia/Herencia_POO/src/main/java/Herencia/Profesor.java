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
public class Profesor extends Persona implements Objetivos{

    private int codigoProfesor;
    private String asignatura;

    public Profesor(String nombre, String apellido, int edad, int codigoProfesor, String asignatura) {
        super(nombre, apellido, edad);
        this.codigoProfesor = codigoProfesor;
        this.asignatura = asignatura;

    }

    public void setCodigoCodigoProfesor(int codigoCodigoProfesor) {
        this.codigoProfesor = codigoCodigoProfesor;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getCodigoCodigoProfesor() {
        return codigoProfesor;
    }

    public String getAsignatura() {
        return asignatura;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("\nNombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Codigo de Profesor: " + codigoProfesor);
        System.out.println("Asignatura: " + asignatura);

    }

    @Override
    public String mostrarObjetivos() {
        return "El profesor debe enseñar";

    }
}
