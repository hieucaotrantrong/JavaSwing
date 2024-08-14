package view;

import javax.swing.JButton;

/*
 |--------------------------------------
 Bài 81:Áp dụng mô hình MVC trong xây dựng
 chương trình và các sử lí sự kiện
  |--------------------------------------
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

public class CounterView extends JFrame {
    private CounterModel counterModel;
    private JButton jButton_up;
    private JButton jButton_down;
    private JLabel jLabel_value;

    /*
     * |--------------------------------------
     * Phương thức khởi tạo
     * |--------------------------------------
     */
    public CounterView() {
        this.counterModel = new CounterModel();
        this.init();
        this.setVisible(true);
    }

    public void init() {
        this.setTitle("Counter");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*
         * |--------------------------------------
         * Lắng nghe sự kiện từ người dùng
         * |--------------------------------------
         */
        ActionListener actionListener = new CounterListener(this);

        /*
         * |--------------------------------------
         * Sử lí sự kiện cho nút
         * -----------------------------------
         */
        jButton_up = new JButton("UP");
        jButton_up.addActionListener(actionListener);
        jButton_down = new JButton("Down");
        jButton_down.addActionListener(actionListener);
        jLabel_value = new JLabel(this.counterModel.getValue() + "", JLabel.CENTER);
        /*
         * |--------------------------------------
         * 
         * |--------------------------------------
         */
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jButton_up, BorderLayout.WEST);
        jPanel.add(jLabel_value, BorderLayout.CENTER);
        jPanel.add(jButton_down, BorderLayout.EAST);
        /*
         * |--------------------------------------
         * Set layout jpanl
         * |--------------------------------------
         */
        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER);

    }

    public void increment() {
        this.counterModel.increment();
        this.jLabel_value.setText(this.counterModel.getValue() + "");
    }

    public void decrement() {
        this.counterModel.decrement();
        this.jLabel_value.setText(this.counterModel.getValue() + "");
    }
}
