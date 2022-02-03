/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia4.entidades.FormaCirculo;
import herencia4.entidades.FormaRectangulo;

/**
 *
 * @author Vicky
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FormaCirculo circulo = new FormaCirculo();
        FormaRectangulo rectangulo = new FormaRectangulo();
        
        System.out.println("Circulo: ");
        circulo.calcularArea();
        circulo.calcularPerimetro();
        System.out.println("------Resultados------");
        System.out.println(circulo.toString());
        
        System.out.println("\nRectangulo: ");
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
        System.out.println("------Resultados------");
        System.out.println(rectangulo.toString());
    }
    
}
