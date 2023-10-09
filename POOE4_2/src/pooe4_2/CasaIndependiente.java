/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooe4_2;

/**
 *
 * @author simon
 */
public class CasaIndependiente extends CasaUrbana {
    protected static double valArea = 3000000;
    
    public  CasaIndependiente(int idInmo, int area, 
        String dir, int numHab, int numBanos, int 
        numPisos){
        // Invoca al constructor de la clase padre
        super(idInmo, area, dir, 
        numHab, numBanos, numPisos);
        }
    
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
        }
}
