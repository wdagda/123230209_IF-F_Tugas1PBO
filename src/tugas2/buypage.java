/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author zatri    
 */

public class buypage extends JFrame {

    JLabel lJudul = new JLabel("Halaman Pembelian", SwingConstants.CENTER);
    JLabel lKategori, lHarga, lJumlah = new JLabel("Jumlah:");
    JTextField iJumlah = new JTextField();
    JButton bBuy = new JButton("Beli"), bBack = new JButton("Kembali");

    JPanel pTotal = new JPanel(new GridLayout(4, 2, 10, 10));
    JLabel lHargaSatuan = new JLabel("Harga Satuan:");
    JLabel lJumlahBeli = new JLabel("Jumlah:");
    JLabel lPPN = new JLabel("PPN (11%):");
    JLabel lHargaTotal = new JLabel("Total Harga:");
    
    JLabel vHargaSatuan = new JLabel("Rp0", SwingConstants.RIGHT);
    JLabel vJumlahBeli = new JLabel("0 pcs", SwingConstants.RIGHT);
    JLabel vPPN = new JLabel("Rp0", SwingConstants.RIGHT);
    JLabel vHargaTotal = new JLabel("Rp0", SwingConstants.RIGHT);

    public buypage(String kategori, int harga) {
        setTitle("Pembelian DVD");
        setSize(720, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        lKategori = new JLabel("Kategori: " + kategori);
        lHarga = new JLabel("Harga: Rp" + String.format("%,d", harga) + "/pcs");

        lJudul.setBounds(160, 20, 400, 40);
        lKategori.setBounds(50, 100, 300, 30);
        lHarga.setBounds(50, 140, 300, 30);
        lJumlah.setBounds(50, 190, 100, 30);
        iJumlah.setBounds(160, 190, 100, 30);
        bBuy.setBounds(50, 240, 120, 40);
        bBack.setBounds(190, 240, 120, 40);
        pTotal.setBounds(400, 100, 280, 200);

        // ** Configure Panel **  
        pTotal.setBorder(BorderFactory.createTitledBorder("Detail Harga"));
        pTotal.add(lHargaSatuan); pTotal.add(vHargaSatuan);
        pTotal.add(lJumlahBeli); pTotal.add(vJumlahBeli);
        pTotal.add(lPPN); pTotal.add(vPPN);
        pTotal.add(lHargaTotal); pTotal.add(vHargaTotal);

        add(lJudul); add(lKategori); add(lHarga);
        add(lJumlah); add(iJumlah); add(bBuy); add(bBack); add(pTotal);

        bBuy.addActionListener(e -> {
            try {
                int jumlah = Integer.parseInt(iJumlah.getText().trim());
                if (jumlah <= 0) throw new NumberFormatException();
                
                double ppn = jumlah * harga * 0.11;
                double total = jumlah * harga + ppn;

                vHargaSatuan.setText("Rp" + String.format("%,d", harga));
                vJumlahBeli.setText(jumlah + " pcs");
                vPPN.setText("Rp" + String.format("%,.0f", ppn));
                vHargaTotal.setText("Rp" + String.format("%,.0f", total));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Masukkan jumlah yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        bBack.addActionListener(e -> dispose());
        setVisible(true);
    }
}
