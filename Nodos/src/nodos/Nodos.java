/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nodos;

import SourceNodos.Datos;
import SourceNodos.Nodo;

/**
 *
 * @author Alan
 */
public class Nodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //nodo.setSiguiente(new Nodo(2,null));
        Datos d = new Datos(new Nodo(1,null));
        d.transversal();
        d.agregarIntermedio(0, 10);
        d.agregarFinal(2);
        d.agregarFinal(4);
        d.transversal(); 
        System.out.println(d.toString());
        d.agregarInicio(0);
        d.transversal();
        System.out.println(d.toString());
        d.agregarIntermedio(3, 3);
        d.transversal();
        System.out.println(d.toString());
        d.agregarDespues(2.5, 5);
        d.transversal();
        //d.eliminarUltimo();
        d.transversal();
        //d.eliminarPrimero();
        d.transversal();
       // d.eliminar(1);
        System.out.println(d.toString());
        d.eliminar(2);
        System.out.println(d.toString());
        d.eliminar(0);
        System.out.println(d.toString());
        d.eliminarUltimo();
        System.out.println(d.toString());
        d.transversal();
        System.out.println("----");
        System.out.println(d.toString());
        System.out.println(d.buscar(3));
        
    }

}
