
package ınterfaceprojem;
  
import javax.swing.*;
import java.awt.*;

public class dersprogramı1 extends JFrame {
   public static Container con2;
   public static JLabel arkaplan4;
   
   
   
   public dersprogramı1(){
       con2=getContentPane();
                con2.setLayout(null);
                setTitle("Ders Programı");
                
                ImageIcon arkaresim7=new ImageIcon("dersprogramı3.jpg");
                arkaplan4=new JLabel(arkaresim7);
                arkaplan4.setBounds(0,0,778,354);
                
                
                con2.add(arkaplan4);
                
                
                
                
                
   }
   
    public static void main(String[] args) {
        dersprogramı1 run4=new dersprogramı1();
        run4.setVisible(true);
        run4.setBounds(70,50,790,400);
    }
}
