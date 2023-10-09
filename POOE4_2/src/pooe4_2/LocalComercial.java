/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooe4_2;

/**
 *
 * @author simon
 */
public class LocalComercial extends Local{
    protected static double valArea = 3000000;
    protected String centroCom;
    
    public  LocalComercial(int idInmo, int area, String 
        dir, tipo tipoLocal, String centroCom){
        // Invoca al constructor de la clase padre
        super(idInmo, area, dir, tipoLocal);
        this.centroCom = centroCom;
        }
    
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Centro comercial = " + centroCom);
        System.out.println();
        }
}
