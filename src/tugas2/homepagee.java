/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author zatri
 */
public class homepagee extends JFrame implements ActionListener{
    JLabel LabelSelamatDatang = new JLabel ("Selamat Datang");
    JLabel LabelPilihanMenu = new JLabel ("Silahkan pilih DVD yang akan dibeli ");
    JButton anakButton = new JButton("DVD Anak");
    JButton dewasaButton = new JButton("DVD Dewasa");
    JButton lansiaButton = new JButton("DVD Lansia");
    JButton logoutButton = new JButton("Logout");
   
   
    
    homepagee(String username) {
        setVisible(true);
        setSize(720, 480);
        setTitle("INI HOME");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);
        

        add(LabelSelamatDatang);
        add(LabelPilihanMenu);
        add(logoutButton);
        add(anakButton);
        add(dewasaButton);
        add(lansiaButton);

        
        LabelSelamatDatang.setBounds(20,40,200,100);
        LabelSelamatDatang.setSize(600,100);
        LabelPilihanMenu.setSize(100,400);
        LabelPilihanMenu.setBounds(20, 40, 200, 160);
        LabelPilihanMenu.setText("Silahkan pilih DVD yang akan dibeli ");
        LabelSelamatDatang.setText("Selamat Datang Lort " + username + ", MY GOAT!");
        logoutButton.setBounds(20, 200, 550, 30);
        anakButton.setBounds(20, 150, 150, 30);
        dewasaButton.setBounds(220, 150, 150, 30);
        lansiaButton.setBounds(420, 150, 150, 30);
        
    anakButton.addActionListener(this);
    dewasaButton.addActionListener(this);
    lansiaButton.addActionListener(this);
    logoutButton.addActionListener(this);
    }

    

 
@Override
    public void actionPerformed(ActionEvent e) {
    
    try{
        if (e.getSource() == logoutButton) {
        JOptionPane.showMessageDialog(this, "k goat");    
        new loginpage();
        this.dispose();
    } else if (e.getSource() == anakButton) {
        JOptionPane.showMessageDialog(this, "DVD ANAK, OKE GAS");
        new buypage("DVD Anak", 27891);
        this.dispose();
    } else if (e.getSource() == dewasaButton) {
        JOptionPane.showMessageDialog(this, "DVD DEWASA? WUTDUHAIL");
        new buypage("DVD Dewasa", 35396);
        this.dispose();
    } else if (e.getSource() == lansiaButton) {
        JOptionPane.showMessageDialog(this, "DVD LANSIA? k old mane");
        new buypage("DVD Lansia", 38550);
        this.dispose();
    }
        
    } catch(Exception error) {
            
        }
    
    
}

}


