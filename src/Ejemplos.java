/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

/**
 *
 * @author Usuario
 */
public class Ejemplos {

// Fig. 4.4: Estudiante.java
    // Clase Estudiante que almacena el nombre y promedio de un estudiante.
    public class Estudiante {

        private String nombre;
        private double promedio;

        // el constructor inicializa las variables de instancia
        public Estudiante(String nombre, double promedio) {
            this.nombre = nombre;

            // valida que promedio sea > 0.0 y <= 100.0; de lo contrario,
            // mantiene el valor predeterminado de la variable de instancia promedio (0.0)
            if (promedio > 0.0) {
                if (promedio <= 100.0) {
                    this.promedio = promedio; // asigna a la variable de instancia
                }
            }
            {
                // establece el nombre del Estudiante
        public void establecerNombre(String "nombre") {
            this.nombre = "nombre";
        }

        // recupera el nombre del Estudiante
        public String obtenerNombre() {
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
            String calificacionEstudiante = 

        “”; // se inicializa con objeto String vacío


//Para demostrar las instrucciones if 4.4



// Fig. 4.5: PruebaEstudiante.java
 // Crea y prueba objetos Estudiante.
 public class PruebaEstudiante {

            public static void main(String[] args) {
                Estudiante cuenta1 = new Estudiante(
                “Jane Green
                ”, 93.5);
 Estudiante cuenta2 = new Estudiante(
                “John Blue
                ”, 72.75);

 System.out.printf(
                “La calificacion en letra de % s es:
                 % s % n
                ”,
 cuenta1.obtenerNombre()
                , cuenta1.obtenerCalificacionEstudiante()
                ); cuenta1.obtenerCalificacionEstudiante()
                System.out.printf(
                “La calificacion en letra de % s es:
                 % s % n
                ”,
 cuenta2.obtenerNombre()
                , cuenta2.obtenerCalificacionEstudiante()
                ); cuenta2.obtenerCalificacionEstudiante()
            
        
        )
 }
 } // fin de la clase PruebaEstudiante

//FIG 4.8

  // Fig. 4.8: PromedioClase.java
  // Cómo solucionar el problema del promedio de la clase mediante la repetición 
controlada por contador.
        import java.util.Scanner ; // el programa usa la clase Scanner

        public class PromedioClase {

            public static void main(String[] args) {
                // crea objeto Scanner para obtener la entrada de la ventana de comandos
                Scanner entrada = new Scanner(System.in);

                // fase de inicialización
                int total = 0; // inicializa la suma de calificaciones introducidas por el 
                uario
                int contadorCalificaciones = 1; // inicializa # de calificación a 
                troducir a continuación // la fase de procesamiento usa la repetición controlada por contador
                while (contadorCalificaciones <= 10) // itera 10 veces
                {
                    System.out.print(
                    “Escriba la calificacion: “); // indicador
 int calificacion = entrada.nextInt(); // recibe siguiente calificación 
                    entrada total = total + calificacion; // suma calificación al total
                    contadorCalificaciones = contadorCalificaciones + 1; // incrementa el 
                    ntador en 
            
        
    

1”    

}
