/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavenproject1.obra;

/**
 *
 * @author choko
 */
public interface Vendible {

    public static final String MONEDA = "Euros";

    public abstract boolean hayStock();

    public abstract void vender(int cantidad) throws Excepcion;

    public abstract int verStock();

    public abstract double verPrecio();

    public abstract void cambiarPrecio(double precio);

    public abstract int recibirPedido(int cantidad);

}
