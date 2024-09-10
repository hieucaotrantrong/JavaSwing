package view;

import java.awt.BorderLayout;

/*
|---------------------------------------
 Bài 88: Cách vẽ và hiển thị các hình ảnh
 cơ bản
|---------------------------------------
 */
import javax.swing.JFrame;

public class DrawExempleView extends JFrame {
    public DrawExempleView() {
        this.setTitle("Draw Exemple");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        JpanlDraw jpanlDraw = new JpanlDraw();
        this.setLayout(new BorderLayout());
        this.add(jpanlDraw, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new DrawExempleView();
    }
}
