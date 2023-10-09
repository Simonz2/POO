/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooe4_2;

/**
 *
 * @author simon
 */
public class Local extends inmueble{
    enum tipo {INTERNO,CALLE};
    protected tipo tipoLocal;
    
    public Local(int idInmo, int area, String dir, 
        tipo tipoLocal) {
        // Invoca al constructor de la clase padre
        super(idInmo, area, dir);
        this.tipoLocal = tipoLocal;
        }
    
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Tipo de local = " + tipoLocal);
        }
}
