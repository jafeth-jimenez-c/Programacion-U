/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Quiz1 {

    public static void main(String[] args) {
        String nombreIngrediente1 = "jamon";
        String nombreIngrediente2 = "queso";
        String nombreIngrediente3 = "chile";

        double precioIngrediente1 = 200;
        double precioIngrediente2 = 300;
        double precioIngrediente3 = 170;

        boolean indIngrediente1 = true;
        boolean indIngrediente2 = true;
        boolean indIngrediente3 = true;

        Scanner s = new Scanner(System.in);
        System.out.println("Desea " + nombreIngrediente1);
        indIngrediente1 = s.nextBoolean();

        System.out.println("Desea " + nombreIngrediente2 + "?");
        indIngrediente2 = s.nextBoolean();

        System.out.println("Desea " + nombreIngrediente3 + "?");
        indIngrediente3 = s.nextBoolean();

  

        double pagoTotal = 0;
        double pagoFinal = 0;

        if (indIngrediente1 == true) {
            pagoTotal = precioIngrediente;

            if  {
                else(indIngrediente2 == true) 
            }
            {

                pagoTotal = pagoTotal + precioIngrediente2;
            }
            else (indIngrediente3 == true) 
            
            pagoTotal = pagoTotal + precioIngrediente3;
        }
    }

    public static void imprimirFactura( double pagoFinal, boolean indIngrediente1,  boolean indIngrediente2, boolean indIngrediente3, String nombreIngrediente1, String nombreIngrediente2, String nombreIngrediente3, int tamano) {
        System.out.println("Precio" + pagoFinal);

        if (indIngrediente1 == true) {
            System.out.println(nombreIngrediente1);
        }
        if  {
            else(indIngrediente2 == true)
        }
        {
            System.out.println(nombreIngrediente2);
        }
        else(indIngrediente3 == true)
        {
            System.out.println(nombreIngrediente3);
        }

        if (tamano == 0) {
            System.out.println("Pequeña");
        } else {
            System.out.println("Grande");
        }
    }
}
