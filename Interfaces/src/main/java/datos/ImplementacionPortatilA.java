package datos;

public class ImplementacionPortatilA implements AccesoDatos {
    //Agregar la implementacion de los metodos definidos en la interface

    @Override
    public void introducirDatos() {
        System.out.println("Introducir datos desde Portatil A");

    }

    @Override
    public void mostrarDatos() {
        System.out.println("Mostrar datos desde Portatil B");

    }

}
