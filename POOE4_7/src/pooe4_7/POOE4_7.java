/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooe4_7;

/**
 *
 * @author simon
 */
public class POOE4_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal[] animales = new Animal[4]; /* Define un array de cuatro 
        elementos de tipo Animal */
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Lobo();
        animales[3] = new Leon();
        for (int i = 0; i < animales.length; i++) { /* Recorre el array de 
        animales */
        System.out.println(animales[i].getNombreCientífico());
        System.out.println("Sonido: " + animales[i].getSonido());
        System.out.println("Alimentos: " + animales[i].
        getAlimentos());

        System.out.println("Habitat: " + animales[i].gethabitat());
        System.out.println();
        }
    }
}
