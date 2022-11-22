/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

import Nodo.Nodo;

/**
 *
 * @author Alan
 */
public class Queue<Generico> {

    int indice = 0;
    Nodo head;

    public Queue() {
        head = new Nodo();
    }

    public void enqueue(Generico dato) {
        Nodo copia = head;
        Nodo temp = new Nodo();
        temp.setDato(dato);
        temp.setNext(null);
        if (head.getDato() == null) {
            head.setDato(dato);
            head.setNext(null);
            indice++;
            return;
        }
        while (copia.getNext() != null) {
            copia = copia.getNext();
        }
        copia.setNext(temp);
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
