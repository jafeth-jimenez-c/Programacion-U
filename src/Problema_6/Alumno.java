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
public class Alumno {

    private double totalDeNotas[];
    private int indice;

    public Alumno(int TotalDeNota) {
        totalDeNotas = new double[TotalDeNota];
        indice = 0;
    }

    public void agregarNota(double notaAlumno) {
        try {

            try {
                totalDeNotas[indice++] = (int) notaAlumno;

            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("demasiados datos");
                indice--;
            }
        } catch (Exception e) {
            System.out.println("error mas general");
        }
    }

    public int getAlumno() {
        return indice;
    }

    public double getGradoCursando(int i) {
        return totalDeNotas[i];
    }

}
