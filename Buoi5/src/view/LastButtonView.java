package view;

import java.util.jar.JarEntry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import model.LasTButtonModel;

/*
 |---------------------------------------
 Bài 82: Tùy chỉnh font chữ và kích cỡ chữ
 của các thành phần giao diện
  |---------------------------------------
 */
public class LastButtonView extends JFrame {
    private LasTButtonModel lasTButtonModel;

    public LastButtonView() {
        this.lasTButtonModel = new LasTButtonModel();
        this.init();
    }

    /*
     * |---------------------------------------
     * Khởi tạo giao diện
     * |---------------------------------------
     */
    private void init() {
        this.setTitle("Last  Button");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jPanel_Center = new JPanel();
        jPanel_Center.setLayout(new GridLayout());
        /*
         * |---------------------------------------
         * Thêm thành phần cho button
         * |---------------------------------------
         */
        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");
    }
}