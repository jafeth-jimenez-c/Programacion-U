package semana3;

public class Metodos {

    public static void main(String[] args) {

    }

    public static int sumar(int numero1, int numero2) {
        int resultado;
        resultado = numero1 + numero2;
        return resultado;

    }

    public static int pedro(int numero1, int numero2) {
        int resultado;
        resultado = numero1 * numero2;
        return resultado;
    }

    public static float maria(float numero1, float numero2) {
        float resultado;
        resultado = numero1 + numero2;
        return resultado;
    }

    public static float mari2(float numero1, float numero2) {
        float resultado;
        resultado = numero1 + numero2;
        return resultado;
        /**
         *
         * @param numero1
         * @param numero2
         * @return
         */
    public static int mutiplicar(int numero1, int numero2) {
        int resultado;
        resultado = numero1 * numero2;
        return resultado;
    }

    /**
     *
     * @param numero1
     * @param numero2
     * @param numero3
     * @return
     */
    public static int mutiplicar(int numero1, int numero2, int numero3) {
        int resultado;
        resultado = numero1 * numero2 * numero3;
        return resultado;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        int salarioBase = 1231231;
        int bonoVentas = 2343453;

        float resultadoParaJefe;

        resultadoParaJefe = sumar(salarioBase, bonoVentas);

        System.out.println(resultadoParaJefe);
    }
}
