package Problema_6;

public class NotaControlador {

    boolean modoGrafico = true;

    public void iniciar() {

        Examen examen = new Examen(2);
        Alumno alumno = new Alumno(2);
        SistemaNotasInterfaz nv = new SistemaNotasInterfaz(alumno, examen, modoGrafico);
        int op;
        do {
            op = nv.getOpcion();
            switch (op) {
                case 1:
                    nv.leaAlumno();
                    break;
                case 2:
                    nv.muestreNotasDeAlumno();
                    break;
                case 3:
                    nv.nombreAlumno();
                    break;
                case 4:
                    nv.examenAlumno();
                    break;
                case 5:
                    nv.muestreID();
                    break;
                default:
            }
        } while (op != 6);
    }
}
