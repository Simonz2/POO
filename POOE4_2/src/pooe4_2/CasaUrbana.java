/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooe4_2;

/**
 *
 * @author simon
 */
public class CasaUrbana extends Casa{
    
    public CasaUrbana(int idInmo, int area, String 
        dir, int numHab, int numBanos, int 
        numPisos) {
        // Invoca al constructor de la clase padre
        super(idInmo, area, dir, numHab, numBanos, numPisos);
        }
    
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        }
}
