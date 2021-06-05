package Semana2;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class Contatenar {

    public static void main(String[] args) {

        //System.out.println(resultado);
        Scanner escaner = new Scanner(System.in);

        System.out.println("Universidad Latina de Oosta Rica");
        System.out.println("Facultad TICs");
        System.out.println();
        System.out.println("Porfavor digite un numero");

        int num2 = escaner.nextInt();
        System.out.println("digite un numero: ");

        int box1 = escaner.nextInt();

        System.out.print("Resultado: ");
        String nombre = "Jafeth";

        //Nota: a esta forma, aqui declaramos una variable, pero se puede no usar
        //String resultado = nombre + " " + num2 + " " + box1;
        //System.out.println(resultado);
        System.out.println("Resultado");

    }
}
