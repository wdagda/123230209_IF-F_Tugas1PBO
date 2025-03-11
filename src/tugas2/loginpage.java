/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.*;

/**
 *
 * @author zatri
 */
public class loginpage extends JFrame implements ActionListener {
    
    JLabel tulisann = new JLabel("INI LOGIN YA BOLO");
    JLabel usernemlebele = new JLabel("Username     :");
    JLabel paswodlebele = new JLabel("Password     :");
    JTextField inputU = new JTextField();
    JPasswordField inputP = new JPasswordField();
    JButton loginB = new JButton("LOGIN");
    JButton resetB = new JButton("RENGSET");
    JButton soundcloudB = new JButton("gipa's special");
    
    
    
    loginpage(){
        setVisible(true);
        setSize(720, 480);
        setTitle("LOGIN BOLO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //diclose biar exit, klo kg masih running background
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);
        
        //komp GUI
        add(tulisann);
        add(usernemlebele);
        add(paswodlebele);
        add(inputU);
        add(inputP);
        add(loginB);
        add(resetB);
        add(soundcloudB);
        
        //setposition
        tulisann.setBounds(210,10,150, 24);  //set posisi. x dari kiri, y dari atas, panjang komp, ttinggi komp.
        usernemlebele.setBounds(20, 85, 440, 12);
        paswodlebele.setBounds(20, 153, 440, 12);
        inputU.setBounds(18, 100, 440, 32);
        inputP.setBounds(18, 170, 440, 32);
        loginB.setBounds(50, 220, 150, 32);
        resetB.setBounds(280, 220, 150, 32);
        soundcloudB.setBounds(165, 270, 150, 32);
        
        loginB.addActionListener(this);
        resetB.addActionListener(this);
        soundcloudB.addActionListener(this);
    }
    
    
    //event handling
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        try {
            if (e.getSource() == loginB) {
                String uname = inputU.getText();
                char[] passchar = inputP.getPassword();
                String paswod = new String(passchar);
                
                if (uname.equals("123230209") && paswod.equals("902032321")) {
                    System.out.println("sukses yey");
                    JOptionPane.showMessageDialog(this, "SUKES SEK LOGIN KANG");
                    new homepagee(uname); //buka tab hommpage
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "GAGAL LOGIN BOLOOOOOO");
                }
                
                
            }else if(e.getSource()==resetB) {
                inputP.setText("");
                inputU.setText("");
                JOptionPane.showMessageDialog(this, "wes tak riset");
                
            }else if (e.getSource() == soundcloudB) {
                    JOptionPane.showMessageDialog(this, "suwun yh kack udh open punya aing");
                    Desktop.getDesktop().browse(new URI("https://soundcloud.com/xighaav"));
                    this.dispose();
            }
        } catch(Exception error) {
            
        }
        
    }
    
    
    
}
