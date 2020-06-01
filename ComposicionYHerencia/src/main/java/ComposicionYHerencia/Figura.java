/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComposicionYHerencia;

/**
 *
 * @author choko
 */
public class Figura extends Punto {

    private double punto;

//Metodo Constructor
    public Figura(double coordenadaX, double coordenadaY, double punto) {
        super(coordenadaX, coordenadaY);
        this.punto = punto;

    }
    //Metodo Set

    public void setPunto(double punto) {
        this.punto = punto;
    }
    //Metodo Get

    public double getPunto() {
        return punto;
    }
    
    //Metodo
    public void mostrarPosicion(){
        System.out.println("La posicion de la figura es: " +this.punto);
    }

    
    

}
