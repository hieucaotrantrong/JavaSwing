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
import model.CounterModel;
import java.awt.BorderLayout;

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
         * Thêm thành phần cho Button
         * |--------------------------------------
         */
        jButton_up = new JButton("UP");
        jButton_down = new JButton("Down");
        jLabel_value = new JLabel(this.counterModel.getValue() + "");

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jButton_up, BorderLayout.WEST);
        jPanel.add(jLabel_value, BorderLayout.CENTER);
        jPanel.add(jButton_down, BorderLayout.EAST);
    }
}
