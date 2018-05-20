
package ınterfaceprojem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ÖğrenciEkle1 extends JFrame implements ActionListener{
    private Container con;
    private JLabel arkaplan5;
    private JLabel ıconlabel;
    private JLabel no,tc,ad,sınıf,fakulte,bolum,program,donem,sıfre;
    private JTextField notext,tctext,adtext,sıfretext;
    private JComboBox sınıfcombo,fakultecombo,bolumcombo,programcombo,donemcombo;
    private JButton göster,ekle,güncelle,sil,temizle;
    private ImageIcon resim1,resim2;

    public ÖğrenciEkle1(){
        String [] dizisınıf={null,"1","2","3","4"};
        String [] dizifakulte={null,"Muhendislik Fakultesi","Mimarlık Fakultesi","Egitim Fakultesi"};
        String [] dizibolum={null,"Elektrik Elektronik Muhendisligi","Bilgisayar Muhendisligi","İnşaat Muhendisligi",
            "Makina Muhendisligi","Çevre Muhendisligi","Gıda Muhendisligi","Matematik Ögretmenligi","Mimarlık"};
        String [] diziprogram={null,"Bilgisayar Muhendisligi (İngilizce)","Bilgisayar Muhendisligi (Lisans)","Elektrik Elektronik Muhendisligi (Lisans)",
"Makina Muhendisligi (Lisans)",
"İnşaat Muhendisligi (Lisans)",
"Çevre Muhendisligi (Lisans)",
"Gıda Muhendisligi (Lisans)",
"Matematik Ögretmenligi (Lisans)",
"Mimarlık (İngilizce)",
"Mimarlık (Lisans)"};
          String [] dizidonem={null,"1","2","3","4","5","6","7","8"};




        setTitle("Kayıt Ekle");
        con=getContentPane();
        con.setLayout(null);
        
        
        //label
        resim1=new ImageIcon("arkaplan3.jpg");
        arkaplan5=new JLabel(resim1);
        arkaplan5.setBounds(0,0,820,420);
        
        resim2=new ImageIcon("user.png");
        ıconlabel=new JLabel(resim2);
        ıconlabel.setBounds(40,60,280,280);
        
        Font f=new Font("tahoma",Font.BOLD,12);
        no=new JLabel("Öğrenci no");
        no.setBounds(340,50,80,14);
        no.setFont(f);
        
        
        tc=new JLabel("T.C no");
        tc.setBounds(340,90,80,14);
        tc.setFont(f);
        
        ad=new JLabel("Ad soyad");
        ad.setBounds(340,130,80,14);
        ad.setFont(f);
        
        sınıf=new JLabel("Sınıf");
        sınıf.setBounds(340,170,80,14);
        sınıf.setFont(f);
        
        fakulte=new JLabel("Fakülte");
        fakulte.setBounds(340,210,80,14);
        fakulte.setFont(f);
        
        bolum=new JLabel("Bölüm");
        bolum.setBounds(340,250,80,14);
        bolum.setFont(f);
        
        program=new JLabel("Program");
        program.setBounds(340,290,80,14);
        program.setFont(f);
        
        donem=new JLabel("Dönem");
        donem.setBounds(340,330,80,14);
        donem.setFont(f);
       
        sıfre=new JLabel("Şifre");
        sıfre.setBounds(340,370,80,14);
        sıfre.setFont(f);
        
        
        //textfield
        notext=new JTextField();
        notext.setBounds(510,40,190,30);
        
        
        tctext=new JTextField();
        tctext.setBounds(510,80,190,30);
        
        adtext=new JTextField();
        adtext.setBounds(510,120,190,30);
        
        sıfretext=new JTextField();
        sıfretext.setBounds(510,360,190,30);
       
        
        //comboBox
        sınıfcombo=new JComboBox(dizisınıf);
        sınıfcombo.setBounds(510,160,190,30);
       
        fakultecombo=new JComboBox(dizifakulte);
        fakultecombo.setBounds(510,200,190,30);
        
        bolumcombo=new JComboBox(dizibolum);
        bolumcombo.setBounds(510,240,190,30);
        
        programcombo=new JComboBox(diziprogram);
        programcombo.setBounds(510,280,190,30);
        
        donemcombo=new JComboBox(dizidonem);
        donemcombo.setBounds(510,320,190,30);
        
        
        
        göster=new JButton("Göster");
        göster.setBounds(720,90,90,40);
        göster.setFont(f);
        
        ekle=new JButton("Ekle");
        ekle.setBounds(720,140,90,40);
        ekle.setFont(f);
        
        güncelle=new JButton("Güncelle");
        güncelle.setBounds(720,190,90,40);
        güncelle.setFont(f);
        
        sil=new JButton("Sil");
        sil.setBounds(720,240,90,40);
        sil.setFont(f);
       
        temizle=new JButton("Temizle");
        temizle.setBounds(720,300,90,25);
        temizle.setFont(f);
        
       con.add(arkaplan5);
       arkaplan5.add(ıconlabel);
       arkaplan5.add(no);
       arkaplan5.add(tc);        
       arkaplan5.add(ad);       
       arkaplan5.add(sınıf);        
       arkaplan5.add(fakulte);        
       arkaplan5.add(bolum);
       arkaplan5.add(program);
       arkaplan5.add(donem);
       arkaplan5.add(sıfre);
       arkaplan5.add(notext);
       arkaplan5.add(tctext);
       arkaplan5.add(adtext);
       arkaplan5.add(sıfretext);
       arkaplan5.add(fakultecombo);
       arkaplan5.add(bolumcombo);
       arkaplan5.add(programcombo);
       arkaplan5.add(donemcombo);
       arkaplan5.add(sınıfcombo);
       arkaplan5.add(göster);
       arkaplan5.add(ekle);
       arkaplan5.add(temizle);
       arkaplan5.add(güncelle);
       arkaplan5.add(sil);
       
       göster.addActionListener(this);
       ekle.addActionListener(this);
       güncelle.addActionListener(this);
       sil.addActionListener(this);
       temizle.addActionListener(this);
       
       
       
    }
  
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==göster){
           try{ 
               String path=notext.getText()+".txt";
            File file=new File(path);
            if(file.exists()){
                 BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));     
        int i=0;
        String satir = reader.readLine();
  String []a1=new String[9];
 
              while (satir!=null) {
                ++i;
                 switch (i){
                     case 1: a1[0]=satir;
                        break;
                     case 2: a1[1]=satir;
                         break;
                     case 3: a1[2]=satir;
                         break;
                     case 4: a1[3]=satir;
                         break; 
                     case 5: a1[4]=satir;
                         break;
                     case 6: a1[5]=satir;
                         break;
                     case 7: a1[6]=satir;
                         break;
                     case 8: a1[7]=satir;
                         break;
                     case 9: a1[8]=satir;
                     break;
                     default :System.out.println("hata");
                         
                 }
                 notext.setText(a1[0]);
                 tctext.setText(a1[1]);
                 adtext.setText(a1[2]);
                 sınıfcombo.setSelectedItem(a1[3]);
                 fakultecombo.setSelectedItem(a1[4]);
                 bolumcombo.setSelectedItem(a1[5]);
                 programcombo.setSelectedItem(a1[6]);
                 donemcombo.setSelectedItem(a1[7]);
                 sıfretext.setText(a1[8]);
                 
                 
                 
                satir = reader.readLine();
            }
               reader.close();
            }else{
                JOptionPane.showMessageDialog(con,"Öğrenci bulunamadı!");
            }
            
           
       
           }catch(Exception ex){
            ex.getMessage();
        }
        }
        if(e.getSource()==sil){
            String path=notext.getText()+".txt";
            File file=new File(path);
            try{
              if(file.exists()){
         
                  int result1 = JOptionPane.showConfirmDialog(con, 
                        "Öğrenci silinecektir emin misiniz?",null, JOptionPane.YES_NO_OPTION);
                  if(result1==JOptionPane.YES_OPTION){
                   

                  file.delete();
                  
                  JOptionPane.showMessageDialog(con,"Öğrenci silindi.");}
                  else{
                      
                  }
              }
              else{
                  JOptionPane.showMessageDialog(con,"Öğrenci bulunamadı!");
              }
            }catch(Exception ex){
                ex.getMessage();
            }
        
        }        
        
        if(e.getSource()==temizle){
            notext.setText("");
            tctext.setText("");
            adtext.setText("");
            sıfretext.setText("");
            fakultecombo.setSelectedItem("");
            bolumcombo.setSelectedItem("");
            programcombo.setSelectedItem("");
            donemcombo.setSelectedItem("");
            sınıfcombo.setSelectedItem("");
            
        }
        
        if(e.getSource()==güncelle){
             String path=notext.getText()+".txt";
            File file=new File(path);
            if(!file.exists()){
                JOptionPane.showMessageDialog(con,"Öğrenci bulunamadı!");
            }else{
                int result1 = JOptionPane.showConfirmDialog(con, 
                        "Öğrenci güncellenecektir emin misiniz?",null, JOptionPane.YES_NO_OPTION);
                if(result1==JOptionPane.YES_OPTION){
                
                
                
             if(notext.getText().equals("") || notext.getText().length()!=11 || tctext.getText().length()!=11 || 
          sıfretext.getText().length()<6 || adtext.getText().length()<3 || fakultecombo.getSelectedItem().equals("")
           || bolumcombo.getSelectedItem().equals("")||programcombo.getSelectedItem().equals("")||
           donemcombo.getSelectedItem().equals("")||sınıfcombo.getSelectedItem().equals("")){
                    
                JOptionPane.showMessageDialog(con,"Lütfen bilgileri tekrar kontrol ediniz!");
            } else{
      
           JOptionPane.showMessageDialog(con, "Öğrenci güncelledi");
            String [] bilgiler=new String[9];
                bilgiler[0]=notext.getText();
                bilgiler[1]=tctext.getText();
                bilgiler[2]=adtext.getText();
                bilgiler[3]=sınıfcombo.getSelectedItem().toString();
                bilgiler[4]=fakultecombo.getSelectedItem().toString();
                bilgiler[5]=bolumcombo.getSelectedItem().toString();
                bilgiler[6]=programcombo.getSelectedItem().toString();
                bilgiler[7]=donemcombo.getSelectedItem().toString();
                bilgiler[8]=sıfretext.getText();
                
            try {
                
                PrintWriter pw=new PrintWriter(file);
                for (int i = 0; i <9; i++) {
                    pw.println(bilgiler[i]);
                }
                pw.close();
            
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ÖğrenciEkle1.class.getName()).log(Level.SEVERE, null, ex);
            }
             
             
             
             
             }}}
        }
        
        
        if(e.getSource()==ekle){
            if(notext.getText().equals("") || notext.getText().length()!=11 || tctext.getText().length()!=11 || 
          sıfretext.getText().length()<6 || adtext.getText().length()<3 || fakultecombo.getSelectedItem().equals("")
           || bolumcombo.getSelectedItem().equals("")||programcombo.getSelectedItem().equals("")||
           donemcombo.getSelectedItem().equals("")||sınıfcombo.getSelectedItem().equals("")){
                    
                JOptionPane.showMessageDialog(con,"Lütfen bilgileri tekrar kontrol ediniz!");
            }
            else{
            String path=notext.getText()+".txt";
            File file=new File(path);
           
                if(!file.exists()){
                try {
                    file.createNewFile();
                    JOptionPane.showMessageDialog(con,"Öğrenci Oluşturuldu");
                } catch (IOException ex) {
                    Logger.getLogger(ÖğrenciEkle1.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                String [] bilgiler=new String[9];
                bilgiler[0]=notext.getText();
                bilgiler[1]=tctext.getText();
                bilgiler[2]=adtext.getText();
                bilgiler[3]=sınıfcombo.getSelectedItem().toString();
                bilgiler[4]=fakultecombo.getSelectedItem().toString();
                bilgiler[5]=bolumcombo.getSelectedItem().toString();
                bilgiler[6]=programcombo.getSelectedItem().toString();
                bilgiler[7]=donemcombo.getSelectedItem().toString();
                bilgiler[8]=sıfretext.getText();
                
                
                //dosyaya satır satır verileri kaydeder.
                
            try {
                
                PrintWriter pw=new PrintWriter(file);
                for (int i = 0; i <9; i++) {
                    pw.println(bilgiler[i]);
                }
                pw.close();
            
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ÖğrenciEkle1.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
                
           }else{
                    JOptionPane.showMessageDialog(con, "Öğrenci zaten mevcut!");
                }
                
            
        }}
            
        
    }
    public static void main(String[] args) {
        ÖğrenciEkle1 run =new ÖğrenciEkle1();
        run.setVisible(true);
        run.setBounds(50,50,835,457);
        run.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    
    
}
