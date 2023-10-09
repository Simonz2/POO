/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooe4_2;

/**
 *
 * @author simon
 */
public class POOE4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

            
        Apartamentofamiliar apto1 = new 
        Apartamentofamiliar(103067,120,
        "Avenida Santander 45-45",3,2,200000);
        
        System.out.println("Datos apartamento");
        apto1.calcularPrecioVenta(apto1.valArea);
        apto1.imprimir();
        
        System.out.println("Datos apartamento");
        Apartaestudio aptestudio1 = new 
        Apartaestudio(12354,50,"Avenida Caracas 30-15",1,1);
        aptestudio1.calcularPrecioVenta(aptestudio1.valArea);
        aptestudio1.imprimir();
       
    }
    
}
