package poo.mvc.nota;

import Semana13Quiz.EquipoSonido;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class EquipoSonidaVista {

    private EquipoSonido equipoSonido;

    public EquipoSonidaVista(EquipoSonido notaInstanciada) {
        this.equipoSonido = notaInstanciada;
    }
    
    public int leaTamanoArreglo() {
        return Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de estudiantes."));
    }

    public void agregarAudio() {
        String audioDigitada;
        
        audioDigitada = JOptionPane.showInputDialog("Audio?");

        equipoSonido.agregarAudio(audioDigitada);
    }

    public void muestreAudio() {
        JTextArea jt = new JTextArea();
        for (int i = 0; i < equipoSonido.getIndice(); i++) {
            jt.append(equipoSonido.arreglosAudios(i) + "\n");
        }
        JOptionPane.showMessageDialog(null, jt);
    }

    public int getOpcion() {
        int r = 0;
        try {
            r = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar nota\n2. Mostrar Notas\n3.Salir"));
            if ((r < 1) || (r > 3)) {
                throw new Exception("# de opcion  es inválido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return r;
    }
}