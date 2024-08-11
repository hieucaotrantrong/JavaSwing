package Buoi2;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
/*
 |------------------------------------
 Bài 79: các thành phần và bố cục của 
 chương trình giao diện
  |-----------------------------------
 */
import javax.swing.JFrame;

public class Vidu_GridLayout extends JFrame {
     /**
      * 
      */
     public Vidu_GridLayout() {
          this.setTitle("Vidu_GridLayout");
          this.setSize(600, 400);
          this.setLocationRelativeTo(null);
          /*
           * |------------------------------------
           * Set LayOut
           * |------------------------------------
           */
          GridLayout gridLayout = new GridLayout(4, 4);
          this.setLayout(gridLayout);
          JButton jButton_1 = new JButton("1");
          JButton jButton_2 = new JButton("2");
          JButton jButton_3 = new JButton("3");
          /*
           * |------------------------------------
           * Add thành phần của Button
           * |------------------------------------
           */
          this.add(jButton_1);
          this.add(jButton_2);
          this.add(jButton_3);
          /*
           * * |------------------------------------
           * this.setDefaultCloseOperation
           * (JFrame.EXIT_ON_CLOSE);
           * * |------------------------------------
           * Đảm bảo chương trình kết thúc khi đóng cửa sổ
           */
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          /*
           * |------------------------------------
           * this.setVisible(true);
           * |------------------------------------
           * * Hiển thị giao diện JFame
           */
          this.setVisible(true);
     }

     public static void main(String[] args) {
          new Vidu_GridLayout();

     }
}
