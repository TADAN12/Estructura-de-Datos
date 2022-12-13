/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreeMap;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Alan
 */
public class TreeMapp {

    public static void main(String args[]) {
        // Instanciasion clase TreeMap
        TreeMap<Integer, String> tree_map
                = new TreeMap<Integer, String>();
        // Asisgnando valor a llaves
        tree_map.put(10, "arbol");
        tree_map.put(15, "4");
        tree_map.put(20, "balon");
        tree_map.put(25, "sii");
        tree_map.put(30, "tu");
        // Imprimieno elentos TreeMap
        System.out.println("TreeMap: " + tree_map);
        System.out.println("esta la llave " + 15 + " ?"+ tree_map.containsKey(15));
        System.out.println("esta el valor " + 4+ " ?"+ tree_map.containsValue("4"));
        tree_map.remove(4);
        for (Map.Entry mapElement : tree_map.entrySet()) {
            int key = (int) mapElement.getKey();
            // encontrano valor
            String value = (String) mapElement.getValue();
            // imprimieno llave y valor
            System.out.println(key + " : " + value);
        }
    }
}
