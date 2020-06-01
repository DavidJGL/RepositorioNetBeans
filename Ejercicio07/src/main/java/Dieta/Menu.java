/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dieta;

/**
Menu: String primerPlato, String segundoPlato, String postre, caloriasPorMenu, 
* pesoMenu de tipo entero ( agregar otros atributos y/o métodos a consideración 
* del alumno )
 */
public class Menu {
    private String primerPlato;
    private String segundoPlato;
    private String postre;
    private double caloriasPorMenu;
    private int pesoMenu;

    public Menu(String primerPlato, String segundoPlato, String postre, double caloriasPorMenu, int pesoMenu) {
        this.primerPlato = primerPlato;
        this.segundoPlato = segundoPlato;
        this.postre = postre;
        this.caloriasPorMenu = caloriasPorMenu;
        this.pesoMenu = pesoMenu;
    }

    public void setPrimerPlato(String primerPlato) {
        this.primerPlato = primerPlato;
    }

    public void setSegundoPlato(String segundoPlato) {
        this.segundoPlato = segundoPlato;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public void setCaloriasPorMenu(double caloriasPorMenu) {
        this.caloriasPorMenu = caloriasPorMenu;
    }

    public void setPesoMenu(int pesoMenu) {
        this.pesoMenu = pesoMenu;
    }

    public String getPrimerPlato() {
        return primerPlato;
    }

    public String getSegundoPlato() {
        return segundoPlato;
    }

    public String getPostre() {
        return postre;
    }

    public double getCaloriasPorMenu() {
        return caloriasPorMenu;
    }

    public int getPesoMenu() {
        return pesoMenu;
    }
    public void mostrarDatos(){
        
    }
    
}
