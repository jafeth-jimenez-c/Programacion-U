/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana8;

/**
 *
 * @author Usuario
 */
public class Cap3y8 {

    public String nombre;
// método para establecer el nombre en el objeto

    /**
     *
     * @param nombre
     */
    public void establecerNombre(String nombre) {
        this.nombre = nombre; // almacenar el nombre
    }

// método para obtener el nombre del objeto
    public String obtenerNombre() {
        return nombre; // devuelve el valor de nombre a quien lo invocó
    }

    // variable de instancia{
    private double saldo; // variable de instancia

    // Constructor de Cuenta que recibe dos parámetros
    public Cap3y8(String nombre2, double saldo) {
        this.nombre = nombre2; // asigna nombre a la variable de instancia nombre

        // valida que el saldo sea mayor que 0.0; de lo contrario,
        // la variable de instancia saldo mantiene su valor inicial predeterminado de 0.0
        if (saldo > 0.0) // si el saldo es válido
        {
            this.saldo = saldo; // lo asigna a la variable de instancia saldo
        }
    }

    // método que deposita (suma) sólo una cantidad válida al saldo
    public void depositar(double montoDeposito) {
        if (montoDeposito > 0.0) // si el montoDeposito es válido
        {
            saldo = saldo + montoDeposito; // lo suma al saldo
        }
    }

    // método que devuelve el saldo de la cuenta
    public double obtenerSaldo() {
        return saldo;
    }
}

/* PARA PROBRAR NOMBRES
  método que establece el nombre
 public void establecerNombre(String nombre)
 {
 this.nombre = nombre;
 }  
}
public static void main(String[] args)
{
// crear dos objetos Cuenta
 Cuenta cuenta1 = new Cuenta(“Jane Green”);
 Cuenta cuenta2 = new Cuenta(“John Blue”);

System.out.printf(“El nombre de cuenta1 es: %s%n”, cuenta1.obtenerNombre());
System.out.printf(“El nombre de cuenta2 es: %s%n”, cuenta2.obtenerNombre());
} 
 */
