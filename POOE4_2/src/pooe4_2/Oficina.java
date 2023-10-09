/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooe4_2;

/**
 *
 * @author simon
 */
public class Oficina extends Local{
    protected static double valArea = 3500000;
    protected boolean esGob;
    
    public Oficina(int idInmo, int area, String 
        dir, tipo tipoLocal, boolean esGob) {
        // Invoca al constructor de la clase padre
        super(idInmo, area, dir, tipoLocal);
        this.esGob = esGob;
        }
    
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Es oficina gubernamental = " + esGob);
        System.out.println();
        }
    
}
