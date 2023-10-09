/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooe4_8;

/**
 *
 * @author simon
 */
public class Contrarrelojista extends Ciclista{
    private double velocidadMaxima;
    
    public Contrarrelojista(int identificador, String nombre, double 
    velocidadMaxima) {
    super(identificador, nombre);
    this.velocidadMaxima = velocidadMaxima;
    }
    
    protected double getVelocidadMaxima() {
    return velocidadMaxima;
    }
   
    protected void setVelocidadMaxima(double velocidadMaxima) {
    this.velocidadMaxima = velocidadMaxima;
    }
    /**
    * Método que muestra en pantalla los datos de un contrarrelojista
    */
    protected void imprimir() {
    super.imprimir(); // Invoca el método imprimir de la clase padre
    System.out.println("Velocidad maxima = " + 
    velocidadMaxima);
    }

    protected String imprimirTipo() {
    return "Es un constrarrelojista";
    }
    
    
}
