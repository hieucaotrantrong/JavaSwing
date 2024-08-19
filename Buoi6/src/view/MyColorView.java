package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
/*
|-------------------------------------
Bài 83: cách tùy chỉnh màu nền và màu
chữ cho các thành phần giao diện
|-------------------------------------
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Model.MyColorModel;

public class MyColorView extends JFrame {
    private MyColorModel myColorModel;

    private JLabel jLabel;

    public MyColorView() {
        this.myColorModel = new MyColorModel();
        this.init();
    }

    public void init() {
        this.setTitle("MyColor");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*
         * |--------------------------------------
         * Jlabel
         * |--------------------------------------
         */
        jLabel = new JLabel("Text");
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2, 3));
        /*
         * |--------------------------------------
         * JButton Red
         * |--------------------------------------
         */
        Font font = new Font("Arial", Font.BOLD, 40);
        JButton jButton_text_red = new JButton("Red Text");
        jButton_text_red.setFont(font);
        jButton_text_red.setForeground(Color.RED);
        /*
         * |--------------------------------------
         * JButton Yellow
         * |--------------------------------------
         */
        JButton jButton_text_yellow = new JButton("Yellow Text");
        jButton_text_yellow.setFont(font);
        jButton_text_yellow.setForeground(Color.YELLOW);
        /*
         * |--------------------------------------
         * JButtongreen
         * |--------------------------------------
         */
        JButton jButton_text_green = new JButton("Green Text");
        jButton_text_green.setFont(font);
        jButton_text_green.setForeground(Color.GREEN);
        /*
         * |--------------------------------------
         * Tạo màu nền backgroud Red
         * |--------------------------------------
         */
        JButton jButton_background_red = new JButton("Red Background");
        jButton_background_red.setFont(font);
        jButton_background_red.setBackground(Color.RED);
        /*
         * |--------------------------------------
         * Tạo màu nền backgroud Green
         * |--------------------------------------
         */
        JButton jButton_background_green = new JButton("Yellow Background");
        jButton_background_green.setFont(font);
        jButton_background_green.setBackground(Color.GREEN);
        /*
         * |--------------------------------------
         * Tạo màu nền backgroud yellow
         * |--------------------------------------
         */
        JButton jButton_background_yellow = new JButton("Green Background");
        jButton_background_yellow.setFont(font);
        jButton_background_yellow.setBackground(Color.YELLOW);
        /*
         * |--------------------------------------
         * Thêm thành phần vào Jpanel
         * |--------------------------------------
         */
        jPanel.add(jButton_text_red);
        jPanel.add(jButton_text_yellow);
        jPanel.add(jButton_text_green);
        jPanel.add(jButton_background_red);
        jPanel.add(jButton_background_yellow);
        jPanel.add(jButton_background_green);
        this.setLayout(new BorderLayout());
        this.add(jLabel, BorderLayout.NORTH);
        this.add(jPanel, BorderLayout.CENTER);
        /*
         * |--------------------------------------
         * Hiển thị giao diện
         * |--------------------------------------
         */
        this.setVisible(true);
    }

}
