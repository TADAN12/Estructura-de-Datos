/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackADT;

import Nodo.Nodos;

/**
 *
 * @author Alan
 */
public class Stack<Generico> {
     Nodos<Generico> ultimo = null;  

    public Stack() {
        
    }

    public void push(Generico dato) {
       Nodos<Generico> temporal=new Nodos();
       temporal.setDato(dato);
       temporal.setSiguiente(ultimo);
       ultimo=temporal;
 
    }

    public Generico peek() {
        if(!isEmpity())
        return ultimo.getDato();
        else
          return null;
    }

    public void pop() {    
         if(ultimo==null){
            System.out.println("StackUnderflow.");   
            return;
         }
         
        ultimo=ultimo.getSiguiente();
          

    }
    public boolean isEmpity(){
        return ultimo==null;
    }
}
