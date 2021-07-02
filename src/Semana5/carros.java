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
public class carros {

    public static void main(String[] args) {

        String marcas = "mitsubishi";

        switch (marcas) {
            case "audi": {
                System.out.println("audi");
                break;
            }

            case "toyota": {
                System.out.println("toyota");
                break;
            }
            default: {
                System.out.println("Ninguno");
            }

        }
    }
}
