/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana14;

/**
 * COMENTARIO:
 * Respuesta: 1-Porque usa un no primitivo referencia a una clase o objeto Short como si fuera primitivo y deberia ir con minuscula 
 * para poder leer bien el numero entero.
 * 
 */

public class Quiz3 {

    public static void main(String[] args) {
        Short i = 122, j = 122;
        if (i == j) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    class Test {

        public static void main(String[] args) {
            Short i = 1222, j = 1222;
            if (i == j) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

}
