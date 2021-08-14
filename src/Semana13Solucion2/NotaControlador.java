package Semana13Solucion2;

public class NotaControlador {
    boolean modoGrafico =true;
    public void iniciar() {
        RegristroNotas nota = new RegristroNotas(2);
        NotaVista nv = new NotaVista(nota,modoGrafico);
        int op;
        do {
            op = nv.getOpcion();
            switch (op) {
                case 1:
                
                    int cant = 0;
                    String[] elNuevoArregloCiclos = new String [cant];
                
                    nota.setArregloCiclos(elNuevoArregloCiclos);
                        
                    
                    nv.leaNota();
                    break;


                case 2:
                    nv.muestreNotas();
                    break;
                default:
            }
        } while (op != 3);
    }
}
