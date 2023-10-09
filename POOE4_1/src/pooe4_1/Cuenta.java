/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooe4_1;

/**
 *
 * @author simon
 */
public class Cuenta {
    protected float saldo;//define el saldo de la cuenta
    protected int numcons=0;//define el numero de consignaciones realizada
    protected int numret=0;//define el numero de retiros
    protected float tasaanual;
    /*define la tasa anual de interes de una cuenta bancaria
    
    */
    protected float comisionmensual = 0;
    /* define la comision anual que se cobra a una cuenta bancaria
    
    */
    /*constructor de la cuenta
    
    */
    public Cuenta(float saldo, float tasaanual) {
    this.saldo = saldo;
    this.tasaanual = tasaanual;
    }
    /*metodo que recibe y actualiza el saldo de la cuenta
    
    */
    public void consignar(float cantidad) {
    saldo = saldo + cantidad; /* Se actualiza el saldo con la cantidad 
    consignada */
    // Se actualiza el número de consignaciones realizadas en la cuenta
    numcons=numcons +1;
    }
    public void retirar(float cantidad) {
    float nuevoSaldo = saldo - cantidad;
    /* Si la cantidad a retirar no supera el saldo, el retiro no se puede 
    realizar */ 
    if (nuevoSaldo >= 0) {
        saldo -= cantidad;
        numret = numret + 1;
        } 
    else {
        System.out.println("La cantida a retirar excede el saldo actual.");
        }
    }
    public void calcularInteres() {
    float tasamensual = tasaanual / 12; /* Convierte la tasa anual en 
    mensual */
    float interesmensual = saldo * tasamensual;
    saldo += interesmensual; /* Actualiza el saldo aplicando el interés 
    mensual */
    }
    
    public void extractomensual() {
    saldo -= comisionmensual;
    calcularInteres();
    }
}
