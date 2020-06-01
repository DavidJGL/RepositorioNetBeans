
package concesionario;
/*
Clase coche

Tiene: 

Matricula
Modelo
Color
Stock
Precio

Clase dueño
Tiene:
Dni
Nombre
Apellido1
Apellido2
Direccion 
Telefono

Main
Tiene.
Menu
Dar alta coche
Dar baja coche
(Unir coche con el dueño)esta es algo de pensar date cuenta que son dos arraylist hasta ahi te dejo
*/

public class Coche {
    //Atributos
    private String matricula;
    private String modelo;
    private String color;
    private int stock;
    private double precio;
    //Constructor
    public Coche(String matricula, String modelo, String color, int stock, double precio) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.stock = stock;
        this.precio = precio;
    }
    //Metodos getters
    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }
    //Metodo mostrar datos
    public String mostrarDatos(){
        
    }
    
    
    

    
}
