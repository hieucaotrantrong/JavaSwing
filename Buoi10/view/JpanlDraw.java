package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/*
|---------------------------------------
 Bài 88: Cách vẽ và hiển thị các hình ảnh
 cơ bản
|---------------------------------------
 */
public class JpanlDraw extends JPanel {
    public JpanlDraw() {
        this.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        g.drawLine(15, 15, 50, 150);
        g.setColor(Color.BLUE);
        g.drawOval(255, 255, 50, 50);
        g.setColor(Color.green);
        g.drawRect(45, 150, 30, 90);
        g.setColor(Color.pink);
        g.fillOval(400, 300, 50, 50);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(100, 100, 150, 150);
    }

}