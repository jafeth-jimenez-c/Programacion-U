/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana14;

/**
 *
 * @author Usuario
 */

  public class Arreglos {
   numero = 19;
   intento = 0;
   maxIntentos = 3;
   
   { while intento < maxIntentos:

    int[] array = new int[10];
 
        for (int i = 0; i <= array.length - 1; i++) 
            array[i] = generarNumeroRandom();
  
        break;
    }
  
    public int generarNumeroRandom() {
        return (int) (Math.random() * 25) + 1;
    }
  }
        }