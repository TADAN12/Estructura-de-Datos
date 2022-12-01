/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot;

/**
 *
 * @author Alan
 */
public class Slot<Key,Valor> {
    private Key k;
    private Valor v;
    final int index;

    public Slot(Key k, Valor v, int index) {
        this.k = k;
        this.v = v;
        this.index = index;
    }
    public int getIndex(){
        return index;
    }
    public Key getK() {
        return k;
    }

    public void setK(Key k) {
        this.k = k;
    }

    public Valor getV() {
        return v;
    }

    public void setV(Valor v) {
        this.v = v;
    }
    
}
