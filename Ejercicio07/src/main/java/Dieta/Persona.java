/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dieta;

/**
Persona: De tipo String: nombre, apellido1, apellido2. fechaNacimiento GregorianCalendar. 
* Y de tipo double peso ( agregar otros atributos y/o métodos a consideración del alumno )
 */
public class Persona extends Menu implements Alimentar {
    private String nombre, apellido1, apellido2;
    private String fechaNacimiento;
    private double peso;

    public Persona(String nombre, String apellido1, String apellido2, String fechaNacimiento, double peso, String primerPlato, String segundoPlato, String postre, double caloriasPorMenu, int pesoMenu) {
        super(primerPlato, segundoPlato, postre, caloriasPorMenu, pesoMenu);
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
    }
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }
    @Override
    public void mostrarDatos(){
        
    }

    @Override
    public String comer() {
        return this.nombre + " " + this.apellido1 + " " + this.apellido2 + " " + this.fechaNacimiento + " " + this.peso;
        
        
    }
    
}
