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
        
        //Datos guardados
        

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Menu \n1) Digitar datos de la empresa\n2)Imprimir información competa de la empresa" + "\n3) Estado inicial");
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
                        +"\n " + nombre
                        +"\n " + provincia
                        +"\n " + trabajadores
                        +"\n " + trabajadoresCovid
                        +"\n " + ingresoPromedio
                        +"\n " + creditos
                  );  
                  
                  if(trabajadoresCovid>20)
                      System.out.println("ALERTA");                  
                  
                }
                case 3: {
                    
                    System.out.println("Problacion de San José: 1404 242");
                    System.out.println("Poblacion de Alajuela: 848 146");
                    System.out.println("Poblacion de Cartago: 490 903");
                    System.out.println("Problacion de Heredia: 433 677");
                    System.out.println("Poblacion de Guanacaste: 326 953");
                    System.out.println("Poblacion de Puntarenas: 410 929");
                    System.out.println("Poblacion de Limón: 386 862");
                    
                    
                   
                }
            }

        }
    }
}
