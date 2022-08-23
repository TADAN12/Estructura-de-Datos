/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Alan
 */
public class Archv {

    BufferedReader bf;
    ArrayList<ArrayList<String>> datos2 = new ArrayList<>();
    //ArrayList<String>datos=new ArrayList<>();
    String letra;
    int head = 1;
    int lines = 0;

    public Archv(String nombreArch) {
        try {

            bf = new BufferedReader(new FileReader(nombreArch));
            while ((letra = bf.readLine()) != null) {
                //    System.out.println(letra);
                String spl[] = letra.split(",");
                if (head > 1) {
                    ArrayList<String> datos = new ArrayList<>();
                    for (int i = 0; i < spl.length; i++) {
                        if (spl[i].charAt(0) == '"') {
                            spl[i] = spl[i].concat(spl[i + 1]);
                            spl[i] = spl[i].substring(1, spl[i].length() - 1);
                            for (int j = i + 1; j < spl.length - 1; j++) {
                                spl[j] = spl[j + 1];
                            }
                        }
                        if (spl[i].charAt(spl[i].length() - 1) == '%') {
                            //System.out.println("BR");
                            spl[i] = spl[i].substring(0, spl[i].length() - 1);
                        }
                        //datos2.set(i, datos);
                        datos.add(spl[i]);
                    }
                    /*  System.out.print("  Linea=="+ lines);
                    System.out.print("  Datos=="+ datos.size());
                    System.out.println("  Datos 2=="+ datos2.size());                    
                    // System.out.println(pr.toString());
                    //System.out.println(Arrays.toString(spl));
                   // System.out.println("datos1. "+datos.toString());*/
                    datos2.add(datos);

                    //System.out.println(datos2.get(0));
                    //datos.clclear();
                }
                head++;
                //System.out.println("-->"+ datos2.size());
                lines++;
            }//while
            // System.out.println("  Datos 2=====>"+ datos2.size());                    
            for (int idx=0; idx < datos2.size(); idx++)
            { //System.out.println("  uno");                    
                System.out.println (" Datos 2" +datos2.get(idx).toString());
            }
            opciones();
            //System.out.println("**" + datos2.get(1).get(1));
        } catch (Exception e) {
            System.out.println("Exepcion");
            return;
        }
    }

    public void opciones() throws IOException {
        System.out.println("Seleccione un numero para una red social: ");
        System.out.println("FaceBook(1)-Twitter(2)-Youtube(3)");
        BufferedReader opc = new BufferedReader(new InputStreamReader(System.in));
        String redSocial = opc.readLine();
        int rS = Integer.parseInt(redSocial);
        switch (rS) {
            case 1:
                System.out.println("Seleccione un concepto:");
                System.out.println("Seguidores(0),crecimiento(1),porcentaje de crecimiento(2)");
                System.out.println("publicaciones(3),publicaciones(4),me gusta(5),compartidas(6),comentarios(7)");
                String fb = opc.readLine();
                int fbk = Integer.parseInt(fb);
                if ( fbk>8 & fbk <0) {
                    System.out.println("Introdusca un numero valido");
                    return;
                }
                impDatos(fbk);
                break;
            case 2:
                System.out.println("Seleccione un concepto:");
                System.out.println("Seguidores(0),crecimiento(1),porcentaje de crecimiento(2)");
                System.out.println("publicaciones(3),retuit(4),me gusta(5),impactos(6)");
                String tw = opc.readLine();
                int twt = Integer.parseInt(tw);
                if ( twt>8 & twt <0) {
                    System.out.println("Introdusca un numero valido");
                    return;
                }
                twt += 7;
                impDatos( twt);
                break;
            case 3:
                System.out.println("Seleccione un concepto:");
                System.out.println("videos(0),visualizaciones(1),comentarios(2),me gusta(3)");
                String yt = opc.readLine();
                int ytb = Integer.parseInt(yt);
                if ( ytb>8 & ytb<0) {
                    System.out.println("Introdusca un numero valido");
                    return;
                }
                ytb += 14;
                impDatos( ytb);
                break;
            default:
                System.out.println("Intridusca un numero valido.");
                return;
        }

    }

    public void impDatos( int concepto) throws IOException {
        System.out.println("Calcular:");
        System.out.println("Diferencia(1)-Promedio(2)");
        BufferedReader opc = new BufferedReader(new InputStreamReader(System.in));
        String operacion = opc.readLine();
        int op = Integer.parseInt(operacion);
        switch (op) {
            case 1:
                System.out.println("Indique dos meses:");
                System.out.println("Enero(0),Febrero(1),Marzo(2),Abril(3),Mayo(4),Junio(5)");
                String mes1 = opc.readLine();
                int m1 = Integer.parseInt(mes1);
                String mes2 = opc.readLine();
                int m2 = Integer.parseInt(mes2);
                int dif = Integer.parseInt(datos2.get(concepto).get(m2+3))-Integer.parseInt(datos2.get(concepto).get(m1+3));
                System.out.println(dif);
                break;
            case 2:
                int prom = (Integer.parseInt(datos2.get(concepto).get(3))+Integer.parseInt(datos2.get(concepto).get(4))+
                        Integer.parseInt(datos2.get(concepto).get(5))+Integer.parseInt(datos2.get(concepto).get(6))+
                        Integer.parseInt(datos2.get(concepto).get(7))+Integer.parseInt(datos2.get(concepto).get(8)))/5;
                System.out.println("El promedio es:" + prom);
                break;
            default:
                throw new AssertionError();
        }
    }
}
