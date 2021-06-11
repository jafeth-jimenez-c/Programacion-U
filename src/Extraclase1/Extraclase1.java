package Extraclase1;
public class Extraclase1 {
public static void main (String []args){
    

        double impuesto = 0;
        int sueldo = 0;
        int dependiente1 = 0;
        int dependiente2 = 0;
        int dependiente3 = 0;
        int dependiente4 = 0;
        int dependientemasde4 = 0;

        if (sueldo >= 1) {
            impuesto = (int) (dependiente1 * 0.100);
        }
        if (sueldo >= 2) {
            impuesto = (int) (dependiente2 * 0.90);
        }
        if (sueldo >= 3) {
            impuesto = (int) (dependiente3 * 0.70);
        }
        if (sueldo >= 4) {
            impuesto = dependiente4 * 0.60;
        }
        if (sueldo >= +4) {
            impuesto = dependientemasde4 * 0.40;
        }
        

        System.out.println(impuesto);
       return ;
       
    } 
}
         