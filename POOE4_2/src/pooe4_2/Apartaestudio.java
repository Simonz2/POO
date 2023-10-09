/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooe4_2;

/**
 *
 * @author simon
 */
public class Apartaestudio extends Apartamento{
    protected static double valArea = 1500000;
    
    public  Apartaestudio(int idInmo, int area, String 
        dir, 
        int numHab, int numBanos){
        // Invoca al constructor de la clase padre
        // Los apartaestudios tienen una sola habitación y un solo baño
        super(idInmo, area, dir, 1, 1);
        }
    
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
        }
}
