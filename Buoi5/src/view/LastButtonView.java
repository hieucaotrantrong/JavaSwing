package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.LastButtonListener;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import model.LasTButtonModel;

/*
 |---------------------------------------
 Bài 82: Tùy chỉnh font chữ và kích cỡ chữ
 của các thành phần giao diện
  |---------------------------------------
 */
public class LastButtonView extends JFrame {
    private LasTButtonModel lasTButtonModel;
    private JLabel jLabel;

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
        this.setTitle("Last Button");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jPanel_Center = new JPanel();
        jPanel_Center.setLayout(new GridLayout(2, 2));
        /*
         * |---------------------------------------
         * Tạo Listenner
         * |---------------------------------------
         */
        LastButtonListener lastButtonListener = new LastButtonListener(this);
        /*
         * |---------------------------------------
         * Thêm thành phần cho button
         * |---------------------------------------
         */
        JButton jButton_1 = new JButton("1");
        jButton_1.addActionListener(lastButtonListener);
        JButton jButton_2 = new JButton("2");
        jButton_2.addActionListener(lastButtonListener);
        JButton jButton_3 = new JButton("3");
        jButton_3.addActionListener(lastButtonListener);
        JButton jButton_4 = new JButton("4");
        jButton_4.addActionListener(lastButtonListener);
        /*
         * |---------------------------------------
         * Tạo font chữ
         * |---------------------------------------
         */
        Font font = new Font("Arial", Font.BOLD, 20);
        jPanel_Center.add(jButton_1);
        jPanel_Center.add(jButton_2);
        jPanel_Center.add(jButton_3);
        jPanel_Center.add(jButton_4);
        /*
         * |---------------------------------------
         * Set Font chữ
         * |---------------------------------------
         */
        jButton_1.setFont(font);
        jButton_2.setFont(font);
        jButton_3.setFont(font);
        jButton_4.setFont(font);
        /*
         * |---------------------------------------
         *
         * |---------------------------------------
         */
        JPanel jPanel_footer = new JPanel();
        JLabel jLabel = new JLabel("-------");
        jLabel.setFont(font);
        jPanel_footer.add(jLabel);
        this.setLayout(new BorderLayout());
        this.add(jPanel_Center, BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    /*
     * |---------------------------------------
     * SetChangTo
     * |---------------------------------------
     */
    public void changTo_1() {
        this.lasTButtonModel.setValue_1();
        jLabel.setText("Last Button:" + this.lasTButtonModel.getValue());
    }

    public void changTo_2() {
        this.lasTButtonModel.setValue_2();
        jLabel.setText("Last Button:" + this.lasTButtonModel.getValue());
    }

    public void changTo_3() {
        this.lasTButtonModel.setValue_3();
        jLabel.setText("Last Button:" + this.lasTButtonModel.getValue());
    }

    public void changTo_4() {
        this.lasTButtonModel.setValue_4();
        jLabel.setText("Last Button:" + this.lasTButtonModel.getValue());
    }
}