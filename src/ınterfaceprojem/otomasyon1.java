
package ınterfaceprojem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class otomasyon1 extends JFrame implements ActionListener {
    private Container container;
    private JLabel arkalabel;
    private JLabel kullanıcılabel;//
    private JLabel şifre;//
  public static JTextField kullanıcıtext;//
    private JPasswordField şifretext;//
    private JButton girişbuton;//
    private JButton temizlebuton;//
    private ImageIcon arkaresim;
    
    
  public  static String NOLABEL;
  public  static String TCLABEL;
  public  static String ADLABEL;
  public  static String SINIFLABEL;
  public  static String FAKULTELABEL;
  public  static String BOLUMLABEL;
  public  static String PROGRAMLABEL;
  public  static String DONEMLABEL;
  public static String SIFRE;
    
    public otomasyon1(){
        setTitle("Otomasyon Sistemi");
        
        container=getContentPane();
        container.setLayout(null);
        
       arkaresim=new ImageIcon("arkaplan1.jpg");
        arkalabel=new JLabel(arkaresim);
        arkalabel.setBounds(0,0,665,480);
        
        
         Font f=new Font("tahoma",Font.BOLD,14);
        kullanıcılabel=new JLabel("Kullanıcı Adı:");
        kullanıcılabel.setBounds(324,245,90,20); //90 20 320 250
       kullanıcılabel.setForeground(Color.WHITE);
       kullanıcılabel.setFont(f);
        
        şifre=new JLabel("Şifre:");
        şifre.setBounds(370,305,40,20); //40 20 370 310 
          şifre.setForeground(Color.WHITE);
         şifre.setFont(f);
        
        
        
        
        kullanıcıtext=new JTextField();
        kullanıcıtext.setBounds(410,240,210,30); //210 30 410 240
        
        şifretext=new JPasswordField();
        şifretext.setBounds(410,300,210,30); //210 30 410 300
        
        
        ImageIcon butongiriş=new ImageIcon("butongiriş.png");
        girişbuton=new JButton("Giriş",butongiriş);
        girişbuton.setBounds(520,365,100,40);
        Font yazıbuton=new Font("Tahoma",Font.BOLD,14);
        girişbuton.setFont(yazıbuton);
        
        
        ImageIcon butontemizle=new ImageIcon("butontemizle.png");
        temizlebuton=new JButton("Temizle",butontemizle);
        temizlebuton.setBounds(410,365,100,40);
        Font yazıbuton1=new Font("Tahoma",Font.PLAIN,11);
        temizlebuton.setFont(yazıbuton1);
       
        
        
        container.add(arkalabel);
        arkalabel.add(kullanıcılabel);
        arkalabel.add(şifre);
        arkalabel.add(kullanıcıtext);
        arkalabel.add(şifretext);
        arkalabel.add(girişbuton);
        arkalabel.add(temizlebuton);
        
        
        girişbuton.addActionListener(this);
        temizlebuton.addActionListener(this);
        
  
    }
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==temizlebuton){
         try{
             
         
          kullanıcıtext.setText("");
          şifretext.setText("");}
         catch (Exception ex){
             ex.getMessage();
         }
        }
        if(e.getSource()==girişbuton){
            try{
              String dosyaismi=kullanıcıtext.getText();  
              
         File file = new File(dosyaismi+".txt");
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));     
        int i=0;
        String satir = reader.readLine();
  
              while (satir!=null) {
                ++i;
                 switch (i){
                     case 1: NOLABEL=satir;
                        break;
                     case 2: TCLABEL=satir;
                         break;
                     case 3: ADLABEL=satir;
                         break;
                     case 4: SINIFLABEL=satir;
                         break; 
                     case 5: FAKULTELABEL=satir;
                         break;
                     case 6: BOLUMLABEL=satir;
                         break;
                     case 7: PROGRAMLABEL=satir;
                         break;
                     case 8: DONEMLABEL=satir;
                         break;
                     case 9:SIFRE=satir;
                     break;
                     default :System.out.println("hata");
                         
                 }
                  
                
                satir = reader.readLine();
            }
                
               if(kullanıcıtext.getText().equals(NOLABEL) && şifretext.getText().equals(SIFRE) ) {
                JOptionPane.showMessageDialog(container,"Giriş Başarılı");
                 ÖğrenciBilgi1 run=new ÖğrenciBilgi1();
                 run.setVisible(true);
                 run.setBounds(300,100,785,570);
                 
           
               }
               else{
                   JOptionPane.showMessageDialog(container, "Kullanıcı adı veya Şifre hatalı!");
               }
       
            }catch (Exception ex){
                ex.getMessage();
            }
        }
        
 
        
    }
    
    public static void main(String[] args)throws Exception{
        otomasyon1 b=new otomasyon1();
          b.setVisible(true);
          b.setSize(665,480);
      
        b.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
