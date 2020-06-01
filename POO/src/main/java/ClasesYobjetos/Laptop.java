/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYobjetos;

/**
 *
 * @author choko
 */
public class Laptop {
    String marca;
    String procesador;
    int nprocesadores;
    int velProcesador;
    int ram;
    String soperativo;
    
    public static void main (String [] args){
        
        Laptop Equipo1 = new Laptop();
        
        Equipo1.marca = "Lenovo";
        Equipo1.procesador = "Intel Core i3";
        Equipo1.nprocesadores = 4;
        Equipo1.velProcesador = 2;
        Equipo1.ram = 4;
        Equipo1.soperativo = "Windows 10";
        
        System.out.println("La marca del Equipo1 es: " + Equipo1.marca);
        System.out.println("El tipo de Precesador del Equipo1 es: " + Equipo1.procesador);
        System.out.println("El numero de procesadores del Equipo1 es: " + Equipo1.nprocesadores);
        System.out.println("La velocidad de los precesadores del Equipo1 es de: " + Equipo1.velProcesador + " Ghz.");
        System.out.println("La memoria RAM del Equipo1 es de: " + Equipo1.ram + " Gb.");
        System.out.println("El sistema operativo del Equipo1 es: " + Equipo1.soperativo);
        
    }
    
    
}
