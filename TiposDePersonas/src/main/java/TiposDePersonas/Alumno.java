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
public class Alumno extends Persona{
    private int nAlumno;
    private String curso;

    public Alumno(String nombre, String apellidos, String nacionalidad, int edad, String casado, String numeroDNI, int nAlumno, String curso) {
        super(nombre, apellidos, nacionalidad, edad, casado, numeroDNI);
        this.nAlumno = nAlumno;
        this.curso = curso;
    }

    public void setnAlumno(int nAlumno) {
        this.nAlumno = nAlumno;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getnAlumno() {
        return nAlumno;
    }

    public String getCurso() {
        return curso;
    }
    @Override
    public void mostrarDatos(){
        System.out.println("\nNombre: " + super.getNombre());
        System.out.println("Apellido: " + super.getApellidos());
        System.out.println("Nacionalidad: " + super.getNacionalidad());
        System.out.println("Edad: " + super.getEdad());
        //System.out.println("Estado civil: " + super.getCasado());
        System.out.println("D.N.I.: " + super.getNumeroDNI());
        System.out.println("Codigo Alumno: " +this.nAlumno);
        System.out.println("Curso: " +this.curso);
        
    }
}
