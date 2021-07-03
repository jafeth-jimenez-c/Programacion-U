/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Examen1 {

    public static void main(String[] args) {
        String nombre = "";
        String provincia = "";
        int trabajadores = 0;
        int trabajadoresCovid = 0;
        int ingresoPromedio = 0;
        boolean creditos = false;
        int poblacion = 0;

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Menu \n1) Digitar datos de la empresa\n2)Imprimir información competa de la empresa" + "\n3)Prestamo e interes\n4) Estado inicial");
            int opcion = s.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("Nombre de la empresa");
                    nombre = s.next();
                    System.out.println("Provincia de la empresa");
                    provincia = s.next();
                    System.out.println("Total de trabajadores");
                    trabajadores = s.nextInt();
                    System.out.println("Trabajadores que han tenido covid-19");
                    trabajadoresCovid = s.nextInt();
                    System.out.println("Promedio monto por mes");
                    ingresoPromedio = s.nextInt();
                    System.out.println("Tiene creditos?");
                    creditos = s.nextBoolean();

                    break;
                }
                case 2: {
                    System.out.println("Datos de la empresa: "
                            + "\n " + nombre
                            + "\n " + provincia
                            + "\n " + trabajadores
                            + "\n " + trabajadoresCovid
                            + "\n " + ingresoPromedio
                            + "\n " + creditos
                    );

                    if (trabajadoresCovid > 20) {
                        System.out.println("ALERTA");

                        break;
                    }

                }
                case 3: {

                    double resultado = 0;

                    if (trabajadores > 10) {
                        resultado = 0.5;
                    } else if (trabajadores > 30) {
                        resultado = 0.4;
                    } else if (trabajadores >= 30) {
                        resultado = 0.3;
                    }
                    break;

                }
            }

        }
    }

    public static double interes(double resultado, int trabajadores, int trabajadoresCovid, int poblacion) {

        resultado = 0;

        if (trabajadores > 10) {
            resultado = 0.5;
        } else if (trabajadores > 30) {
            resultado = 0.4;
        } else if (trabajadores >= 30) {
            resultado = 0.3;
        }
        return resultado;

    }
}
