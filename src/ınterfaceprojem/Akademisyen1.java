
package ınterfaceprojem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.*;

public class Akademisyen1 extends JFrame implements ActionListener{
    private Container container;
    private JLabel arkalabel;
    private JLabel kullanıcılabel;//
    private JLabel şifre;//
    private JTextField kullanıcıtext1;//
    private JPasswordField şifretext1;//
    private JButton girişbuton;//
    private JButton temizlebuton;//
    private ImageIcon arkaresim;
    public  static String KULLANICIADI;
  public  static String SIFRE1;
  
    public Akademisyen1(){
        setTitle("Otomasyon Sistemi");
        
        container=getContentPane();
        container.setLayout(null);
        
       arkaresim=new ImageIcon("akademisyen giriş.jpg");
        arkalabel=new JLabel(arkaresim);
        arkalabel.setBounds(0,0,650,450);
        
        
         Font f=new Font("tahoma",Font.BOLD,14);
        kullanıcılabel=new JLabel("Kullanıcı Adı:");
        kullanıcılabel.setBounds(324,245,90,20); //90 20 320 250
       kullanıcılabel.setForeground(Color.WHITE);
       kullanıcılabel.setFont(f);
        
        şifre=new JLabel("Şifre:");
        şifre.setBounds(370,305,40,20); //40 20 370 310 
          şifre.setForeground(Color.WHITE);
         şifre.setFont(f);
        
        
        
        
        kullanıcıtext1=new JTextField();
        kullanıcıtext1.setBounds(410,240,210,30); //210 30 410 240
        
        şifretext1=new JPasswordField();
        şifretext1.setBounds(410,300,210,30); //210 30 410 300
        
        
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
        arkalabel.add(kullanıcıtext1);
        arkalabel.add(şifretext1);
        arkalabel.add(girişbuton);
        arkalabel.add(temizlebuton);
        
        girişbuton.addActionListener(this);
        temizlebuton.addActionListener(this);
        
     
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==temizlebuton)
        {
            kullanıcıtext1.setText("");
            şifretext1.setText("");
        }
        if(ae.getSource()==girişbuton){
            try{
              String dosyaismi=kullanıcıtext1.getText();  
              
         File file = new File(dosyaismi+".txt");
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));     
        int i=0;
        String satir = reader.readLine();
  
              while (satir!=null) {
                ++i;
                 switch (i){
                     case 1: KULLANICIADI=satir;
                        break;
                     case 2: SIFRE1=satir;
                         break;
                    
                     default :System.out.println("hata");
                         
                 }
                  
                satir = reader.readLine(); 
            }
               
               if(kullanıcıtext1.getText().equals(KULLANICIADI) && şifretext1.getText().equals(SIFRE1) ) {
                JOptionPane.showMessageDialog(container,"Giriş Başarılı");
                 ÖğrenciEkle1 run=new ÖğrenciEkle1();
                 run.setVisible(true);
                 run.setSize(835,457);
                 
           
               }
               else{
                   JOptionPane.showMessageDialog(container, "Kullanıcı adı veya Şifre hatalı!");
               }
       
            }catch (Exception ex){
                ex.getMessage();
            }
            
            
            
        }
        
        
        
    }
    public static void main(String[] args) {
        Akademisyen1 b=new Akademisyen1();
          b.setVisible(true);
          b.setSize(665,475);
      b.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      b.pack();
        b.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

   
    
}
