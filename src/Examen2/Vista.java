/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Usuario
 */
public class Vista {

    boolean modoGrafico;
    FabricaVehiculos FabricaVehiculos;

    public Vista(FabricaVehiculos notaInstanciada, boolean modoGrafico) {
        this.FabricaVehiculos = notaInstanciada;
        this.modoGrafico = modoGrafico;
    }

    public void numPuertas() {
        double NumPuertas;

        if (modoGrafico) {
            NumPuertas = Double.parseDouble(JOptionPane.showInputDialog("Numero de Puertas "));
        } else {
            Scanner s = new Scanner(System.in);
            NumPuertas = s.nextDouble();
        }
        FabricaVehiculos.agregarAutos(NumPuertas);

    }

    public void muestreAno() {
        JTextArea jt = new JTextArea();
        for (int i = 0; i < FabricaVehiculos.getAno(); i++) {
            jt.append(FabricaVehiculos.getModelo() + "\n");
        }
        JOptionPane.showMessageDialog(null, jt);
    }

    public int getOpcion() {
        int r = 0;
        try {
            r = Integer.parseInt(JOptionPane.showInputDialog("\n1. Numero de puertas\n2. Mostrar Resultado\n3.Salir"));
            if ((r < 1) || (r > 3)) {
                throw new Exception("# de opcion  es inválido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return r;
    }


    /*
a-Mostrar una lista de vehículos en bodega con la información del motor.
b. Mostrar una lista de vehículos vendidos con la información del motor.
c. Mostrar una lista de vehículos devueltos con la información del motor.
d. Agregar un vehículo fabricado en el sistema.
e. Salir.*/
}
