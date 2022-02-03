/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2.entidades;

import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class Lavadora extends Electrodomesticos {
    private Integer carga;

    public Lavadora() {
        super();
    }

    public Lavadora(Integer carga, String color, String consumo, Integer peso, Integer precio) {
        super(color, consumo, peso, precio);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + super.toString() + "carga=" + carga + '}';
    }
    
    public void crearLavadora(Lavadora lavadora){
        super.crearElectrodomestico();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la capacidad de carga: ");
        carga=sc.nextInt();
        
        precioFinal(consumo, peso);
    }

    @Override
    public int precioFinal(String consumo, Integer peso) {
        super.precioFinal(consumo, peso); //To change body of generated methods, choose Tools | Templates.
    if (carga>30) {
        precio= precio + 500;
    }
        System.out.println("El precio final de la lavadora es: $"+ precio);
        return precio;
    }
    
    
    
}
