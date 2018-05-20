
package ınterfaceprojem;

import javax.swing.*;
import java.awt.*;



public class Notgörüntüleme1 extends JFrame {
    public Container con1;
    
    public static JLabel arkalabel2;
    public static JLabel ders1,ders2,ders3,ders4,ders5,ders6,ders7,ders8,ders9;
    public static JLabel vize1,vize2,vize3,vize4,vize5,vize6,vize7,vize8,vize9;
    public static JLabel final1,final2,final3,final4,final5,final6,final7,final8,final9;       
    public static JLabel not1,not2,not3,not4,not5,not6,not7,not8,not9;
    public static JLabel ort1,ort2,ort3,ort4,ort5,ort6,ort7,ort8,ort9;
    public static JLabel durum1,durum2,durum3,durum4,durum5,durum6,durum7,durum8,durum9;
    public static Double harfdeğer[]=new Double[9];
            
            public Notgörüntüleme1(){
                con1=getContentPane();
                con1.setLayout(null);
                setTitle("Not Listesi");
                
                ImageIcon arkaresim6=new ImageIcon("notliste.jpg");
                arkalabel2=new JLabel(arkaresim6);
                arkalabel2.setBounds(0,0,778,354);
                
               
                ders1=new JLabel(ÖğrenciBilgi1.DERS1);
                ders1.setBounds(10,130,350,20);
                
                ders2=new JLabel(ÖğrenciBilgi1.DERS2);
                ders2.setBounds(10,154,350,20);
                   
                ders3=new JLabel(ÖğrenciBilgi1.DERS3);
                ders3.setBounds(10,184,350,20);
                   
                ders4=new JLabel(ÖğrenciBilgi1.DERS4);
                ders4.setBounds(10,210,350,20);
                   
                ders5=new JLabel(ÖğrenciBilgi1.DERS5);
                ders5.setBounds(10,234,350,20);
                
                ders6=new JLabel(ÖğrenciBilgi1.DERS6);
                ders6.setBounds(10,260,350,20);  
                
                ders7=new JLabel(ÖğrenciBilgi1.DERS7);
                ders7.setBounds(10,284,350,20);
                   
                ders8=new JLabel(ÖğrenciBilgi1.DERS8);
                ders8.setBounds(10,310,350,20);
                   
                ders9=new JLabel(ÖğrenciBilgi1.DERS9);
                ders9.setBounds(10,334,350,20);
                
                
                
                vize1=new JLabel(ÖğrenciBilgi1.VİZE1);
                vize1.setBounds(400,134,40,20);
                
                vize2=new JLabel(ÖğrenciBilgi1.VİZE2);
                vize2.setBounds(400,157,40,20);
                
                vize3=new JLabel(ÖğrenciBilgi1.VİZE3);
                vize3.setBounds(400,182,40,20);
                
                vize4=new JLabel(ÖğrenciBilgi1.VİZE4);
                vize4.setBounds(400,210,40,20);
                
                vize5=new JLabel(ÖğrenciBilgi1.VİZE5);
                vize5.setBounds(400,237,40,20);
                
                vize6=new JLabel(ÖğrenciBilgi1.VİZE6);
                vize6.setBounds(400,260,40,20);
                
                vize7=new JLabel(ÖğrenciBilgi1.VİZE7);
                vize7.setBounds(400,284,40,20);
                
                vize8=new JLabel(ÖğrenciBilgi1.VİZE8);
                vize8.setBounds(400,310,40,20);
                
                vize9=new JLabel(ÖğrenciBilgi1.VİZE9);
                vize9.setBounds(400,334,40,20);
                
                final1=new JLabel(ÖğrenciBilgi1.FİNAL1);
                final1.setBounds(470,134,40,20);
                
                final2=new JLabel(ÖğrenciBilgi1.FİNAL2); 
                final2.setBounds(470,160,40,15);
                
                final3=new JLabel(ÖğrenciBilgi1.FİNAL3);
                final3.setBounds(470,180,40,20);
                
                final4=new JLabel(ÖğrenciBilgi1.FİNAL4);
                final4.setBounds(470,210,40,20);
                
                final5=new JLabel(ÖğrenciBilgi1.FİNAL5);
                final5.setBounds(470,240,40,15);
                
                final6=new JLabel(ÖğrenciBilgi1.FİNAL6);
                final6.setBounds(470,260,40,20);
                
                final7=new JLabel(ÖğrenciBilgi1.FİNAL7);
                final7.setBounds(470,290,40,15);
                
                final8=new JLabel(ÖğrenciBilgi1.FİNAL8);
                final8.setBounds(470,310,40,20);
                
                final9=new JLabel(ÖğrenciBilgi1.FİNAL9);
                final9.setBounds(470,334,40,20);
                
                durum1=new JLabel();
                durum1.setBounds(700,140,50,10);
                
                 durum2=new JLabel();
                durum2.setBounds(700,160,40,15);
                
                 durum3=new JLabel();
                durum3.setBounds(700,185,40,20);
                
                 durum4=new JLabel();
                durum4.setBounds(700,210,50,20);
                
                 durum5=new JLabel();
                durum5.setBounds(700,240,40,10);
                
                 durum6=new JLabel();
                durum6.setBounds(700,260,50,20);
                
                 durum7=new JLabel();
                durum7.setBounds(700,290,50,15);
                
                 durum8=new JLabel();
                durum8.setBounds(700,310,50,20);
                
                 durum9=new JLabel();
                durum9.setBounds(700,335,50,20);
                
          //vize nin %40 ı finalin %60 nı alıp topluyo ve ort yı bulmuş oluyor. ve diziye atıyoruz
            Double ortdizi[]=new Double[9] ;   
         ortdizi[0]=(Double.valueOf(vize1.getText())*40/100)+(Double.valueOf(final1.getText())*60/100);
         ortdizi[1]=(Double.valueOf(vize2.getText())*40/100)+(Double.valueOf(final2.getText())*60/100);
         ortdizi[2]=(Double.valueOf(vize3.getText())*40/100)+(Double.valueOf(final3.getText())*60/100);
         ortdizi[3]=(Double.valueOf(vize4.getText())*40/100)+(Double.valueOf(final4.getText())*60/100);
         ortdizi[4]=(Double.valueOf(vize5.getText())*40/100)+(Double.valueOf(final5.getText())*60/100);
         ortdizi[5]=(Double.valueOf(vize6.getText())*40/100)+(Double.valueOf(final6.getText())*60/100);
         ortdizi[6]=(Double.valueOf(vize7.getText())*40/100)+(Double.valueOf(final7.getText())*60/100);
         ortdizi[7]=(Double.valueOf(vize8.getText())*40/100)+(Double.valueOf(final8.getText())*60/100);
         ortdizi[8]=(Double.valueOf(vize9.getText())*40/100)+(Double.valueOf(final9.getText())*60/100);
         
         //final notunu diziye atalım
        Double dizifinal[]=new Double [9];
        dizifinal[0]=Double.valueOf(final1.getText());
        dizifinal[1]=Double.valueOf(final2.getText());
        dizifinal[2]= Double.valueOf(final3.getText());
        dizifinal[3]=Double.valueOf(final4.getText());
        dizifinal[4]=Double.valueOf(final5.getText());
        dizifinal[5]=Double.valueOf(final6.getText());
        dizifinal[6]=Double.valueOf(final7.getText());
        dizifinal[7]=Double.valueOf(final8.getText());
        dizifinal[8]=Double.valueOf(final9.getText());
        
        // durum ve harfnotu dizisi oluşturduk
       String dizidurum[]=new String[9];
       String dizinot[]=new String[9];
        //harf aralık not değeri;
     
               
             
             
        
        
         
         
      ort1=new JLabel(Double.toString(ortdizi[0]));
      ort1.setBounds(630,140,30,10);
      
      ort2=new JLabel(Double.toString(ortdizi[1]));
      ort2.setBounds(630,160,30,15);
      
      ort3=new JLabel(Double.toString(ortdizi[2]));
      ort3.setBounds(630,190,30,10);
      
      ort4=new JLabel(Double.toString(ortdizi[3]));
      ort4.setBounds(630,214,30,15);
      
      ort5=new JLabel(Double.toString(ortdizi[4]));
      ort5.setBounds(630,240,30,15);
      
      ort6=new JLabel(Double.toString(ortdizi[5]));
      ort6.setBounds(630,264,30,20);
      
      ort7=new JLabel(Double.toString(ortdizi[6]));
      ort7.setBounds(630,290,30,15);
      
      ort8=new JLabel(Double.toString(ortdizi[7]));
      ort8.setBounds(630,314,30,15);
      
      ort9=new JLabel(Double.toString(ortdizi[8]));
      ort9.setBounds(630,334,30,20);
      
      // harf sistemi
      not1=new JLabel();   
      not1.setBounds(540,134,20,20); 
      
       not2=new JLabel();
      not2.setBounds(540,160,30,15);
      
       not3=new JLabel();
      not3.setBounds(540,184,20,20);
      
       not4=new JLabel();
      not4.setBounds(540,210,30,15);
      
       not5=new JLabel();
      not5.setBounds(540,240,30,15);
      
       not6=new JLabel();
      not6.setBounds(540,264,30,15);
      
       not7=new JLabel();
      not7.setBounds(540,290,30,15);
      
       not8=new JLabel();
      not8.setBounds(540,310,30,20);
      
       not9=new JLabel();
      not9.setBounds(540,334,30,20);
      
              
      
                  for (int i = 0; i < 9; i++) {            
                    
                    if( dizifinal[i]>=60.0){
                        
                       if(ortdizi[i]>=90.0 && ortdizi[i]<=100.0){
                          dizinot[i]="AA"; 
                           dizidurum[i]="Geçti";
                           harfdeğer[i]=4.0;
                       } 
                        if(ortdizi[i]>=85.0 && ortdizi[i]<=89.9){
                            dizinot[i]="BA";
                            dizidurum[i]="Geçti";
                            harfdeğer[i]=3.5;
                        }
                        
                        if(ortdizi[i]>=80.0 && ortdizi[i]<=84.9){
                            dizinot[i]="BB";
                            dizidurum[i]="Geçti";
                            harfdeğer[i]=3.0;
                        }
                        if(ortdizi[i]>=75.0 && ortdizi[i]<=79.9){
                            dizinot[i]="CB";
                            dizidurum[i]="Geçti";
                            harfdeğer[i]=2.5;
                        }
                        if(ortdizi[i]>=65.0 && ortdizi[i]<=74.9){
                            dizinot[i]="CC";
                            dizidurum[i]="Geçti";
                            harfdeğer[i]=2.0;
                        }
                        if(ortdizi[i]>=60.0 && ortdizi[i]<=64.9){
                            dizinot[i]="DC";
                            dizidurum[i]="Geçti";
                            harfdeğer[i]=1.5;
                        }
                        if(ortdizi[i]>=55.0 && ortdizi[i]<=59.9){
                            dizinot[i]="DD";
                            dizidurum[i]="Kaldı";
                            harfdeğer[i]=0.0;
                        }
                        if(ortdizi[i]>=50.0 && ortdizi[i]<=54.9){
                            dizinot[i]="FD";
                            dizidurum[i]="Kaldı";
                            harfdeğer[i]=0.0;
                        }
                        if(ortdizi[i]>=0 && ortdizi[i]<=49.9){
                            dizinot[i]="FF";
                            dizidurum[i]="Kaldı";
                            harfdeğer[i]=0.0;
                        }
                        
                        
                    }
                    else if(dizifinal[i]<60.0 && dizifinal[i]>=0){
                        
                            dizinot[i]="FF";
                            dizidurum[i]="Kaldı";
                        harfdeğer[i]=0.0;
                    
                        
                    }
                    
                    
                    
                }
                 if(dizidurum[0]=="Kaldı"){
                     not1.setForeground(Color.red);
                     durum1.setForeground(Color.red);
                 }
                   if(dizidurum[1]=="Kaldı"){
                     not2.setForeground(Color.red);
                     durum2.setForeground(Color.red);
                 }
                    if(dizidurum[2]=="Kaldı"){
                     not3.setForeground(Color.red);
                     durum3.setForeground(Color.red);
                 }
                     if(dizidurum[3]=="Kaldı"){
                     not4.setForeground(Color.red);
                     durum4.setForeground(Color.red);
                 }
                      if(dizidurum[4]=="Kaldı"){
                     not5.setForeground(Color.red);
                     durum5.setForeground(Color.red);
                 }
                       if(dizidurum[5]=="Kaldı"){
                     not6.setForeground(Color.red);
                     durum6.setForeground(Color.red);
                 }
                        if(dizidurum[6]=="Kaldı"){
                     not7.setForeground(Color.red);
                     durum7.setForeground(Color.red);
                 }
                         if(dizidurum[7]=="Kaldı"){
                     not8.setForeground(Color.red);
                     durum8.setForeground(Color.red);
                 }
                          if(dizidurum[8]=="Kaldı"){
                     not9.setForeground(Color.red);
                     durum9.setForeground(Color.red);
                 }
                        
                         
                  
                  
                not1.setText(dizinot[0]);
                not2.setText(dizinot[1]);
                not3.setText(dizinot[2]);
                not4.setText(dizinot[3]);
                not5.setText(dizinot[4]);
                not6.setText(dizinot[5]);
                not7.setText(dizinot[6]);
                not8.setText(dizinot[7]);
                not9.setText(dizinot[8]);
                
                durum1.setText(dizidurum[0]);
                durum2.setText(dizidurum[1]);
                durum3.setText(dizidurum[2]);
                durum4.setText(dizidurum[3]);
                durum5.setText(dizidurum[4]);
                durum6.setText(dizidurum[5]);
                durum7.setText(dizidurum[6]);
                durum8.setText(dizidurum[7]);
                durum9.setText(dizidurum[8]);
                
                     
      
      
      
      
                con1.add(arkalabel2);
                arkalabel2.add(ders1); arkalabel2.add(ders2);  arkalabel2.add(ders3);  
                  arkalabel2.add(ders4);  arkalabel2.add(ders5);  arkalabel2.add(ders6);
                    arkalabel2.add(ders7);  arkalabel2.add(ders8);  arkalabel2.add(ders9); 
                      arkalabel2.add(vize1);  arkalabel2.add(vize2);  arkalabel2.add(vize3);
                        arkalabel2.add(vize4);  arkalabel2.add(vize5);  arkalabel2.add(vize6);
                          arkalabel2.add(vize7);  arkalabel2.add(vize8);  arkalabel2.add(vize9);
                            arkalabel2.add(final1);  arkalabel2.add(final2);  arkalabel2.add(final3);
                              arkalabel2.add(final4);  arkalabel2.add(final5);  arkalabel2.add(final6);
                                arkalabel2.add(final7);  arkalabel2.add(final8);  arkalabel2.add(final9);
                                  arkalabel2.add(ort1); arkalabel2.add(ort2); arkalabel2.add(ort3);
                                   arkalabel2.add(ort4); arkalabel2.add(ort5); arkalabel2.add(ort6);
                                    arkalabel2.add(ort7); arkalabel2.add(ort8); arkalabel2.add(ort9);
                                    arkalabel2.add(durum1); arkalabel2.add(durum2);arkalabel2.add(durum3);
                                    arkalabel2.add(durum4);arkalabel2.add(durum5);arkalabel2.add(durum6);
                                    arkalabel2.add(durum7);arkalabel2.add(durum8);arkalabel2.add(durum9);
                                    arkalabel2.add(not1); arkalabel2.add(not2); arkalabel2.add(not3);
                                            arkalabel2.add(not4); arkalabel2.add(not5); arkalabel2.add(not6);
                                             arkalabel2.add(not7); arkalabel2.add(not8); arkalabel2.add(not9);
                
                
                
                
                
                
                
            }
            
    public static void main(String[] args){
        
        Notgörüntüleme1 run2=new Notgörüntüleme1();
        run2.setVisible(true);
        run2.setBounds(60,60,790,400);
       
        
        
    }
}
