/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qeue;

import Queue.Queue;

/**
 *
 * @author Alan
 */
public class Qeue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<Integer> cola= new Queue();
        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);
        System.out.println(cola.toString());
        cola.dequeue();
        System.out.println(cola.toString());
        System.out.println(cola.isEmpity());
        cola.dequeue();
        cola.dequeue();
        System.out.println(cola.dequeue());
    }
    
}
