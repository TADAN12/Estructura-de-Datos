/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author Alan
 */
public class Trabajador {
    private int numTrabajador;
    private String nombre;
    private String apellidoP;
    private String apelldioM;
    private int hrsExtra;
    private float sueldo;
    private int anioIngreso;



    public Trabajador(int numTrabajador, String nombre, String apellidoP, String apelldioM, int hrsExtra, float sueldo, int anioIngreso) {
        this.numTrabajador = numTrabajador;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apelldioM = apelldioM;
        this.hrsExtra = hrsExtra;
        this.sueldo = sueldoExtra(hrsExtra, anioIngreso,sueldo);
        this.anioIngreso = anioIngreso;
    }
    
    public float sueldoExtra(int horas,int anio,float sueldo){
        int difAnio=2022-anio;
         for (int i = 0; i < difAnio; i++) {
            sueldo*=1.03;
        }
         
        if(horas>0){
            sueldo+=horas*276.5;
        }
        
        return sueldo;
    }

    @Override
    public String toString() {
        return  "numTrabajador=" + numTrabajador + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apelldioM=" +
                apelldioM + ", hrsExtra=" + hrsExtra + ", sueldo=" + sueldo + ", anioIngreso=" + anioIngreso;
    }

    public int getNumTrabajador() {
        return numTrabajador;
    }

    public void setNumTrabajador(int numTrabajador) {
        this.numTrabajador = numTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApelldioM() {
        return apelldioM;
    }

    public void setApelldioM(String apelldioM) {
        this.apelldioM = apelldioM;
    }

    public int getHrsExtra() {
        return hrsExtra;
    }

    public void setHrsExtra(int hrsExtra) {
        this.hrsExtra = hrsExtra;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }
    
}
