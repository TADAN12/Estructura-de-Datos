/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTable;

import Slot.Slot;
import java.util.ArrayList;

/**
 *
 * @author Alan
 */
public class HashTable<Key, Valor> {

    ArrayList<Slot<Key, Valor>> slots;
    int size_tabla;

    public HashTable(int size_tabla) {

        slots = new ArrayList();

        this.size_tabla = size_tabla;
        
        if (this.size_tabla % 2 == 0 && this.size_tabla != 2) {
            this.size_tabla += 1;
        }
        
        if (this.size_tabla % 3 == 0 && this.size_tabla != 3) {
            this.size_tabla += 2;
        }
        
        if (this.size_tabla % 5 == 0 && this.size_tabla != 5) {
            this.size_tabla += 2;
        }
        
        if (this.size_tabla % 7 == 0 && this.size_tabla != 7) {
            this.size_tabla += 2;
        }
        
        //segunda verificacion para un primo
        if (this.size_tabla % 3 == 0 && this.size_tabla != 3) {
            this.size_tabla += 2;
        }
        if (this.size_tabla % 5 == 0 && this.size_tabla != 5) {
            this.size_tabla += 2;
        }
        if (this.size_tabla % 7 == 0 && this.size_tabla != 7) {
            this.size_tabla += 2;
        }
        System.out.println(this.size_tabla);
        for (int i = 0; i < this.size_tabla; i++) {
            slots.add(null);
        }
        System.out.println("Tamanño:" + slots.size());
    }

    public void add(Key k, Valor v) {
        int index = 0;
    }

    public int HashCode() {

        return 0;
    }
}
