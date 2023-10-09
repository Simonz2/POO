/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooe4_2;

/**
 *
 * @author simon
 */
public class Apartamentofamiliar extends Apartamento{
    
    protected static double valArea = 2000000;
    protected int valAdmin;
    
    
    public  Apartamentofamiliar(int idInmo, int area, 
        String dir, int numHab, int numBanos, int 
        valAdmin){
        // Invoca al constructor de la clase padre
        super(idInmo, area, dir, 
        numHab, numBanos);
        this.valAdmin = valAdmin;
        }
    
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administracion = $" + 
        valAdmin);
        System.out.println();
        }
    
}
