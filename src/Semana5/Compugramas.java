/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana5;

/**
 *
 * @author Usuario
 */
public class Compugramas {

    public static void main(String[] args) {

        for (int tras = 0; tras < 5; tras++) {
            System.out.print("*");
            {
                System.out.println();

                for (int tra = 0; tra < 4; tra++) {
                    if (tra < 3) {
                        System.out.println("*");
                    } else {
                        System.out.print("*");
                    }

                }
                for (int o = 0; o < 4; o++) {
                    System.out.print(("*"));
                }

            }
        }
    }
}
