package Buoi2;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 |------------------------------------
 Bài 79: các thành phần và bố cục của 
 chương trình giao diện
  |-----------------------------------
 */
public class Vidu_BorderLayout extends JFrame {
    public Vidu_BorderLayout() {
        this.setTitle(" Vidu_BorderLayout");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        /*
         * |------------------------------------
         * Border layout
         * |------------------------------------
         */
        BorderLayout borderLayout = new BorderLayout();
        BorderLayout borderLayout2 = new BorderLayout(15, 15);
        this.setLayout(borderLayout2);
        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");
        JButton jButton_4 = new JButton("4");
        JButton jButton_5 = new JButton("5");
        /*
         * |------------------------------------
         * Thêm thành phần.vào các hướng
         * |------------------------------------
         * * Đông, Tây, Nam ,Bắc, Trung tam
         * NORTH,SOUTH,SOUTH,EAST,.CENTER
         */
        this.add(jButton_1, BorderLayout.NORTH);
        this.add(jButton_2, BorderLayout.SOUTH);
        this.add(jButton_3, BorderLayout.WEST);
        this.add(jButton_4, BorderLayout.EAST);
        this.add(jButton_5, BorderLayout.CENTER);
        /*
         * |------------------------------------
         * Đảm bảo chương trình kết thúc
         * khi đóng cửa sổ
         * |------------------------------------
         */
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*
         * |------------------------------------
         * Hiển thị giao diện thành phần
         * |------------------------------------
         */
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Vidu_BorderLayout();
    }
}