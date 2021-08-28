/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2;

/**
 *
 * @author Usuario
 */
public class FabricaVehiculos {

    private String modelo;
    private String color[];
    private int numPuertas[];
    private int ano;
    Motor motor;
    private double peso[];
    private int indice;

    public FabricaVehiculos(int NumPuertas) {
        numPuertas = new int[NumPuertas];
        indice = 0;
    }

    public void agregarAutos(double pesos) {

        try {

            try {
                peso[indice++] = (int) pesos;

            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("muchos datos");
                indice--;
            }
        } catch (Exception e) {
            System.out.println("error general");
        }
    }



    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public class Motor {

        public Motor(int peso, String modelo, int serie) {
        }
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor(int i) {
        return color[i];
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int año) {
        this.ano = ano;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}
