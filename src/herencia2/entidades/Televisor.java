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
public class Televisor extends Electrodomesticos {

    private Integer resolucion;
    private Boolean sintonizador;

    public Televisor() {
        super();
    }

    public Televisor(Integer resolucion, Boolean sintonizador, String color, String consumo, Integer peso, Integer precio) {
        super(color, consumo, peso, precio);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(Boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public String toString() {
        return "Televisor{" + super.toString() + "resolucion=" + resolucion + ", sintonizador=" + sintonizador + '}';
    }

    public void crearTelevisor(Televisor tv) {
        super.crearElectrodomestico();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la resolución (en pulgadas): ");
        resolucion = sc.nextInt();
        System.out.println("Posee sintonizador TDT (Si/No)?: ");
        String sint = sc.next();
        comprobarSintonizador(sint);
        precioFinal(consumo, peso);
    }

    public boolean comprobarSintonizador(String sint) {
        return sint.equalsIgnoreCase("si");
        }

    @Override
    public int precioFinal(String consumo, Integer peso) {
        super.precioFinal(consumo, peso);
        //To change body of generated methods, choose Tools | Templates.
        if (resolucion>40){
            precio= precio + (precio *30/100);
        }
        
        if (sintonizador=true){
            precio=precio + 500;
        }
        System.out.println("El precio final del televisor es: $"+ precio);
        return precio;
    }
    
    }



    




