package Buoi9.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
/*
|---------------------------------------
 Bài 87:Xử lí các sự kiện của chuột máy tính
|---------------------------------------
 */
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Buoi9.model.MouseExempleModel;

public class MousExempleView extends JFrame {
    private MouseExempleModel model;

    public MousExempleView() throws HeadlessException {
        this.model = new MouseExempleModel();
        this.init();
    }

    private void init() {
        this.setTitle("MOUSE EXEMPLE");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        /*
         * |----------------------------------------
         * jPanel_mouse
         * |----------------------------------------
         */
        JPanel jPanel_mouse = new JPanel();
        jPanel_mouse.setBackground(Color.BLUE);
        /*
         * |----------------------------------------
         * Jpanel info
         * |----------------------------------------
         */
        JPanel jPanel_info = new JPanel();
        jPanel_info.setLayout(new GridLayout(3, 3));
        /*
         * |----------------------------------------
         * jLabel_position
         * |----------------------------------------
         */
        JLabel jLabel_position = new JLabel("Position");
        JLabel jLabel_x = new JLabel("x= ");
        JLabel jLabel_y = new JLabel("y= ");
        /*
         * |----------------------------------------
         * jLabel_count
         * |----------------------------------------
         */
        JLabel jLabel_count = new JLabel("Number of clicks: ");
        JLabel jLabel_count_value = new JLabel("n");
        /*
         * |----------------------------------------
         * jLabel_empty
         * |----------------------------------------
         */
        JLabel jLabel_empty_1 = new JLabel();
        JLabel jLabel_empty_2 = new JLabel();
        /*
         * |----------------------------------------
         * jLabel_checkin
         * |----------------------------------------
         */
        JLabel jLabel_check_in = new JLabel("Mouse is in component");
        JLabel jLabel_check_in_value = new JLabel("no");
        /*
         * |----------------------------------------
         * Add Jpan
         * |----------------------------------------
         */
        jPanel_info.add(jLabel_position);
        jPanel_info.add(jLabel_x);
        jPanel_info.add(jLabel_y);
        jPanel_info.add(jLabel_count);
        jPanel_info.add(jLabel_count_value);
        jPanel_info.add(jLabel_empty_1);
        jPanel_info.add(jLabel_empty_2);
        jPanel_info.add(jLabel_check_in);
        jPanel_info.add(jLabel_check_in_value);

        /*
         * |----------------------------------------
         * Đưa dữ liệu vào chương trình chính
         * |----------------------------------------
         */
        this.setLayout(new BorderLayout());
        this.setVisible(true);
    }
}
