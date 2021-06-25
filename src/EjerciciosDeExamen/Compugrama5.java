/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeExamen;

/**
 *
 * @author Usuario
 */
public class Compugrama5 {

    public static void main(String[] args) {
        compugrama5();
    }

    public static void compugrama5() {
        int n = 7;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n - 1) || j == 0 || j == (n - 1) || j == (n-i-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
