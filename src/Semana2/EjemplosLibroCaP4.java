/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana2;

import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
//En la figura 4.7 verá un algoritmo escrito en seudocódigo.
//La instrucción if es una instrucción de selección simple, ya que selecciona o ignora una sola acción (o, como pronto veremos, un solo grupo de acciones). La instrucción if...else se conoce como instrucción de selección doble, ya que selecciona entre dos acciones distintas (o dos grupos de acciones). La instrucción switch es una estructura de selección múltiple, ya que selecciona entre diversas acciones distintas (o grupos de acciones).
//Las instrucciones while y for realizan la acción (o grupo de acciones) en sus cuerpos, cero o más veces; si en un principio la condición de continuación del ciclo es falsa, no se ejecutará la acción (o grupo de acciones). La instrucción do...while realiza la acción (o grupo de acciones) en su cuerpo, una o más veces. Las palabras if, else, switch, while, do y for son palabras clave en Java
// Fig. 4.4: Estudiante.java
// Clase Estudiante que almacena el nombre y promedio de un estudiante.
public class EjemplosLibroCaP4 {

    private String nombre;
    private double promedio;

// el constructor inicializa las variables de instancia
    public EjemplosLibroCaP4(String nombre, double promedio) {
        this.nombre = nombre;

// valida que promedio sea > 0.0 y <= 100.0; de lo contrario,
// mantiene el valor predeterminado de la variable de instancia promedio (0.0)
        if (promedio > 0.0) {
            if (promedio <= 100.0) {
                this.promedio = promedio; // asigna a la variable de instancia
            }
        }
        // establece el nombre del Estudiante

        /**
         *
         * @param
         */
        //PROFE NO PUDE ARREGLAR ESTE ERROR NO SE QUE ES LO QUE PASA*
    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }
// recupera el nombre del Estudiante

    public String nombre() {
        return nombre;
    }

// establece el promedio del Estudiante
    public void establecerPromedio(double promedio) {
// valida que promedio sea > 0.0 y <= 100.0; de lo contrario,
// mantiene el valor actual de la variable de instancia promedio
        if (promedio > 0.0) {
            if (promedio <= 100.0) {
                this.promedio = promedio; // asigna a la variable de instancia
            }
        }
    }

// recupera el promedio del Estudiante
    public double obtenerPromedio() {
        return promedio;
    }

// determina y devuelve la calificación en letras del Estudiante
    public String obtenerCalificacionEstudiante() {
        String calificacionEstudiante = "";
        //se inicializa con objeto String vacío

        if (promedio >= 90.0) {
            calificacionEstudiante = "A";
        } else if (promedio >= 80.0) {
            calificacionEstudiante = "B";
        } else if (promedio >= 70.0) {
            calificacionEstudiante = "C";
        } else if (promedio >= 60.0) {
            calificacionEstudiante = "D";
        } else {
            calificacionEstudiante = "F";
        }

        return calificacionEstudiante;
    }

    Object obtenerNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} // fin de la clase Estudiante

// Fig. 4.8: PromedioClase.java
// Cómo solucionar el problema del promedio de la clase mediante la repetición controlada por contador.import java.util.Scanner; // el programa usa la clase Scanner
public class PromedioClase {

    public static void main(String[] args) {
// crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

// fase de inicialización
        int total = 0; // inicializa la suma de calificaciones introducidas por el usuario
        int contadorCalificaciones = 1; // inicializa # de calificación a introducir a continuación // la fase de procesamiento usa la repetición controlada por contador

        while (contadorCalificaciones <= 10) // itera 10 veces
        {
            System.out.print(
                    "Escriba la calificacion: "); // indicador
            int calificacion = entrada.nextInt(); // recibe siguiente calificación entrada total = total + calificacion; // suma calificación al total
            contadorCalificaciones = contadorCalificaciones + 1; // incrementa el contador en 1"
        }
        // fase de terminación
        int promedio = total / 10; // la división de enteros produce resultado entero

// muestra el total y el promedio de las calificaciones
        System.out.printf(
                "%nEl total de las 10 calificaciones es %d % n", total
        );
        System.out.printf(
                "El promedio de la clase es %d % n", promedio
        );
    } // fin de main
} // fin de la clase PromedioClase

