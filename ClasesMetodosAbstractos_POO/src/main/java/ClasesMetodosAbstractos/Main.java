/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesMetodosAbstractos;

/**
 *
 * @author choko
 */
public class Main {

    public static void main(String[] Args) {
        Planta planta = new Planta();
        planta.alimentarse();
        AnimalCarnivoro carnivoro = new AnimalCarnivoro();
        carnivoro.alimentarse();
        AnimalHervivoro hervivoro = new AnimalHervivoro();
        hervivoro.alimentarse();

    }

}
