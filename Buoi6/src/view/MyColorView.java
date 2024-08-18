package view;

/*
|-------------------------------------
Bài 83: cách tùy chỉnh màu nền và màu
chữ cho các thành phần giao diện
|-------------------------------------
 */
import javax.swing.JFrame;

import Model.MyColorModel;

public class MyColorView extends JFrame {
    private MyColorModel myColorModel;

    public MyColorView() {
        this.myColorModel = new MyColorModel();
        this.init();
    }

    private void init() {
        this.setTitle("MyColor");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
