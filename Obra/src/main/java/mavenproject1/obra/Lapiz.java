/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavenproject1.obra;

import java.util.Scanner;

/**
 *
 * @author choko
 */
public class Lapiz implements Vendible{
    Scanner entrada = new Scanner (System.in);
    
    //Atributos adicionales: marca, grosor, cantidad, precio
    private String marca;
    private int grosor;
    private int cantidad;
    private double precio;

    //Constructor
    public Lapiz(String marca, int grosor) {
        this.marca = marca;
        this.grosor = grosor;

    }

    //Metodos Set
    public void Setmarca(String marca) {
        this.marca = marca;
    }

    public void Setgrosor(int grosor) {
        this.grosor = grosor;

    }

    public void Setcantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void Setprecio(double precio) {
        this.precio = precio;
    }

    //Metodos Get
    public String Getmarca() {
        return this.marca;

    }

    public int Getgrosor() {
        return this.grosor;
    }

    public int Getcantidad() {
        return this.cantidad;
    }

    public double Getprecio() {
        return this.precio;
    }
    
    @Override
    public boolean hayStock() {
        boolean hayStock = false;
        if (this.cantidad > 0) {
            hayStock = true;
        } else {
            hayStock = false;
        }
        return hayStock;
    }

    @Override
    public void vender(int cantidad) throws Excepcion {
        if (this.cantidad > cantidad) {
            this.cantidad = this.cantidad - cantidad;
        } else {
            throw new Excepcion("No hay suficiente stock");
        }
    }

    @Override
    public int verStock() {
        return this.cantidad;
    }

    @Override
    public double verPrecio() {
        return this.precio;
    }

    @Override
    public void cambiarPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int recibirPedido(int cantidad) {
        this.cantidad = this.cantidad + cantidad;
        return this.cantidad;
    }

}
