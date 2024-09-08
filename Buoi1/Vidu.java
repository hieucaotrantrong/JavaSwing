package Buoi1;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 |---------------------------------------
 Bài 78 : Tìm hiểu về Jfame trong java
 |---------------------------------------
 */
public class Vidu {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Lap trinh java Swing");
        jFrame.setSize(600, 500);
        JButton jButton = new JButton("Click me");
        jFrame.setLocation(300, 300);// Gán vị trí hiển thị
        jButton.setBounds(40, 90, 85, 20);
        jFrame.add(jButton);
        jFrame.setVisible(true); // Cho phép hiển thị
        /*
         * |---------------------------------------
         * Thoát ra khỏi chương trình khi đóng
         * cửa sổ JFame
         * |---------------------------------------
         */
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}