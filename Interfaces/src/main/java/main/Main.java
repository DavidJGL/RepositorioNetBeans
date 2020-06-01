package main;

import datos.*;

public class Main {

    public static void main(String[] args) {
        AccesoDatos datos2 = new ImplementacionPortatilA();
        datos2.introducirDatos();
        AccesoDatos datos1 = new ImplementacionPortatilB();
        datos1.introducirDatos();

    }

}
