/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposDePersonas;

/**
 *
 * @author choko
 */
public class Profesor extends Persona {

    private int nProfesor;
    private String materia;

    public Profesor(String nombre, String apellidos, String nacionalidad, int edad, String casado, String numeroDNI, int nProfesor, String materia) {
        super(nombre, apellidos, nacionalidad, edad, casado, numeroDNI);
        this.nProfesor = nProfesor;
        this.materia = materia;

    }

    public void setnProfesor(int nProfesor) {
        this.nProfesor = nProfesor;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getnProfesor() {
        return nProfesor;
    }

    public String getMateria() {
        return materia;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Apellido: " + super.getApellidos());
        System.out.println("Nacionalidad: " + super.getNacionalidad());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Estado civil: " + super.getCasado());
        System.out.println("D.N.I.: " + super.getNumeroDNI());
        System.out.println("Codigo Profesor: " + this.getnProfesor());
        System.out.println("Codigo Profesor: " + this.getMateria());

    }

}
