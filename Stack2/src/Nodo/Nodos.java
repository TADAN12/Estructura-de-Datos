/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodo;

/**
 *
 * @author Alan
 */
public class Nodos<Generico> {
    private Generico dato;
    private Nodos siguiente;

    public Nodos() {
    }

    public Generico getDato() {
        return dato;
    }

    public void setDato(Generico dato) {
        this.dato = dato;
    }

    public Nodos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodos siguiente) {
        this.siguiente = siguiente;
    }
    
}
