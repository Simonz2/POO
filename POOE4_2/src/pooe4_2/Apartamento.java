/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooe4_2;

/**
 *
 * @author simon
 */
public class Apartamento extends inmueblesvivienda{
    
    public Apartamento(int idInmo, int area, String 
    dir, int numHab, int numBanos) {
    // Invoca al constructor de la clase padre
    super(idInmo, area, dir, 
    numHab, numBanos);
    }
    
    void imprimir() {
    super.imprimir(); // Invoca al método imprimir de la clase padre
    }
}
