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
public class Ejercicio1 {

    double resul = 0;
    String name;
    int tamaño;

    public int suma(int a, int b, String temp) {
        name = "Calculadora basica";
        int resultado;
        resultado = a + b;
        return resultado;
    }

    public double suma(double a, double b) {
        double resultado;
        resultado = a + b;
        return resultado;
    }

    public int resta(int a, int b){
        int resultado;
        resultado = a - b;
        return resultado;
    }
    public double resta(double a, double b){
        double resultado;
        resultado = a - b;
        return resultado;
    }
    public int multiplicar(int a, int b){
        int resultado;
        resultado = a * b;
        return resultado;
    }
    public double multiplicar(double a, double b){
        double resultado;
        resultado = a * b;
        return resultado;
    }
    public int dividir(int a, int b){
        int resultado;
        resultado =(int) a / b;
        return resultado;
    }
    public double dividir(double a, double b){
        double resultado;
        resultado = a / b;
        return resultado;
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int a, b,opciones;
        boolean opcion = true;
        
        while (opcion){
          
            System.out.println("Menu");
            System.out.println("Opcion 1 Sumar");
            System.out.println("Opcion 2 Restar");
            System.out.println("Opcion 3 Multiplicar");
            System.out.println("Opcion 4 Dividir");
            System.out.println("Opcion 5 Salir");
            System.out.println("Escoger opcion");
            opciones = sc.nextInt();
            
            if (opciones == 5){
                System.out.println("Termino...");
                break;       
            } else {
                switch (opciones) {
                    case 1 -> {
                        System.out.println("Ingresar primer valor: ");
                        a = sc.nextInt();
                        System.out.println("Ingresar segundo valor: ");
                        b = sc.nextInt();
                        int suma=a+b;
                        System.out.println("Total:" + suma);
                    }
                    case 2 -> {
                        System.out.println("Ingresar primer valor: ");
                        a = sc.nextInt();
                        System.out.println("Ingresar segundo valor: ");
                        b = sc.nextInt();
                        int resta=a-b;
                        System.out.println("Total: " + resta);
                    }
                    case 3 -> {
                        System.out.println("Ingresar primer valor: ");
                        a = sc.nextInt();
                        System.out.println("Ingresar segundo valor: ");
                        b = sc.nextInt();
                        int multiplicar=a*b;
                        System.out.println("Total: " + multiplicar);
                    }
                    case 4 -> {
                        System.out.println("Ingresar primer valor: ");
                        a = sc.nextInt();
                        System.out.println("Ingresar segundo valor: ");
                        b = sc.nextInt();
                        int dividir=a/b;
                        System.out.println("Total: " + dividir);
                    }
                    default -> System.out.println("Opcion no valida...");
                }
            }               
        } 
    }
}
