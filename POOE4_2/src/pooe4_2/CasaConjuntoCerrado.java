/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooe4_2;

/**
 *
 * @author simon
 */
public class CasaConjuntoCerrado extends CasaUrbana{
    protected static double valArea = 2500000;
    protected int valAdmin;
    protected boolean Piscina;
    protected boolean CampDep;
    
    public  CasaConjuntoCerrado(int idInmo, int area, 
        String dir, int numHab, int numBanos, 
        int numPisos, int valAdmin, boolean Piscina, 
        boolean CampDep){
        // Invoca al constructor de la clase padre
        super(idInmo, area, dir, 
        numHab, numBanos, numPisos);
        this.valAdmin = valAdmin;
        this.Piscina = Piscina;
        this.CampDep = CampDep;
        }
    
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administracion = " + 
        valAdmin);
        System.out.println("Tiene piscina? = " + Piscina);
        System.out.println("Tiene campos deportivos? = " + 
        CampDep);
        System.out.println();
        }
}