// Fig. 4.12: Analisis.java
// Analisis de los resultados de un examen, utilizando instrucciones de control anidadas.import java.util.Scanner; // esta clase utiliza la clase Scanner
public class Analisis {

    public static void main(String[] args) {
// crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

// inicialización de las variables en declaraciones
        int aprobados = 0;
        int reprobados = 0;
        int contadorEstudiantes = 1;

// procesa 10 estudiantes, usando ciclo controlado por contador
        while (contadorEstudiantes <= 10) {
// pide al usuario la entrada y obtiene el valor
            System.out.print("Escriba el resultado (1 = aprobado, 2 = reprobado): ");
            int resultado = entrada.nextInt();

// if...else anidado en la instrucción while
            if (resultado == 1) {
                aprobados = aprobados + 1;
            } else {
                reprobados = reprobados + 1;
            }
            // i ncrementa contadorEstudiantes, para que el ciclo termine en un momento dado
            contadorEstudiantes = contadorEstudiantes + 1;
        }

// fase de terminación; prepara y muestra los resultados
        System.out.printf("Aprobados: %d%nReprobados: %d%n", aprobados, reprobados);

// determina si más de 8 estudiantes aprobaron
        if (aprobados > 8) {
            System.out.println("Bono para el instructor!");
        }
    }
} // fin de la clase Analisis

// Fig. 4.15: Incremento.java
// Operadores de preincremento y postincremento.
public class Incremento {

    public static void main(String[] args) {
// demuestra el operador de postincremento
        int c = 5;
        System.out.printf("c antes del postincremento: %d % n", c); // imprime 5
        System.out.printf(" postincremento de c:% d % n", c++); // imprime 5
        System.out.printf(
                " c despues del postincremento: %d % n", c); // imprime 6

        System.out.println(); // omite una línea

// demuestra el operador de preincremento
        c = 5;
        System.out.printf("c antes del preincremento: %d % n", c); // imprime 5
        System.out.printf(" preincremento de c: % d % n", ++c); // imprime 6
        System.out.printf(" c despues del preincremento: %d % n", c); // imprime 6
    }
} // fin de la clase Incremento

// Fig. 4.18: PanelDibujo.java
// Uso de drawLine para conectar las esquinas de un panel.
//import java.awt.Graphics;
//import javax.swing.JPanel;
public class PanelDibujo extends JPanel {
// dibuja una x desde las esquinas del panel

    @Override
    public void paintComponent(Graphics g) {
// llama a paintComponent para asegurar que el panel se muestre correctamente
        super.paintComponent(g);

        int anchura = getWidth(); // anchura total
        int altura = getHeight(); // altura total

// dibuja una línea de la esquina superior izquierda a la esquina inferior derecha 
        g.drawLine(0, 0, anchura, altura);

// dibuja una línea de la esquina inferior izquierda a la esquina superior derecha
        g.drawLine(0, altura, anchura, 0);
    }
} // fin de la clase PanelDibujo

// Fig. 4.19: PruebaPanelDibujo.java
// Crear un objeto JFrame para mostrar un objeto PanelDibujo.
//import javax.swing.JFrame;
public class PruebaPanelDibujo {

    public static void main(String[] args) {
// crea un panel que contiene nuestro dibujo
        PanelDibujo panel = new PanelDibujo();

// crea un nuevo marco para contener el panel
        JFrame aplicacion = new JFrame();
        // establece el marco para salir cuando se cierre
aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

aplicacion.add(panel); // agrega el panel al marco
aplicacion.setSize(250, 250); // establece el tamaño del marco
aplicacion.setVisible(true); // hace que el marco sea visible
}
} // fin de la clase PruebaPanelDibujo
