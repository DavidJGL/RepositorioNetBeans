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
public class Main {
    public static void main(String [] args){
        //Se crea un arreglo reservando memora para 4 vehiculos
        Vehiculo misVehiculos[] = new Vehiculo[4];
        //A partir de este momento se hara uso del polimorfismo
        //En la posicion [0] se instaciará con un vehiculo de la clase Padre (Vehiculo) 
        misVehiculos[0]= new Vehiculo("1169GPV", "Citroen", "Xara Picasso");
        //En la posicion [1] se instaciará con un hijo vehiculo de la clase Padre (Vehiculo)
        misVehiculos[1]= new VehiculoTurismo(5,"2547LCI", "Skoda", "Fabia");
        //En la posicion [2] se instaciará con un hijo vehiculo de la clase Padre (Vehiculo)
        misVehiculos[2] = new VehiculoDeportivo(500, "5474MMN", "BMW", "Z1");
        ////En la posicion [3] se instaciará con un hijo vehiculo de la clase Padre (Vehiculo)
        misVehiculos[3] = new VehiculoFurgon(2500, "0214ALS", "Ford", "Transit");
        
        //Ciclo for each
        for(Vehiculo Vehiculos: misVehiculos){
            System.out.println(Vehiculos.mostrarDatos());
            System.out.println(Vehiculos.mostrarUtilidad());
            System.out.println("");
            
        }
    }
    
}
