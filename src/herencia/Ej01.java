/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import herencia.entidades.Animal;
import herencia.entidades.Caballo;
import herencia.entidades.Gato;
import herencia.entidades.Perro;

/**
 *
 * @author Vicky
 */
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal perro = new Perro("Stitch", "Carnívoro", 10, "Doberman");
        Animal perro1 = new Perro("Perro", "BARF", 2, "Mestizo");
        perro.mostrarAlimento();
        perro1.mostrarAlimento();
        
        Animal gato = new Gato("Michi", "Carnívoro", 4, "Naranjoso");
        gato.mostrarAlimento();

        Animal caballo = new Caballo("Spirit", "Hervíboro", 5, "Árabe");
        caballo.mostrarAlimento();

    }

}
