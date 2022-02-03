/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4.entidades;

import herencia4.interfaces.calculosFormas;
import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class FormaCirculo implements calculosFormas {

    private Double radio;
    private Double diametro;
    private Double area;
    private Double perimetro;

    @Override
    public void calcularArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio en cm:");
        radio = sc.nextDouble();

        area = PI * Math.pow(radio, 2);
    }

    @Override
    public void calcularPerimetro() {

        diametro = radio * 2;

        perimetro = PI * diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "area=" + area + " cm2, perimetro=" + perimetro + " cm" + '}';
    }
}
