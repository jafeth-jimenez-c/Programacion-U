/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeExamen;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio7 {

    public class elevarPotencia {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int var = 0;
            System.out.println("Teclar numero");
            var = s.nextInt();
            System.out.print(Math.pow(var, 3));
        }
    }
}
