/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack2;

import ParentesisVerificacion.Parentesis;
import StackADT.Stack;
import java.io.IOException;

/**
 *
 * @author Alan
 */
public class Stack2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        /*Stack pila=new Stack();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        System.out.println("---");
        System.out.println(pila.peek());
        pila.pop();
        pila.pop();
        pila.pop();
        pila.pop();
        System.out.println(pila.peek());*/
        Parentesis check= new  Parentesis();
        check.verificar("D:\\Archivos\\txt\\texto1.txt");
    }
    
}
