/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PracticaCitas {


    public String obtenerCitaVacuna (short numRiesgos){
        String resultado;
        
        if(numRiesgos == 1){
            resultado = "1 semana";
        }
        else if(numRiesgos == 2){
            resultado = "3 días";
        }
        else{
            resultado = "día siguiente";
        }
        return resultado;
    }
    
    public String obtenerCitaVacuna (){
        Scanner escaner = new Scanner(System.in);
        String resultado;
        short numFactores;
        
        System.out.println("Favor digitar el numero de factores de riesgo");
        numFactores = escaner.nextShort();
        
        if(numFactores == 1){
            resultado = "1 semana";
        }
        else if(numFactores == 2){
            resultado = "3 días";
        }
        else{
            resultado = "día siguiente";
        }
        return resultado;
    }
    public static void main(String[] args){
        
    }
}

