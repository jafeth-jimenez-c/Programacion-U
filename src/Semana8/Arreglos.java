/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana8;

/**
 *
 * @author Usuario
 */
public class Arreglos {

    public static void main(String[] args) {

        String[] numeros = {"numero1", "numero2", "numero3", "numero4"};
        for (int total = 0;
                total < numeros.length;
                total++) {
            System.out.println(numeros[total]);

        }
        int[] numer = {1,78,3,23};
                
        for(int i=0; i< numer.length; i++){
            System.out.println(numer[i]);
            
        }
        
        int[] cajas;
        
        cajas = new int[250];
        
        for(int i=0; i<2; i++){
            System.out.println(cajas[i]);
        }

        int[] frec = {1,2,3,4,5};
                
        for(int i=0; i< 5; i++){
            System.out.println(frec[i]);
            
        }
        
        int[] ejer2;
        
        ejer2 = new int[50];
        
        int n = ejer2.length;
        for(int i=0; i <= n-1; i++){
            
            ejer2[i] = i;
        }
        n = ejer2.length;
        for(int i=0; i<= n-1; i++){
            System.out.println(ejer2[n-i]);
        }
    }
}
    
