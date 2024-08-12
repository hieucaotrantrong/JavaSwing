package Buoi3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
/*
|-------------------------------------
Bài 80: Cách sử dụng Jpanl và cấu hình 
Look and Fell cho giao diện chương 
trình java
|-------------------------------------
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCalculator extends JFrame {
    public MyCalculator() {
        this.setTitle("MyCalculator ");
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*
         * |-------------------------------------
         * Tạo 1 trường văn bản
         * |-------------------------------------
         * JTextField jTextField = new JTextField();
         */
        JTextField jTextField = new JTextField(50);
        this.add(jTextField);
        /*
         * |-------------------------------------
         * JPanel
         * |-------------------------------------
         */
        JPanel jPanel_head = new JPanel();
        jPanel_head.setLayout(new BorderLayout());
        jPanel_head.add(jTextField, BorderLayout.CENTER);
        /*
         * |-------------------------------------
         * Thêm thành phần cho nút button
         * |-------------------------------------
         */
        JButton jButton_0 = new JButton("0");
        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");
        JButton jButton_4 = new JButton("4");
        JButton jButton_5 = new JButton("5");
        JButton jButton_6 = new JButton("6");
        JButton jButton_7 = new JButton("7");
        JButton jButton_8 = new JButton("8");
        JButton jButton_9 = new JButton("9");
        JButton jButton_cong = new JButton("+");
        JButton jButton_tru = new JButton("-");
        JButton jButton_nhan = new JButton("*");
        JButton jButton_chia = new JButton("/");
        JButton jButton_bang = new JButton("=");
        JPanel jPanel_button = new JPanel();
        jPanel_button.setLayout(new GridLayout(5, 3));
        /*
         * |-------------------------------------
         * Setlayout
         * |-------------------------------------
         */
        jPanel_button.add(jButton_0);
        jPanel_button.add(jButton_1);
        jPanel_button.add(jButton_2);
        jPanel_button.add(jButton_3);
        jPanel_button.add(jButton_4);
        jPanel_button.add(jButton_5);
        jPanel_button.add(jButton_6);
        jPanel_button.add(jButton_7);
        jPanel_button.add(jButton_8);
        jPanel_button.add(jButton_9);
        jPanel_button.add(jButton_bang);
        jPanel_button.add(jButton_chia);
        jPanel_button.add(jButton_cong);
        jPanel_button.add(jButton_nhan);
        jPanel_button.add(jButton_tru);

        /*
         * |-------------------------------------
         * 
         * |-------------------------------------
         */
        this.setLayout(new BorderLayout());
        this.add(jPanel_head, BorderLayout.NORTH);
        this.add(jPanel_button, BorderLayout.CENTER);
        /*
         * |-------------------------------------
         * Hiển thị giao diện
         * |-------------------------------------
         */
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MyCalculator();
    }
}
