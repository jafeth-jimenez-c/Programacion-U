/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Registro {

    boolean modoGrafico = true;

    public void iniciar() {

        FabricaVehiculos FabricaVehiculos = new FabricaVehiculos(2);
        Vista nv = new Vista(FabricaVehiculos, modoGrafico);
        int op;
        do {
            op = nv.getOpcion();
            switch (op) {
                case 1:
                    nv.numPuertas();
                    break;
                case 2:
                    nv.muestreAno();
                    break;
                default:
            }
        } while (op != 3);
    }
}
