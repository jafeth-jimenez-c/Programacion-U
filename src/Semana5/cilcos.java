/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana5;

/**
 *
 * @author Usuario
 */
public class cilcos {

    public static void main(String[] args) {

        int hh2 = 0;
        while (true) {
            int hh = 0;

            while (hh < 1000) {

                System.out.println(hh);

                hh = hh + 100;
                if (hh > 200) {
                    break;
                }
            }
            hh2 = hh2 + 1;
            if (hh2 > 10) {
                break;
            }
        }
    }
}
