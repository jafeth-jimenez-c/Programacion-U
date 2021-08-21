/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana14;

/**
 *
 * @author Usuario
 */
public class Algoritmos {

    public static void main(String[] args) {
        int[] arreglo = {7, 3, 1, 2, 4, 6};

        for (int k = 1; k < arreglo.length - 1; k++) {

            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    int temp = arreglo[i + 1];
                    arreglo[i + 1] = arreglo[i];
                    arreglo[i] = temp;
                }
            }
        }
        System.out.print("|");
        for (int i = 0; i < arreglo.length; i++) {

            System.out.print(arreglo[i] + "|");
        }
    }
}
