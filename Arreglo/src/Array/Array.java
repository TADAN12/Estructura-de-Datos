/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Arrays;

/**
 *
 * @author Alan
 */

public class Array {

    int longitud;
    Object arr[];

    public Array(int tamanio) {
        longitud = tamanio;
        arr = new Object[tamanio];
    }

    public int getLongitud() {
        return longitud;
    }

    public void setElemento(int indice, Object objs) {
        arr[indice]=objs;
    }

    public Object getElemento(int indice) {
        return arr[indice];
    }

    public void limpiar(Object objs) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=objs;
        }
    }
   

    @Override
    public String toString() {
        return "longitud=" + longitud + "\narr=" + Arrays.toString(arr) + '}';
    }

 

}
