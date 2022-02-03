/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import herencia2.entidades.Electrodomesticos;
import herencia2.entidades.Lavadora;
import herencia2.entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Vicky
 */
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lavadora lavadora = new Lavadora(80, "blanco", "a", 50, 900);
        Lavadora lavadora2 = new Lavadora(60, "negro", "f", 30, 1000);
        //lavadora.crearLavadora(lavadora);
        
        //System.out.println(lavadora.toString());

        Televisor tv = new Televisor(40, true, "negro", "b", 67, 15000);
        Televisor tv2 = new Televisor(32, false, "verde", "a", 50, 1200);
        //tv.crearTelevisor(tv);

        //System.out.println(tv.toString());

        ArrayList <Electrodomesticos> electro = new ArrayList ();
        electro.add(tv);
        electro.add(tv2);
        electro.add(lavadora);
        electro.add(lavadora2);
        
        int precioFull=0;
        
        for (int i=0; i<electro.size();i++){
           precioFull=precioFull+ electro.get(i).precioFinal(electro.get(i).getConsumo(), electro.get(i).getPeso());
        }
        
        System.out.println("\nEl precio de la lista de electros es: "+precioFull);
        
        
        System.out.println("\nLista de lavadoras");
        for (Electrodomesticos L : electro) {
            if (L instanceof Lavadora){
                System.out.println(L.toString());
            }
        }
        
        System.out.println("\nLista de televisores");
        for (Electrodomesticos T : electro) {
            if (T instanceof Televisor){
                System.out.println(T.toString());
            }
        }
        
    }
}
