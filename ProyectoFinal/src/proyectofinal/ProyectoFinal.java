
package proyectofinal;
import javax.swing.JOptionPane;

public class ProyectoFinal {
    public static void main(String[] args) {
    String datouno,dato2;
int opcion;
    //     JOptionPane.showInputDialog(null, "Elije un producto","Catalogos",JOptionPane.INFORMATION_MESSAGE);
         dato2=JOptionPane.showInputDialog(null,"\n Elije un producto\n 1.Price Shoes \n 2.Tupperware \n 3.Betterware\n 4.Muebles dico \n 5.Jafra royal \n ","CATALOGOS DOÑA LUPE",JOptionPane.INFORMATION_MESSAGE);
         opcion=Integer.parseInt(dato2);
         if(opcion==1){
             datouno=JOptionPane.showInputDialog(null,"\n 1.Puma \n 2.Nike \n ","PRICE SHOES",JOptionPane.INFORMATION_MESSAGE);
        opcion=Integer.parseInt(datouno);
        if(opcion==1){
        JOptionPane.showMessageDialog(null,"Se hizo tu pedido de Puma","Catálogo Price Shoes", JOptionPane.INFORMATION_MESSAGE);
System.exit( 0 );
        }
        if(opcion==2)
        JOptionPane.showMessageDialog(null,"Se hizo tu pedido de Nike","Catálogo Price Shoes", JOptionPane.INFORMATION_MESSAGE);
System.exit( 0 );
        System.exit( 0 ); }
         
        if(opcion==2){
            datouno=JOptionPane.showInputDialog(null,"\n 1.Jarra de Cristal \n 2.Cristal Flah \n ","TUPERWARE",JOptionPane.INFORMATION_MESSAGE);
        opcion=Integer.parseInt(datouno);
        if(opcion==1){
        JOptionPane.showMessageDialog(null,"Se hizo tu pedido de una jarra de Cristal","Catálogo Tupperware", JOptionPane.INFORMATION_MESSAGE);
System.exit( 0 );
        }
        if(opcion==2)
        JOptionPane.showMessageDialog(null,"Se hizo tu pedido de un cristal flash","Catálogo Tupperware", JOptionPane.INFORMATION_MESSAGE);
System.exit( 0 );
        System.exit( 0 );
        }
        if(opcion==3){
            
            datouno=JOptionPane.showInputDialog(null,"\n 1.Proyector de navidad \n 2.Closet guardaropa \n ","BETTERWARE",JOptionPane.INFORMATION_MESSAGE);
        opcion=Integer.parseInt(datouno);
        if(opcion==1){
        JOptionPane.showMessageDialog(null,"Se hizo tu pedido de una un proyector de navidad ","Catálogo Betterware", JOptionPane.INFORMATION_MESSAGE);
System.exit( 0 );
        }
        if(opcion==2)
        JOptionPane.showMessageDialog(null,"Se hizo tu pedido de un closet guardaropa","Catálogo Betterware", JOptionPane.INFORMATION_MESSAGE);
System.exit( 0 );
        System.exit( 0 );
            
        }
        if(opcion==4){
              
            datouno=JOptionPane.showInputDialog(null,"\n 1.Sala Modular Louis Oxford \n 2.Antecomedor Boss Nogal \n ","MUEBLES DICO",JOptionPane.INFORMATION_MESSAGE);
        opcion=Integer.parseInt(datouno);
        if(opcion==1){
        JOptionPane.showMessageDialog(null,"Se hizo tu pedido de una  Sala Modular Louis Oxford ","Catálogo Muebles Dico", JOptionPane.INFORMATION_MESSAGE);
System.exit( 0 );
        }
        if(opcion==2)
        JOptionPane.showMessageDialog(null,"Se hizo tu pedido de un Antecomedor Boss Nogal","Catálogo Muebles Dico", JOptionPane.INFORMATION_MESSAGE);
System.exit( 0 );
        System.exit( 0 );
            
        }
        if(opcion==5){
              
            datouno=JOptionPane.showInputDialog(null,"\n 1.Locion corporal con brillo \n 2.Labial Líquido Mate \n ","JAFRA ROYAL",JOptionPane.INFORMATION_MESSAGE);
        opcion=Integer.parseInt(datouno);
        if(opcion==1){
        JOptionPane.showMessageDialog(null,"Se hizo tu pedido de una Locion corporal con brillo ","Catálogo Jafra Royal", JOptionPane.INFORMATION_MESSAGE);
System.exit( 0 );
        }
        if(opcion==2)
        JOptionPane.showMessageDialog(null,"Se hizo tu pedido de un Labial Líquido Mate","Catálogo Jafra Royal", JOptionPane.INFORMATION_MESSAGE);
System.exit( 0 );
        System.exit( 0 );
            
        }
    }
    
}
