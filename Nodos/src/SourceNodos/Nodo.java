/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SourceNodos;

/**
 *
 * @author Alan
 */
public class Nodo <Dato> {
    private Dato dato;
    private Nodo<Dato> siguiente;


    public Nodo(Dato dato, Nodo<Dato> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    public void setSiguiente(Nodo<Dato> siguiente){
        this.siguiente=siguiente;
    }
    public Nodo getSiguiente(){
        return siguiente; 
    }
    public Dato getDato(){
        return dato;
    }
    public void setDato(Dato dato){
        this.dato=dato;
    }

}
