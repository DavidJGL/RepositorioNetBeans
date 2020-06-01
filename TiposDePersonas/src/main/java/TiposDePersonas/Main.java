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
public class Main {
    public static void main(String [] args){
        Profesor profesor = new Profesor("Eduardo", "Mendoza", "Español", 54, "Casado", "40258451L", 1254, "Matematicas");
        profesor.mostrarDatos();
        Direccion direccion = new Direccion("Eduardo", "Mendoza", "Español"
                , 54, "Casado","40258451L","Calle Cuarta nº24", "S/C. de Tenerife"
                ,"La Orotava", 38300, "España", 658472154, "papalote@voduu.com");
        direccion.mostrarDatos();
        Alumno alumno = new Alumno("Miguel","Hernandez","Ruso", 19, "Soltero", "47236458M", 100, "Primero de Bachillerato" );
        alumno.mostrarDatos();
        Direccion direccion2 = new Direccion("Mauel", "Hernandez", "Ucraniano"
                , 19, "Soltero","78254147","Calle Gladiolo S/n", "S/C. de Tenerife"
                ,"Puerto de la Cruz", 38400, "España", 687475214, "pasapalabra@ivoox.com");
        direccion2.mostrarDatos();
        
    }
    
}
