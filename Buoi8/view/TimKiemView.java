package view;

import javax.swing.JButton;
/*
 |-------------------------------------------
 Bài 85: cách sử dụng jtextArea để hiển thị
 và nhập dữ liệu văn bản nhiều dòng
  |-------------------------------------------
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.TimkiemListner;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import model.TimKiemModel;

public class TimKiemView extends JFrame {
    private TimKiemModel timKiemModel;
    private JTextArea jTextArea_vanBan;
    private JTextField jTextField_tuKhoa;
    private JLabel jLabel_ketQua;
    private Container jPanel_center;

    public TimKiemView() throws HeadlessException {
        this.timKiemModel = new TimKiemModel();
        this.init();
    }

    private void init() {
        this.setTitle("Tim Kiem");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*
         * |-------------------------------------------
         */
        Font font = new Font("Arial", Font.BOLD, 40);
        JLabel jLabel_vanBan = new JLabel("Van Ban");
        jLabel_vanBan.setFont(font);
        jTextArea_vanBan = new JTextArea(10, 50);
        jTextArea_vanBan.setFont(font);

        /*
         * |-------------------------------------------
         * Footer
         */

        TimkiemListner timkiemListner = new TimkiemListner(this);
        JLabel jLabel_tuKhoa = new JLabel(" Tu Khoa");
        jLabel_tuKhoa.setFont(font);
        jTextField_tuKhoa = new JTextField();
        jTextField_tuKhoa.setFont(font);
        /*
         * |-------------------------------------------
         * Footer
         */
        JButton jButton_thongke = new JButton("Thong ke");
        jButton_thongke.setFont(font);
        jButton_thongke.addActionListener(timkiemListner);

        jButton_thongke.setBackground(Color.BLUE);

        /*
         * |-------------------------------------------
         * Ket qua
         */
        jLabel_ketQua = new JLabel();
        jLabel_ketQua.setFont(font);
        jLabel_ketQua.setBackground(Color.BLUE);
        /*
         * |-------------------------------------------
         * Footer
         */
        JPanel jPanel_footer = new JPanel();
        jPanel_footer.setLayout(new GridLayout(2, 2, 20, 20));
        jPanel_footer.add(jLabel_tuKhoa);
        jPanel_footer.add(jTextField_tuKhoa);
        jPanel_footer.add(jButton_thongke);
        jPanel_footer.add(jLabel_ketQua);

        /*
         * |-------------------------------------------
         */
        this.setLayout(new BorderLayout());
        this.add(jLabel_vanBan, BorderLayout.NORTH);
        this.add(jTextArea_vanBan, BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void timKiem() {
        this.timKiemModel.setVanBan(jTextArea_vanBan.getText());
        this.timKiemModel.setTuKhoa(jTextField_tuKhoa.getText());
        this.timKiemModel.timKiem();
        this.jLabel_ketQua.setText(this.timKiemModel.getKetQua());
    }
}
