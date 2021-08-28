/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_6;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Usuario
 */
public class SistemaNotasInterfaz {
    
    boolean modoGrafico;
    Examen examen;
    Alumno alumno;
    String nombreAlumno;

    public SistemaNotasInterfaz(Alumno notaInstanciada, Examen examenInstanciada, boolean modoGrafico) {
        this.alumno = notaInstanciada;
        this.examen = examenInstanciada;
        this.modoGrafico = modoGrafico;
    }

    public void leaAlumno() {
        double alumnoDigitado;

        if (modoGrafico) {
            alumnoDigitado = Double.parseDouble(JOptionPane.showInputDialog("Nota de Alumno"));
        } else {
            Scanner s = new Scanner(System.in);
            alumnoDigitado = s.nextDouble();
        }
        alumno.agregarNota(alumnoDigitado);

    }

    public void examenAlumno() {
        double alumnoExamen;

        if (modoGrafico) {
            alumnoExamen = Double.parseDouble(JOptionPane.showInputDialog("Resultado: "));
        } else {
            Scanner s = new Scanner(System.in);
            alumnoExamen = s.nextDouble();
        }
        examen.puntosDeExamen(alumnoExamen);

    }

    public void nombreAlumno() {
        String alumnoNombre;

        if (modoGrafico) {
            alumnoNombre = String.valueOf(JOptionPane.showInputDialog("Nombre de Alumno "));
        } else {
            Scanner s = new Scanner(System.in);
            alumnoNombre = s.findInLine("Nombre ");
        }
        nombreAlumno.formatted(alumnoNombre);
    }

    public void muestreNotasDeAlumno() {
        JTextArea jt = new JTextArea();
        for (int i = 0; i < alumno.getAlumno(); i++) {
            jt.append(alumno.getGradoCursando(i) + "\n");
        }
        JOptionPane.showMessageDialog(null, jt);
    }

    public void muestreID() {
        JTextArea jt = new JTextArea();
        for (int i = 0; i < examen.getIndice(); i++) {
            jt.append(examen.getPuntosTotal(i) + "\n");
        }
        JOptionPane.showMessageDialog(null, jt);
    }

    public int getOpcion() {
        int r = 0;
        try {
            r = Integer.parseInt(JOptionPane.showInputDialog("\n1. Agregar nota de Alumno\n2. Mostrar Resultado\n3. Su nombre\n4.Su resultado de examen\n5.Mostrar Resultado de examen\n6.Salir"));
            if ((r < 1) || (r > 6)) {
                throw new Exception("# de opcion  es inválido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return r;
    }

}
