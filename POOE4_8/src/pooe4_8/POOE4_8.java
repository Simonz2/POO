/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooe4_8;

/**
 *
 * @author simon
 */
public class POOE4_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Equipo equipo1 = new Equipo("Sky","Estados Unidos");
        Velocista velocista1 = new Velocista(123979, "Geraint Thomas", 
        320, 25);
        Escalador escalador1 = new Escalador(123980, "Egan Bernal", 
        25, 10);
        Contrarrelojista contrarrelojista1 = new Contrarrelojista(123981, 
        "Jonathan Castroviejo", 120);
        equipo1.addCiclista(velocista1);
        equipo1.addCiclista(escalador1);
        equipo1.addCiclista(contrarrelojista1);
        velocista1.setTiempoAcumulado(365);
        escalador1.setTiempoAcumulado(385);
        contrarrelojista1.setTiempoAcumulado(370);
        equipo1.calcularTotalTiempo();
        equipo1.imprimir();
        equipo1.listarEquipo();
        
    
    }
    
}