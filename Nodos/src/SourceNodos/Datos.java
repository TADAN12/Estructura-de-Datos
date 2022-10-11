/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SourceNodos;

/**
 *
 * @author Alan
 */
public class Datos<Tipo> {

    int indice = 0;
    Nodo<Tipo> nodo;

    public Datos(Tipo t) {
        this.nodo = new Nodo(t, null);

    }

    public Datos(Nodo<Tipo> nodo) {
        this.nodo = nodo;
    }

    public Datos(Nodo<Tipo> nodo, Tipo tipo) {
        this.nodo = new Nodo(tipo, nodo);
    }

    public boolean estaVacia() {
        return indice > 0;
    }

    public int getTamanio() {
        return indice;
    }

    public void agregarFinal(Tipo tipo) {
        Nodo<Tipo> copia = nodo;

            while (copia.getSiguiente() != null) {

                copia = copia.getSiguiente();

            }

            copia.setSiguiente(new Nodo(tipo, null));
        indice++;
    }

    public void transversal() {
        Nodo<Tipo> copia = nodo;

        while (copia.getSiguiente() != null) {
            System.out.print(copia.getDato() + " -> ");
            copia = copia.getSiguiente();
        }
        System.out.println(copia.getDato());

    }

    public void agregarInicio(Tipo tipo) {
        nodo = new Nodo(tipo, nodo);
        indice++;
    }

    public void agregarIntermedio(int indice, Tipo tipo) {
        int indexAux = 0;
        Nodo<Tipo> copia = nodo;
        if (this.indice < indice) {
            System.out.println("El indice esta fuera del tamaño.");
            return;
        }
        while (copia.getSiguiente() != null) {

            if (indexAux == indice) {
                copia.setSiguiente(new Nodo(tipo, copia.getSiguiente()));
                this.indice++;
                return;
            }
            copia = copia.getSiguiente();
            indexAux++;
        }

        copia.setSiguiente(new Nodo(tipo, null));
        this.indice++;

    }

    public void agregarDespues(Tipo nuevo, Tipo despues) {
        Nodo<Tipo> copia = nodo;

        while (copia.getSiguiente() != null) {

            if (copia.getDato() == despues) {
                copia.setSiguiente(new Nodo(nuevo, copia.getSiguiente()));
                indice++;
                return;
            }
            copia = copia.getSiguiente();
        }
        if (copia.getDato() == despues) {
            copia.setSiguiente(new Nodo(nuevo, null));
            indice++;
            return;
        }
        System.out.println("El dato de referencia no se encontro en la lista.");

    }

    public void eliminarPrimero() {
        Nodo<Tipo> copia = nodo;
        if (copia.getSiguiente() != null) {
            nodo = copia.getSiguiente();
            indice--;
        } else {
            System.out.println("Solo hay un elemento en la lista");
        }

    }

    public void eliminarUltimo() {
        Nodo<Tipo> copia = nodo;
        while (copia.getSiguiente().getSiguiente() != null) {
            copia = copia.getSiguiente();
        }
        copia.setSiguiente(null);
        indice--;
    }

    public void eliminar(int index) {
        int indexAux = 0;
        Nodo<Tipo> copia = nodo;
        if (this.indice < index) {
            System.out.println("El indice esta fuera del tamaño.");
            return;
        }
        if (index == 0) {
            eliminarPrimero();
            return;
        }
        while (copia.getSiguiente() != null) {

            if (indexAux == index - 1) //borra uno despues en cuanto encuentra el indice, se le resta uno pata que borre el inidce
            {
                copia.setSiguiente(copia.getSiguiente().getSiguiente());
                indice--;
                return;
            }
            copia = copia.getSiguiente();
            indexAux++;
        }

    }

    public int buscar(Tipo dato) {
        int indiceAux = 0;
        Nodo<Tipo> copia = nodo;

        while (copia.getSiguiente() != null) {

            if (copia.getDato() == dato) {
                return indiceAux;
            }
            copia = copia.getSiguiente();
            indiceAux++;
        }
        if (copia.getDato() == dato) {
            return indice;
        }
        System.out.println("El dato de referencia no se encontro en la lista.");
        return -1;
    }

    @Override
    public String toString() {
        return "Indice=" + indice;
    }

}
