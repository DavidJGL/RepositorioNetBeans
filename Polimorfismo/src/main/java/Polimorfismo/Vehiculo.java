/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author choko
 */
public class Vehiculo implements Utilidad{

    //Atributos
    protected String matricula;
    protected String marca;
    protected String modelo;

    //Constructor
    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    //Metodos Getters
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    //Metodo mostrar
    public String mostrarDatos() {
        //En este metodo retornaremos lo siguiente:
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo;

    }
    @Override
    public String mostrarUtilidad(){
        return "Este es mi coche";
        
    }
    
    

}
