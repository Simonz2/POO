/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooe4_2;

/**
 *
 * @author simon
 */
public class inmueble {
    protected int idInmo;
    protected int area; // Atributo que identifica el área de un inmueble
    protected String dir; /* Atributo que identifica la dirección de 
    un inmueble */
    protected double precioVenta;
    
    inmueble(int idInmo, int area, String dir) {
    this.idInmo = idInmo;
    this.area = area;
    this.dir = dir;
    }
    
    double calcularPrecioVenta(double valArea) {
    precioVenta = area * valArea;
    return precioVenta;
    }
    
    void imprimir() {
    System.out.println("Identificador inmobiliario = " + 
    idInmo);
    System.out.println("Area = " + area);
    System.out.println("Direccion = " + dir);
    System.out.println("Precio de venta = $" + precioVenta);
    }
}
