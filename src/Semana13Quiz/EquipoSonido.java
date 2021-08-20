package Semana13Quiz;

public class EquipoSonido {

    private String[] arreglosAudios;
    Parlante parIzq;
    Parlante parDer;
    Parlante subw;

    public String[] getArreglosAudios() {
        return arreglosAudios;
    }

    public void setArreglosAudios(String[] arreglosAudios) {
        this.arreglosAudios = arreglosAudios;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    private int indice;

    public EquipoSonido(int cantidadDeAudio) {
        arreglosAudios = new String[cantidadDeAudio];
        indice = 0;
        
        parIzq = new Parlante(true,5,'I');
        parDer = new Parlante(true,5,'D');
        subw = new Parlante(true,5,'S');
        
    }

    public void agregarAudio(String audio) {
        try {

            try {
                arreglosAudios[indice++] = audio;

            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("demasiados datos para el vector de quices");
                indice--;
            }
        } catch (Exception e) {
            System.out.println("error mas general");
        }
    }
}
