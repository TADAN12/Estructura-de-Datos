/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedHashMap;

import java.util.LinkedHashMap;

/**
 *
 * @author Alan
 */
public class LinkedHashMapp {
       public static void main(String a[])
    {
        // Instanciano LinkedHashMap
        LinkedHashMap<String, String> lhm= new LinkedHashMap<String, String>();
        // Añair elemntos
        lhm.put("uno", "1");
        lhm.put("tres", "2");
        lhm.put("cuatro", "3");
        // Llamano tostring
        System.out.println(lhm);
        // Imprimieno un valor epecifico e una llave
        System.out.println("Valor llave uno: "+lhm.get("uno"));
        // Obtenieno el tamaño
        System.out.println("Tamaño:"+ lhm.size());
        // esta vacio
        System.out.println("esta vacio?"+lhm.isEmpty());
        // verifica si hay una llave
        System.out.println("Contiene la llave tres? "+ lhm.containsKey("tres"));
        // verifica si hay un valor
        System.out.println("Contiene 1: "+ lhm.containsValue("1"));
        // borra un elemnto
        System.out.println("borra uno: "+ lhm.remove("uno"));
        // imprime la relacion llave-valor
        System.out.println("Relacion  LinkedHashMap : "+ lhm);
    }
}
