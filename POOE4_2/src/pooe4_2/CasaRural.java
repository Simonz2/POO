/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooe4_2;

/**
 *
 * @author simon
 */
public class CasaRural extends Casa{
    protected static double valArea = 1500000;
    protected int disCa;
    protected int altitud;
    
    public CasaRural(int idInmo, int area, String 
        dir, int numHab, int numBanos, int 
        numPisos, int disCa, int altitud) {
        // Invoca al constructor de la clase padre
        
        super(idInmo, area, dir, 
                numHab,numBanos, numPisos);
        
        this.disCa = disCa;
        this.altitud = altitud;
        }
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Distancia la cabecera municipal = " + 
        disCa + " km.");
        System.out.println("Altitud sobre el nivel del mar = " + altitud + 
        " metros.");
        System.out.println();
        }
    
}
