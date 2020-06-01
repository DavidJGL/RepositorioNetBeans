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
public class Obra {
    //Atributos
    private String autor;
    private String titulo;
    private int year;
    String critica;
    // constructor
    public Obra(String autor, String titulo, int year, String critica) {
        this.autor = autor;
        this.titulo = titulo;
        this.year = year;
        this.critica = critica;

    }
    //Metodos set
    public void SetAutor(String autor) {
        this.autor = autor;
    }

    public void SetTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void SetYear(int year) {
        this.year = year;
    }
   
    //Metodos get
    public String getAutor(){
        return this.autor;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public int getYear(){
        return this.year;
    }
    public String getCritica(){
        return this.critica;
    }
    //Metodo mostrar
    public void mostrar(){
        System.out.println("Autor: " + this.autor);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Year: " + this.year);
        System.out.println("Critica: " + this.critica);
    }
    public void Valorar(){
        this.critica = critica;
    }
    
}
