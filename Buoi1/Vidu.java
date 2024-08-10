package Buoi1;

import javax.swing.JFrame;

/*
 |---------------------------------------
 Bài 78 : Tìm hiểu về Jfame trong java
 |---------------------------------------
 */
public class Vidu {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Lap trinh java Sưing");
        jFrame.setSize(600, 500);
        jFrame.setVisible(true); // Cho phép hiển thị
        jFrame.setLocation(300, 300);// Gán vị trí hiển thị
        /*
         * |---------------------------------------
         * Thoát ra khỏi chương trinhg khi đóng
         * cửa sổ JFame
         * |---------------------------------------
         */
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}