/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooe4_2;

/**
 *
 * @author simon
 */
public class inmueblesvivienda extends inmueble{
   protected int numHab; 
   protected int numBanos;
   
   public inmueblesvivienda(int idInmo, int area,
           String dir,int numHab, int numBanos) {
    super(idInmo, area, dir); /* Invoca al 
    constructor de la clase padre */
    this.numHab = numHab;
    this.numBanos = numBanos;
    }
   
   void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println("Numero de habitaciones = " + 
    numHab);
    System.out.println("Numero de banos = " + numBanos);
    }
}

