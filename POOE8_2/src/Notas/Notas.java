/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notas;

/**
 *
 * @author simon
 */
public class Notas {
    double[] listaNotas; /* Atributo que identifica un array de notas de 
    tipo double */
    /**
    * Constructor de la clase Notas, instancia un array con 5 notas de 
    * tipo double
    */
    public Notas() {
        listaNotas = new double[5]; // Crea un array de 5 notas
    }
    
    double calcularPromedio() {
        double suma = 0;
        for(int i=1; i < listaNotas.length; i++) { // Se recorre el array
        suma = suma + listaNotas[i]; // Suma las notas del array
        }
        /* Obtiene el promedio como la división de la suma de notas 
        sobre el total de notas */
        return (suma / listaNotas.length);
        }
    
    double calcularDesviación() {
        double prom = calcularPromedio(); /* Invoca el método para 
        calcular el promedio */
        double suma = 0;
        for(int i=0; i < listaNotas.length; i++) {
        // Aplica fórmula para la sumatoria de elementos
        suma += Math.pow(listaNotas[i] - prom, 2 );
        }
        return Math.sqrt (suma/listaNotas.length ); /* Retorna el cálculo 
        final de la desviación */
        }
    
    double calcularMenor() {
        double menor = listaNotas[0]; /* Define una variable como la 
        nota menor */
        for(int i=0; i < listaNotas.length; i++) { // Se recorre el array
        if (listaNotas[i] < menor) {
        /* Si un elemento del array es menor que el menor actual, 
        se actualiza su valor */
        menor = listaNotas[i];
        }
        }
        return menor;
        }
    
    double calcularMayor() {
        double mayor = listaNotas[0]; /* Define una variable como la 
        nota mayor */
        for(int i=0; i < listaNotas.length; i++) { // Se recorre el array
        if (listaNotas[i] > mayor) {
        mayor = listaNotas[i];
        }
        }
        return mayor;
        }
}
