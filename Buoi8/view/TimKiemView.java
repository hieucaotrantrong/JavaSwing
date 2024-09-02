package Buoi8.view;

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

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import Buoi8.model.TimKiemModel;

public class TimKiemView extends JFrame {
    private TimKiemModel timKiemModel;
    private JTextArea jTextArea_vanBan;
    private JTextField jTextField_tuKhoa;

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
        jTextArea_vanBan = new JTextArea(100, 100);
        jTextArea_vanBan.setFont(font);
        /*
         * |-------------------------------------------
         */
        JLabel jLabel_tuKhoa = new JLabel(" Tu Khoa");
        jLabel_tuKhoa.setFont(font);
        jTextField_tuKhoa = new JTextField();
        jTextField_tuKhoa.setFont(font);
        /*
         * |-------------------------------------------
         */
        JPanel jPanel_center = new JPanel();
        jPanel_center.setLayout(new GridLayout(4, 1));
        jPanel_center.add(jLabel_vanBan);
        jPanel_center.add(jTextArea_vanBan);
        jPanel_center.add(jLabel_tuKhoa);
        jPanel_center.add(jTextField_tuKhoa);
        /*
         * |-------------------------------------------
         */
        this.setLayout(new BorderLayout());
        this.add(jPanel_center, BorderLayout.CENTER);
        this.setVisible(true);
    }

}
