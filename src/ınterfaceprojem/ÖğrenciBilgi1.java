
package ınterfaceprojem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Date;




public class ÖğrenciBilgi1 extends JFrame implements ActionListener{
    
    public  Container con;
    public  JLabel arkalabel1;
    public  JLabel sollabel;
    public  JLabel üstlabel;
   // public  JLabel ortalabel;
    public  JLabel orta1label;
    public  JLabel ortaaltlabel;
    public  JTextField tarih;
    public  JButton notbuton;
    public  JButton dersbuton;
    public  JButton ganobuton;
    public  JButton akbuton;
    public  JButton yönetbuton;
    public  JButton exitbuton;
    public  ImageIcon arkaresim1;
    public  ImageIcon arkaresim2;
    public  ImageIcon arkaresim3;
    public  ImageIcon arkaresim4;
    public  ImageIcon arkaresim5;
    public static ImageIcon foto;
    
    
    public static JLabel nolabel,tclabel,adlabel,sınıflabel,fakultelabel,bolumlabel,programlabel,donemlabel;
    public static JLabel fotolabel;
    
    public static String VİZE1,VİZE2,VİZE3,VİZE4,VİZE5,VİZE6,VİZE7,VİZE8,VİZE9;
    public static String FİNAL1,FİNAL2,FİNAL3,FİNAL4,FİNAL5,FİNAL6,FİNAL7,FİNAL8,FİNAL9;
    public static String DERS1,DERS2,DERS3,DERS4,DERS5,DERS6,DERS7,DERS8,DERS9;
    public static String AKTS1,AKTS2,AKTS3,AKTS4,AKTS5,AKTS6,AKTS7,AKTS8,AKTS9;
    
    
   public ÖğrenciBilgi1(){
       
       con=getContentPane();
       con.setLayout(null);
       setTitle("Otomasyon Sistemi");
       
       arkaresim1=new ImageIcon("arkaplan2.jpg");
       arkalabel1=new JLabel(arkaresim1);
       arkalabel1.setBounds(0,0,770,530);
       
       
       arkaresim2=new ImageIcon("sollabel.jpg");
       sollabel=new JLabel(arkaresim2);
       sollabel.setBounds(10,130,135,390);
       
       
       arkaresim3=new ImageIcon("labelbilgi.jpg");
       üstlabel=new JLabel(arkaresim3);
       üstlabel.setBounds(10,0,750,121);
       
       arkaresim4=new ImageIcon("kısayollabel.jpg");
       orta1label=new JLabel(arkaresim4);
       orta1label.setBounds(160,130,600,40);
       
       arkaresim5=new ImageIcon("akdeniz.jpg");
       ortaaltlabel=new JLabel(arkaresim5);
       ortaaltlabel.setBounds(160,180,600,340);
       
       Date time=new Date();
       
       tarih=new JTextField(time.toString());
       tarih.setBounds(550,140,130,10);
       //tarih.setForeground(Color.white);
       //Butonlar 
       Font buton=new Font("Tahoma",Font.BOLD,12);
       
       notbuton=new JButton("Not Listesi");
       notbuton.setBounds(10,180,120,20);
       notbuton.setBackground(Color.WHITE);
       notbuton.setFont(buton);
       
       dersbuton=new JButton("Ders Programı");
       dersbuton.setBounds(10,220,120,20);
       dersbuton.setBackground(Color.WHITE);
       dersbuton.setFont(buton);
      
       
       ganobuton=new JButton("GANO Hesapla");
       ganobuton.setBounds(10,260,120,20);
       ganobuton.setBackground(Color.WHITE);
       ganobuton.setFont(buton);
       
       
       akbuton=new JButton("Akademik Takvim");
       akbuton.setBounds(10,300,120,20);
       akbuton.setForeground(Color.BLUE);
       
       yönetbuton=new JButton("Yönetmelik");
       yönetbuton.setBounds(10,340,120,20);
       yönetbuton.setForeground(Color.BLUE);
       
    
       
       
       
       
       //teker teker labelleri yerleştireceğiz
       
       Font yazıstil=new Font("Segoe UI Semilight",Font.BOLD,12);
       
       
       
       nolabel=new JLabel(otomasyon1.NOLABEL);
       nolabel.setBounds(130,0,100,30);
       nolabel.setFont(yazıstil) ;
       nolabel.setForeground(Color.WHITE);
             
       
       tclabel=new JLabel(otomasyon1.TCLABEL);
       tclabel.setBounds(130,30,100,20);
       tclabel.setFont(yazıstil) ;
       tclabel.setForeground(Color.WHITE);
       
       
       adlabel=new JLabel(otomasyon1.ADLABEL);
       adlabel.setBounds(130,50,130,30);
       adlabel.setFont(yazıstil) ;
       adlabel.setForeground(Color.WHITE);
       
       sınıflabel=new JLabel(otomasyon1.SINIFLABEL);
       sınıflabel.setBounds(130,83,50,20);
       sınıflabel.setFont(yazıstil) ;
       sınıflabel.setForeground(Color.WHITE);
       
       fakultelabel=new JLabel(otomasyon1.FAKULTELABEL);
       fakultelabel.setBounds(390,0,260,20);
       fakultelabel.setFont(yazıstil) ;
       fakultelabel.setForeground(Color.WHITE);
       
       bolumlabel=new JLabel(otomasyon1.BOLUMLABEL);
       bolumlabel.setBounds(390,20,270,30);
       bolumlabel.setFont(yazıstil) ;
       bolumlabel.setForeground(Color.WHITE);
       
       programlabel=new JLabel(otomasyon1.PROGRAMLABEL);
       programlabel.setBounds(390,50,280,30);
       programlabel.setFont(yazıstil) ;
       programlabel.setForeground(Color.WHITE);
       
       donemlabel=new JLabel(otomasyon1.DONEMLABEL);
       donemlabel.setBounds(390,83,100,20);
       donemlabel.setFont(yazıstil) ;
       donemlabel.setForeground(Color.WHITE);
       
        foto=new ImageIcon(otomasyon1.NOLABEL+".jpg");
       fotolabel=new JLabel(foto);
       fotolabel.setBounds(640,10,90,80);
       
       
       con.add(arkalabel1);
       arkalabel1.add(sollabel);
       arkalabel1.add(üstlabel);
       arkalabel1.add(orta1label);
       arkalabel1.add(ortaaltlabel);
       sollabel.add(notbuton);
       sollabel.add(dersbuton);
       sollabel.add(ganobuton);
       sollabel.add(akbuton);
       sollabel.add(yönetbuton);
       
   orta1label.add(tarih);
       
       üstlabel.add(nolabel);
       üstlabel.add(tclabel);
       üstlabel.add(adlabel);
       üstlabel.add(sınıflabel);
       üstlabel.add(fakultelabel);
       üstlabel.add(bolumlabel);
       üstlabel.add(programlabel);
       üstlabel.add(donemlabel);
       üstlabel.add(fotolabel);
       
       
       
       notbuton.addActionListener(this);
       dersbuton.addActionListener(this);
       ganobuton.addActionListener(this);
       akbuton.addActionListener(this);
       yönetbuton.addActionListener(this);
       
   }
   
   
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==akbuton){
            try{
          
                int result = JOptionPane.showConfirmDialog(con, 
                        "Uygulamaları değiştirmeyi mi kastettiniz?",null, JOptionPane.YES_NO_OPTION);
                if(result==JOptionPane.NO_OPTION){
                    
                }
                else {
                    
                
                
                
            Process p=Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\IEXPLORE.exe http://oidb.akdeniz.edu.tr/akademik-takvim/");
        }}
        catch(IOException ex){
            ex.printStackTrace();
        } 
        }
        if(e.getSource()==yönetbuton){
                try{
                    
                    int result1 = JOptionPane.showConfirmDialog(con, 
                        "Uygulamaları değiştirmeyi mi kastettiniz?",null, JOptionPane.YES_NO_OPTION);
                    
                    if(result1==JOptionPane.NO_OPTION){
                        
                    }
                    else{
                    
                    
            Process p=Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\IEXPLORE.exe http://oidb.akdeniz.edu.tr/");
        }}catch(IOException ex){
            ex.printStackTrace();
        }
        }
        if(e.getSource()==dersbuton){
            dersprogramı1 run4=new dersprogramı1();
        run4.setVisible(true);
        run4.setBounds(70,50,790,395);
        }
        if(e.getSource()==ganobuton){
            
            try{
                 
            
                 String dosyaismi=otomasyon1.kullanıcıtext.getText();  
              
         File file = new File(dosyaismi+"akts.txt");
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));     
        int i=0;
        String satir = reader.readLine();
  
              while (satir!=null) {
                ++i;
                 switch (i){
                     case 1: AKTS1=satir;
                        break;
                     case 2: AKTS2=satir;
                         break;
                     case 3: AKTS3=satir;
                         break;
                     case 4: AKTS4=satir;
                         break; 
                     case 5: AKTS5=satir;
                         break;
                     case 6: AKTS6=satir;
                         break;
                     case 7: AKTS7=satir;
                         break;
                     case 8: AKTS8=satir;
                         break;
                     case 9:AKTS9=satir;
                     break;
                     default :System.out.println("hata");
                         
                 }
                  
                
                satir = reader.readLine();
            }
        }
      
          
   catch (Exception ex){
    ex.getMessage();
            } 
            
           Double akts[]=new Double[9];
                   akts[0]=Double.valueOf(AKTS1);
                   akts[1]=Double.valueOf(AKTS2);
                   akts[2]=Double.valueOf(AKTS3);
                   akts[3]=Double.valueOf(AKTS4);
                   akts[4]=Double.valueOf(AKTS5);
                   akts[5]=Double.valueOf(AKTS6);
                   akts[6]=Double.valueOf(AKTS7);
                   akts[7]=Double.valueOf(AKTS8);
                   akts[8]=Double.valueOf(AKTS9);
            
        Double gano1=akts[0]*(Notgörüntüleme1.harfdeğer[0]);
         Double gano2=akts[1]*(Notgörüntüleme1.harfdeğer[1]);
          Double gano3=akts[2]*(Notgörüntüleme1.harfdeğer[2]);
           Double gano4=akts[3]*(Notgörüntüleme1.harfdeğer[3]);
            Double gano5=akts[4]*(Notgörüntüleme1.harfdeğer[4]);
             Double gano6=akts[5]*(Notgörüntüleme1.harfdeğer[5]);
              Double gano7=akts[6]*(Notgörüntüleme1.harfdeğer[6]);
               Double gano8=akts[7]*(Notgörüntüleme1.harfdeğer[7]);
                Double gano9=akts[8]*(Notgörüntüleme1.harfdeğer[8]);
               Double result=0.0;
              for (int i = 0; i < 9; i++) {
               result+=akts[i]; 
            }
  
         Double GANOSONUÇ= (gano1+gano2+gano3+gano4+gano5+gano6+gano7+gano8+gano9)/result;  
       String dön=String.valueOf(GANOSONUÇ);
            String msj="GANO : "+dön.substring(0,4);
     
            JOptionPane.showMessageDialog(con, msj, ".::GANO::. ", WIDTH);
        }
        
        
        if(e.getSource()==notbuton){
            try{
                 
            
                 String dosyaismi=otomasyon1.kullanıcıtext.getText();  
              
         File file = new File(dosyaismi+"dersler.txt");
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));     
        int i=0;
        String satir = reader.readLine();
  
              while (satir!=null) {
                ++i;
                 switch (i){
                     case 1: DERS1=satir;
                        break;
                     case 2: DERS2=satir;
                         break;
                     case 3: DERS3=satir;
                         break;
                     case 4: DERS4=satir;
                         break; 
                     case 5: DERS5=satir;
                         break;
                     case 6: DERS6=satir;
                         break;
                     case 7: DERS7=satir;
                         break;
                     case 8: DERS8=satir;
                         break;
                     case 9:DERS9=satir;
                     break;
                     default :System.out.println("hata");
                         
                 }
                  
                
                satir = reader.readLine();
            }
        }
      
          
   catch (Exception ex){
    ex.getMessage();
            } 
            
            try{
                 
            
                 String dosyaismi=otomasyon1.NOLABEL;  
              
         File file = new File(dosyaismi+"vize.txt");
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));     
        int i=0;
        String satir = reader.readLine();
  
              while (satir!=null) {
                ++i;
                 switch (i){
                     case 1: VİZE1=satir;
                        break;
                     case 2: VİZE2=satir;
                         break;
                     case 3: VİZE3=satir;
                         break;
                     case 4: VİZE4=satir;
                         break; 
                     case 5: VİZE5=satir;
                         break;
                     case 6: VİZE6=satir;
                         break;
                     case 7: VİZE7=satir;
                         break;
                     case 8: VİZE8=satir;
                         break;
                     case 9:VİZE9=satir;
                     break;
                     default :System.out.println("hata");
                         
                 }
                  
                
                satir = reader.readLine();
            }
        }
      
          
   catch (Exception ex){
    ex.getMessage();
            } 
            
            
            try{
                 
            
                 String dosyaismi=otomasyon1.NOLABEL;  
              
         File file = new File(dosyaismi+"final.txt");
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));     
        int i=0;
        String satir = reader.readLine();
  
              while (satir!=null) {
                ++i;
                 switch (i){
                     case 1: FİNAL1=satir;
                        break;
                     case 2: FİNAL2=satir;
                         break;
                     case 3: FİNAL3=satir;
                         break;
                     case 4: FİNAL4=satir;
                         break; 
                     case 5: FİNAL5=satir;
                         break;
                     case 6: FİNAL6=satir;
                         break;
                     case 7: FİNAL7=satir;
                         break;
                     case 8: FİNAL8=satir;
                         break;
                     case 9:FİNAL9=satir;
                     break;
                     default :System.out.println("hata");
                         
                 }
                  
                
                satir = reader.readLine();
            }
        }
      
          
   catch (Exception ex){
    ex.getMessage();
            } 
            
            
      Notgörüntüleme1 run2=new Notgörüntüleme1();
        run2.setVisible(true);
        run2.setBounds(300,60,790,400);
         
            
    }
        
    }   
        
        
    
    
    public static void main(String[] args) {
        
        ÖğrenciBilgi1 run=new ÖğrenciBilgi1();
                 run.setVisible(true);
                 run.setBounds(50,50,785,570);
                 run.setDefaultCloseOperation(EXIT_ON_CLOSE);
              
    }
    
    
}
