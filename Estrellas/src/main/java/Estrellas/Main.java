/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrellas;

/**
 *
 * @author choko
 */
public class Main {

    public static void main(String[] args) {
        
        TiposEstrella estrella1 = new TiposEstrella("Rojo", 1700, 3200, 0.3, 0.4, 0.9, 'M', "Próxima Centauri");
        estrella1.mostrarDatos();
        TiposEstrella estrella2 = new TiposEstrella("Amarillo Anaranjado", 3200, 4600, 0.8, 0.9, 1.3, 'k', "Alpha Centauri B");
        estrella2.mostrarDatos();
        TiposEstrella estrella3 = new TiposEstrella("Amarillo", 4600, 5700, 1.1, 1.1, 1.9, 'G', "Alfa Centauri A");
        estrella3.mostrarDatos();
        TiposEstrella estrella4 = new TiposEstrella("Blanco Amarillento", 5700, 7500, 1.7, 1.3, 2.5, 'F', "Canopus");
        estrella4.mostrarDatos();
        TiposEstrella estrella5 = new TiposEstrella("Blanco", 7100, 11000, 3.1, 2.1, 4.7, 'A', "Vega");
        estrella5.mostrarDatos();
        TiposEstrella estrella6 = new TiposEstrella("Blanco Azul", 15000, 28000, 18, 7, 7.0, 'B', "Beta Centauri");
        estrella6.mostrarDatos();
        TiposEstrella estrella7 = new TiposEstrella("Azul", 20000, 50000, 60, 15, 9.80, 'O', "Iota Orionis");
        estrella7.mostrarDatos();

    }
}
