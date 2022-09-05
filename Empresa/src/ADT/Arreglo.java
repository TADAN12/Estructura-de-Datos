/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADT;

import java.util.ArrayList;

/**
 *
 * @author Alan
 */
public class Arreglo <Gen> {
      int tamanio;
    ArrayList<Gen> arr;

    public Arreglo(int tamanio) {
        
        this.tamanio = tamanio;
        
        arr=new ArrayList(tamanio);
        for (int i = 0; i < tamanio; i++) {
            arr.add(null);
        }
       
    }
    public int getLongitud(){
        return tamanio;
    }
    public Gen getElemento(int index) throws IndexOutOfBoundsException {
        return arr.get(index);
    }
    public void setElemento(int index,Gen g){
        arr.set(index, g);
    }
    public void limpiar(Gen g){
        for (int i = 0; i < 10; i++) {
            arr.set(i, g);                    
        }
   
    }

    @Override
    public String toString() {
        return "ArregloGenerics{" + "arr=" + arr + '}';
    }
}
