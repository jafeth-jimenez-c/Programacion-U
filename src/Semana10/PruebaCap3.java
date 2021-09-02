// Fig. 3.2: PruebaCuenta.java
// Crear y manipular un objeto Cuenta.

import java.util.Scanner;

public class PruebaCap3 {

    public static void main(String[] args) {
// crea un objeto Scanner para obtener la entrada desde el símbolo del sistema
        Scanner entrada = new Scanner(System.in);

// crea un objeto Cuenta y lo asigna a miCuenta
        Cap3libro miCuenta = new Cap3libro();

// muestra el valor inicial del nombre (null)
        System.out.printf("El nombre inicial es: ", miCuenta.obtenerNombre());
// pide y lee el nombre
        System.out.println("Introduzca el nombre:");
        String nombre = entrada.nextLine(); // lee una línea de texto
        miCuenta.establecerNombre(nombre); // coloca elNombre en miCuenta
        System.out.println(); // imprime una línea en blanco

// muestra el nombre almacenado en el objeto miCuenta
        System.out.printf("El nombre en el objeto miCuenta es:" );
    }
} // fin de la clase PruebaCuenta
