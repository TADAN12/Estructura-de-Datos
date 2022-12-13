/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Alan
 */
public class HashMapp {
       public static void main(String args[])
    {
 

        HashMap<Integer, String> hm
            = new HashMap<Integer, String>();
 
       
        System.out.println(hm.isEmpty());
        hm.put(1, "uno");
        hm.put(2, "cuatro");
        hm.put(3, "cinco");
        System.out.println("Realcion incial" + hm);
        hm.put(2, "For");
        System.out.println("Actualizar: " + hm);
        hm.remove(2);
        System.out.println("Actualizar: " + hm);
        System.out.println("Contiene llave 2:"+hm.containsKey(2));
        System.out.println("Contiene llave 3:"+hm.containsKey(3));
        System.out.println("Contiene valor cinco:"+hm.containsValue("cinco"));
        System.out.println("Tamaño:"+hm.size());
        hm.clear();
        System.out.println(hm);
         
    }
    
        
}
