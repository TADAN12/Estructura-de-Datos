/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADT;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Alan
 */
public class GetDatos {
    BufferedReader bf;
    BufferedReader br;
    Object objs, objs2;
    String linea;
    int head, filas, mayor, menor;

    public GetDatos() {
        try {
            
            bf = new BufferedReader(new FileReader("C:\\Users\\Alan\\Downloads\\junio.dat"));
            br = new BufferedReader(new FileReader("C:\\Users\\Alan\\Downloads\\junio.dat"));
            mayor = menor = head = filas = 0;
            Arreglo<DatosTrabajador> arrG;
            while ((linea = bf.readLine()) != null) {

                filas++;//checa el tamanio que debera tener el array
            }
            
            
            arrG = new Arreglo(filas - 2);// le resta los conceptos y lo comieza desde cero
            
            while ((linea = br.readLine()) != null) {

                if (head > 0 & head < 14) {//no toma en cuenta los coneptos
                    
                    String spl[] = linea.split(",");//separa el string en arrays
                    DatosTrabajador t = new DatosTrabajador(Integer.parseInt(spl[0]), spl[1], spl[2], spl[3],
                            Integer.parseInt(spl[4]), Float.parseFloat(spl[5]), Integer.parseInt(spl[6]));
                    arrG.setElemento(head - 1, t);//asigna los objetos al array
                    if (head == 1) {
                        System.out.println("Sueldos nuevos:\n*************************");
                    }
                    System.out.println(arrG.getElemento(head - 1));

                }
                head++;
            }
            antiguedad(arrG);
            System.out.println("------------------------------------");
            System.out.println("Empleado con mayor antiguedad:" + menor + "\nEmpleado con menor antiguedad:"
                    + mayor);
        } catch (Exception e) {
            System.out.println("Exepcion.");

        }
    }

    public void antiguedad(Arreglo<DatosTrabajador> arr) {
        for (int i = 0; i < arr.getLongitud() - 1; i++) {

            if (i == 0) {
                mayor = menor = arr.getElemento(i).getAnioIngreso();
            }
            //System.out.println(((Trabajador)objs).getAnioIngreso());
            if (mayor < arr.getElemento(i + 1).getAnioIngreso()) {
                mayor = arr.getElemento(i + 1).getAnioIngreso();
            }
            if (menor > arr.getElemento(i + 1).getAnioIngreso()) {
                menor = arr.getElemento(i + 1).getAnioIngreso();
            }
        }
    }
}
