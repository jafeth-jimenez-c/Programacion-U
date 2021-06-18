/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

/**
 *
 * @author Usuario
 */
public class ExtraclassActualizado {

    public double calcularImpuesto(int numDependientes, double salario) {

        double resultado = 0;
        double montoSegunDependientes;

        if (numDependientes == 1) {
            montoSegunDependientes = salario * 1;
            if (salario < 200000) {
                resultado = 0;
            } else if (salario < 400000) {
                resultado = montoSegunDependientes * 0.1;
            } else if (salario < 600000) {
                resultado = montoSegunDependientes * 0.15;
            } else if (salario < 800000) {
                resultado = montoSegunDependientes * 0.2;
            } else {
                resultado = montoSegunDependientes * 0.3;
            }
        } else if (numDependientes == 2) {
            montoSegunDependientes = salario * 0.9;
            if (salario < 200000) {
                resultado = 0;
            } else if (salario < 400000) {
                resultado = montoSegunDependientes * 0.1;
            } else if (salario < 600000) {
                resultado = montoSegunDependientes * 0.15;
            } else if (salario < 800000) {
                resultado = montoSegunDependientes * 0.2;
            } else {
                resultado = montoSegunDependientes * 0.3;
            }
        } else if (numDependientes == 3) {
            montoSegunDependientes = salario * 0.7;
            if (salario < 200000) {
                resultado = 0;
            } else if (salario < 400000) {
                resultado = montoSegunDependientes * 0.1;
            } else if (salario < 600000) {
                resultado = montoSegunDependientes * 0.15;
            } else if (salario < 800000) {
                resultado = montoSegunDependientes * 0.2;
            } else {
                resultado = montoSegunDependientes * 0.3;
            }
        } else if (numDependientes == 4) {
            montoSegunDependientes = salario * 0.6;
            if (salario < 200000) {
                resultado = 0;
            } else if (salario < 400000) {
                resultado = montoSegunDependientes * 0.1;
            } else if (salario < 600000) {
                resultado = montoSegunDependientes * 0.15;
            } else if (salario < 800000) {
                resultado = montoSegunDependientes * 0.2;
            } else {
                resultado = montoSegunDependientes * 0.3;
            }
        } else {
            montoSegunDependientes = salario * 0.4;
            if (salario < 200000) {
                resultado = 0;
            } else if (salario < 400000) {
                resultado = montoSegunDependientes * 0.1;
            } else if (salario < 600000) {
                resultado = montoSegunDependientes * 0.15;
            } else if (salario < 800000) {
                resultado = montoSegunDependientes * 0.2;
            } else {
                resultado = montoSegunDependientes * 0.3;
            }
        }
        return resultado;
    }
}
