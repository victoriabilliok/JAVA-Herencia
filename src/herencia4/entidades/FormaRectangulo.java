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
public class FormaRectangulo implements calculosFormas {
    private Double base;
    private Double altura;
    private Double area;
    private Double perimetro;


    @Override
    public void calcularArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base en cm:");
        base = sc.nextDouble();
        System.out.println("Ingrese la altura en cm");
        altura= sc.nextDouble();
        
        area = base * altura;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = (base + altura)*2;
    }
    
    @Override
    public String toString() {
        return "Rectangulo{" + "area=" + area + " cm2, perimetro=" + perimetro +" cm"+ '}';
    }
}
