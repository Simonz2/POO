/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooe4_2;

/**
 *
 * @author simon
 */
public class Casa extends inmueblesvivienda{
    protected int numPisos;
    
    public Casa(int idInmo, int area, String dir, 
    int numHab, int numBanos, int numPisos) {
    // Invoca al constructor de la clase padre
    super(idInmo, area, dir,
            numHab, numBanos);
    this.numPisos = numPisos;
    }
    
    void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    System.out.println("Numero de pisos = " + numPisos);
    }
}
