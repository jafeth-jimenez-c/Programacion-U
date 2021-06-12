/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extraclase1;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExtraClase {
   public double calcularImpuesto(int numDependientes,double dinero)
   {
       double resultado1=0;
       if (dinero <= 200000)
           resultado1 = 0;
       
       else if (dinero <= 400000)
               resultado1=0.10;
       
       else if (dinero <= 600000)
           resultado1 = 0.15;
       
       else if (dinero <= 800000)
           resultado1 = 0.20;
       
       else if (dinero < 800000)
           resultado1 = 0.30;
       
       double resultado2 = 0;
       if (numDependientes == 1)
       resultado2= dinero*1;
       
       else if (numDependientes == 2)
           resultado2 = 0.90;
       
       else if (numDependientes == 3)
           resultado2 = 0.70;
       
       else if (numDependientes == 4)
           resultado2 = 0.60;
       
       else if (numDependientes <4)
           resultado2 = 0.40;
       
       double total = resultado2*resultado1;
       return total;
   }
   /*
       public static void main(String [] args)
       {
           Scanner entrada = new Scanner(System.in);
           
           System.out.print("Su salario: ");
           double dinero= entrada.nextDouble();
           
           System.out.println("Dependientes: ");
           int numDependientes= entrada.nextInt();
   TRATE DE PONER EL SCANNER PERO NO FUNCIONO
        */      

       }
   


