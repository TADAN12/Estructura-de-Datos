/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueuePrioridad;

import Nodo.Nodo;

/**
 *
 * @author Alan
 */
public class Prioridad<Generico> {
    int prioridad;
    int indice = 0;
    Nodo head;

    public Prioridad() {
        head = new Nodo();
    }
   
    public void enqueue(Generico dato,int prioridad) {
        Nodo copia = head;
        Nodo temp = new Nodo();
        temp.setDato(dato);
        temp.setNext(null);
        temp.setPrioriodad(prioridad);
        if (head.getDato() == null) {
            head.setDato(dato);
            head.setNext(null);
            indice++;
            return;
        }
        
        while (copia.getNext() != null) {
            if(temp.getPrioridad()<copia.getPrioridad()){
                temp.setNext(copia);
                copia=temp;
                return;
            }
            if(temp.getPrioridad()>copia.getPrioridad()){
                temp.setNext(copia.getNext());
                copia.setNext(temp);
            }
            if(temp.getPrioridad()==copia.getPrioridad()){
                enqueue(dato, prioridad);
            }
            copia = copia.getNext();
            
        }//no evaluea el ultimo nodo que apunta a null
        if(temp.getPrioridad()>copia.getPrioridad()){//para el ultimo nodo que apunta a null
            temp.setNext(copia.getNext());
                copia.setNext(temp);
        }
        
        indice++;

    }

    public Generico dequeue() {
        if (!isEmpity()) {
            Nodo temp = new Nodo();
            temp.setDato(head.getDato());
            head = head.getNext();
            indice--;
            return (Generico) temp.getDato();
        }
        else {
            System.out.println("Cola vacia.");
            return null;
        }
    }

    public boolean isEmpity() {
        return indice == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Nodo copia = head;
        while (copia.getNext() != null) {
            sb.append(copia.getDato());
            sb.append(" <- ");
            copia = copia.getNext();
        }

        sb.append(copia.getDato());
        return sb.toString();
    }
}
