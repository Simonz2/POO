/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooe8_1;
import java.util.*;

/**
 *
 * @author simon
 */
public class ListaPersonas {
    Vector listaPersonas; // Atributo que identifica un vector de personas
    /**
    * Constructor de la clase ListaPersonas
    */
    public ListaPersonas() {
    listaPersonas = new Vector(); // Crea el vector de personas
    }
    
    public void añadirPersona(Personas p) {
    listaPersonas.add(p);
    }
    /**
    * Método que permite eliminar una persona del vector de personas
    * @param i Parámetro que define la posición a eliminar en el vector 
    * de personas
    */
    public void eliminarPersona(int i) {
    listaPersonas.removeElementAt(i);
    }
    /**
    * Método que permite eliminar todos los elementos del vector de 
    * personas
    */
    public void borrarLista() {
    listaPersonas.removeAllElements();
    }
    
}
