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
public class Electrodomesticos {

    protected String color;
    protected String consumo;
    protected Integer peso;
    protected Integer precio;

    public Electrodomesticos(String color, String consumo, Integer peso, Integer precio) {
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
        this.precio = precio;
    }

    public Electrodomesticos() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" + "color=" + color + ", consumo=" + consumo + ", peso=" + peso + ", precio=" + precio + '}';
    }

    public boolean comprobarConsumo(String letra) {
        return letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("b") || letra.equalsIgnoreCase("c") || letra.equalsIgnoreCase("d") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("f");

    }

    public void comprobarColor(String colorElegido) {
        switch (colorElegido.toLowerCase()) {
            case "negro":
                color = colorElegido;
                break;
            case "azul":
                color = colorElegido;
                break;
            case "rojo":
                color = colorElegido;
                break;
            case "gris":
                color = colorElegido;
                break;
            case "blanco":
                color = colorElegido;
                break;
            default:
                color = "blanco";
        }
    }

    public void crearElectrodomestico() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el valor del producto: ");
        precio= sc.nextInt();
        if (precio< 1000) {
            precio=1000;
        }

        System.out.println("Ingrese el color: ");
        String colorElegido = sc.next();
        comprobarColor(colorElegido);

        System.out.println("Ingrese el consumo energético: ");
        String letra = sc.next();
        if (comprobarConsumo(letra)) {
            consumo = letra;
        } else {
            consumo = "f";
        }
        
        System.out.println("Ingrese el peso: ");
        peso= sc.nextInt();
  
    }
    
    public int precioFinal(String consumo, Integer peso){
    switch (consumo.toUpperCase()) {
            case "A":
                //precio = precio + 1000;
                precio += 1000;
                break;
            case "B":
                precio += 800;
                break;
            case "C":
                precio += 600;
                break;
            case "D":
                precio += 500;
                break;
            case "E":
                precio += 300;
                break;
            case "F":
                precio += 100;
                break;
        }
    
    if (peso >= 1 && peso <= 19) {
            precio+= 100;
        } else if (peso >= 20 && peso <= 49) {
            precio+= 500;
        } else if (peso >= 50 && peso <= 79) {
            precio+= 800;
        } else if (peso > 80) {
            precio+= 1000;
        }
    return precio;

}
}
