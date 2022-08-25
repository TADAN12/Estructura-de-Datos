/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglo;

import Array.Array;
import java.io.BufferedReader;
import java.io.FileReader;
import Array.Trabajador;

/**
 *
 * @author Alan
 */
public class Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {

            BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Alan\\Downloads\\junio.dat"));
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Alan\\Downloads\\junio.dat"));
            Object objs, objs2;
            String linea;
            int head,filas,mayor,menor;
            mayor = menor =head=filas=0;
            
            while ((linea = bf.readLine()) != null) {

                filas++;//checa el tamanio que debera tener el array
            }
            Array arr = new Array(filas - 2);// le resta los conceptos y lo comieza desde cero
            while ((linea = br.readLine()) != null) {

                if (head > 0 & head < 14) {//no toma en cuenta los coneptos
                    
                    String spl[] = linea.split(",");//separa el string en arrays
                    Trabajador t = new Trabajador(Integer.parseInt(spl[0]), spl[1], spl[2], spl[3], Integer.parseInt(spl[4]),
                            Float.parseFloat(spl[5]), Integer.parseInt(spl[6]));
                    arr.setElemento(head - 1, t);//asigna los objetos al array
                    System.out.println(arr.getElemento(head - 1));

                }
                head++;
            }
            //arr.getElemento(1).get
            for (int i = 0; i < arr.getLongitud() - 1; i++) {

                objs = arr.getElemento(i);
                objs2 = arr.getElemento(i + 1);
                if (i == 0) {
                    mayor = menor = ((Trabajador) objs).getAnioIngreso();
                }
                //System.out.println(((Trabajador)objs).getAnioIngreso());
                if (mayor < ((Trabajador) objs2).getAnioIngreso()) {
                    mayor = ((Trabajador) objs2).getAnioIngreso();
                }
                if (menor > ((Trabajador) objs2).getAnioIngreso()) {
                    menor = ((Trabajador) objs2).getAnioIngreso();
                }
            }
            System.out.println("------------------------------------");
            System.out.println("Empleado con mayor antiguedad:" + mayor + "\nEmpleado con menor antiguedad:" + menor);
        } catch (Exception e) {
            System.out.println("Exepcion.");
            return;
        }
    }

}
