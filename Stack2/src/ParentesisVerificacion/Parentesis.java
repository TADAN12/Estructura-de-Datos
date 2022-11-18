/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParentesisVerificacion;

import StackADT.Stack;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Alan
 */
public class Parentesis {
    int lineas=1;
    int parentesisSolos=0;
    int caracter;
    char caracteres;
    Stack<Character> pila= new Stack();
    FileReader file;
    //static ArrayList<Character> letras;
    
    public Parentesis() {
    }
    public void verificar(String dir) throws FileNotFoundException, IOException{
        //archivo= new FileInputStream(dir);
        //linea=new Scanner(archivo);
        file=new FileReader(dir);
        
        while((caracter=file.read())!=-1){
            //lineaScann=linea.nextLine();
            //String [] letras = lineaScann.split("");
            caracteres=(char)caracter;
            if((caracteres)!='\n'){
                pila.push(caracteres);
               
            }
            else{
               
                while(!pila.isEmpity()){
                    
                   
                    //System.out.println(pila.peek());
                    if(pila.peek().charValue()==')'){
                      
                        
                        parentesisSolos++;
                    }
                    if(pila.peek().charValue()=='('){
                        parentesisSolos--;
                        
                    }
                        
                    pila.pop();
                    
                }
                /*if(parentesisSolos!=0)
                    System.out.println("Mal balance de parentesis en linea:"+lineas);*/
                
                lineas++;
            }
            
        }
        System.out.println("Diferencia de parentesis en el documento:"+parentesisSolos);
        if(parentesisSolos==0)
            System.out.println("Los parentesis estan balanceados correctamente.");
        else
            System.out.println("Los parentesis estan mal balanceados.");
    }
}
