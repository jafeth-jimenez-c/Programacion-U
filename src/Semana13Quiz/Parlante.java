/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana13Quiz;

/**
 *
 * @author Usuario
 */
public class Parlante {

    boolean habilitado;
    int volumen;
    char tipo; //I :izq, D :der, S: subwoofer

    public Parlante(boolean habilitado, int volumen, char tipo) {
        this.habilitado = habilitado;
        this.volumen = volumen;
        this.tipo = tipo;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

}
