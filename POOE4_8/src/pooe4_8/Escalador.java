/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooe4_8;

/**
 *
 * @author simon
 */
public class Escalador extends Ciclista{
    
    private double aceleracionPromedio;
    
    private double gradoRampa;
    
    public Escalador(int identificador, String nombre, double 
    aceleracionPromedio, double gradoRampa) {
    super(identificador, nombre);
    this.aceleracionPromedio = aceleracionPromedio;
    this.gradoRampa = gradoRampa;
    }
    
    protected double getAceleracionPromedio() {
    return aceleracionPromedio;
    }
    
    protected void setAceleracionPromedio(double 
    aceleracionPromedio) {
    this.aceleracionPromedio = aceleracionPromedio;
    }

    protected double getGradoRampa() {
    return gradoRampa;
    }
    
    protected void setGradoRampa(double gradoRampa) {
    this.gradoRampa = gradoRampa;
    }
    
    protected void imprimir() {
    super.imprimir(); // Invoca el método imprimir de la clase padre
    System.out.println("Aceleración promedio = " + 
    aceleracionPromedio);
    System.out.println("Grado de rampa = " + gradoRampa);
    }
    /**
    * Método que devuelve el tipo de ciclista
    * @return Un valor String con el texto “Es un escalador”
    */
    protected String imprimirTipo() {
    return "Es un escalador";
    }
}
