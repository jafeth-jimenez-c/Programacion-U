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
public class Casting {
    
    public static void main(String[] args) {
        
        double a = 50.5d;
        float b = 254.8f;
        
        System.out.println("valor primero " +a);
        System.out.println("valor segundo " +b);
        
        b = (float)a;
        
        System.out.println("valor total: "+b);
        
        int f = 97;
        
        f = (int) a;
        
        System.out.println("Valor de f: " + f);
        
        char codigo = (char) f;
        
        System.out.println("cogido :"+ codigo);
        
    }
    
    
            
    
    
                
            
    
            
            
            
    
}
