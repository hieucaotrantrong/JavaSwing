package Buoi2;

import java.awt.FlowLayout;

import javax.swing.JButton;
/*
 |------------------------------------
 Bài 79: các thành phần và bố cục của 
 chương trình giao diện
  |-----------------------------------
 */
import javax.swing.JFrame;

public class Vidu_FlowLayout extends JFrame {
     /**
      * 
      */
     public Vidu_FlowLayout() {
          this.setTitle("Vidu_FlowLayout");
          this.setSize(600, 400);
          this.setLocationRelativeTo(null);
          /*
           * |------------------------------------
           * Set LayOut
           * |------------------------------------
           */
          FlowLayout flowLayout = new FlowLayout();
          this.setLayout(flowLayout); // Đúng cú pháp
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
          new Vidu_FlowLayout();

     }
}
