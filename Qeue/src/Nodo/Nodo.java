/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodo;

/**
 *
 * @author Alan
 */
public class Nodo<Generico> {

    private Generico dato;
    private Nodo next;
    private int prioridad;

    public Nodo() {
    }

    public void setPrioriodad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public Generico getDato() {
        return dato;
    }

    public void setDato(Generico dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

}
