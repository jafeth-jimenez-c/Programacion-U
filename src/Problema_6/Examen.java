/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_6;

/**
 *
 * @author Usuario
 */
public class Examen {

    Alumno alumno;
    private double puntosTotal[];
    int indice;

    public Examen(int TotalDeExamen) {
        puntosTotal = new double[TotalDeExamen];
        indice = 0;
    }

    public void puntosDeExamen(double puntosTotales) {
        try {

            try {
                puntosTotal[indice++] = (int) puntosTotales;

            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("demasiados datos");
                indice--;
            }
        } catch (Exception e) {
            System.out.println("error ");
        }
    }

    public int getIndice() {
        return indice;
    }

    public double getPuntosTotal(int i) {
        return puntosTotal[i];
    }

}
