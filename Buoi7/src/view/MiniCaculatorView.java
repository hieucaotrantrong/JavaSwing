package view;

import javax.swing.JButton;
/* 
Bài 84:Cách sử dụng Jtextfield để hiển thị
và nhập dữ liệu  văn bản
 |---------------------------------------
*/
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.MiniCaculatorListener;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import model.MiniCalculatorModel;

public class MiniCaculatorView extends JFrame {
    private MiniCalculatorModel miniCalculatorModel;
    private JTextField jtextfield_firstValue;
    private JTextField jtextfield_secondValue;
    private JTextField jtextfield_answer;

    public MiniCaculatorView() {
        this.miniCalculatorModel = new MiniCalculatorModel();
        this.init();
    }

    private void init() {
        this.setTitle("Mini Caculator");
        this.setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Font font = new Font("Arial", Font.BOLD, 40);
        /*
         * |-----------------------------------
         */

        JLabel jLabel_firstValue = new JLabel("1st Value");
        jLabel_firstValue.setFont(font);
        JLabel jLabel_secondValue = new JLabel("2nd Value");
        jLabel_secondValue.setFont(font);
        JLabel jLabel_answer = new JLabel("Answer");
        jLabel_answer.setFont(font);
        /*
         * |-----------------------------------
         */
        jtextfield_firstValue = new JTextField(50);
        jtextfield_firstValue.setFont(font);
        jtextfield_secondValue = new JTextField(50);
        jtextfield_secondValue.setFont(font);
        jtextfield_answer = new JTextField(50);
        jtextfield_answer.setFont(font);
        JPanel jPanelIO = new JPanel();
        jPanelIO.setLayout(new GridLayout(3, 2, 10, 10));
        /*
         * |-----------------------------------
         */
        jPanelIO.add(jLabel_firstValue);
        jPanelIO.add(jtextfield_firstValue);
        jPanelIO.add(jLabel_secondValue);
        jPanelIO.add(jtextfield_secondValue);
        jPanelIO.add(jLabel_answer);
        jPanelIO.add(jtextfield_answer);
        /*
         * |-----------------------------------
         */
        MiniCaculatorListener miniCaculatorListener = new MiniCaculatorListener(this);
        JButton jButton_plus = new JButton("+");
        jButton_plus.setFont(font);
        jButton_plus.addActionListener(miniCaculatorListener);
        /*
         * |-----------------------------------
         */
        JButton jButton_minus = new JButton("-");
        jButton_minus.setFont(font);
        jButton_minus.addActionListener(miniCaculatorListener);
        /*
         * |-----------------------------------
         */
        JButton jButton_multiply = new JButton("*");
        jButton_multiply.setFont(font);
        jButton_multiply.addActionListener(miniCaculatorListener);
        /*
         * |-----------------------------------
         */
        JButton jButton_devide = new JButton("/");
        jButton_devide.setFont(font);
        jButton_devide.addActionListener(miniCaculatorListener);
        /*
         * |-----------------------------------
         */
        JButton jButton_pow = new JButton("^");
        jButton_pow.setFont(font);
        jButton_pow.addActionListener(miniCaculatorListener);
        /*
         * |-----------------------------------
         */
        JButton jButton_mod = new JButton("%");
        jButton_mod.setFont(font);
        jButton_mod.addActionListener(miniCaculatorListener);
        /*
         * |-----------------------------------
         */
        JPanel jPanelButtons = new JPanel();
        jPanelButtons.setLayout(new GridLayout(2, 3));
        jPanelButtons.add(jButton_plus);
        jPanelButtons.add(jButton_minus);
        jPanelButtons.add(jButton_devide);
        jPanelButtons.add(jButton_mod);
        jPanelButtons.add(jButton_multiply);
        jPanelButtons.add(jButton_pow);
        /*
         * |-----------------------------------
         */
        this.setLayout(new BorderLayout(10, 10));
        this.add(jPanelIO, BorderLayout.CENTER);
        this.add(jPanelButtons, BorderLayout.SOUTH);
        this.setVisible(true);

    }

    /*
     * |-----------------------------------
     */
    /**
     * 
     */
    public void plus() {
        double firstValue = Double.valueOf(jtextfield_firstValue.getText());
        double secondValue = Double.valueOf(jtextfield_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.plus();
        this.jtextfield_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void minus() {
        double firstValue = Double.valueOf(jtextfield_firstValue.getText());
        double secondValue = Double.valueOf(jtextfield_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.minus();
        this.jtextfield_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void muitiply() {
        double firstValue = Double.valueOf(jtextfield_firstValue.getText());
        double secondValue = Double.valueOf(jtextfield_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.muitiply();
        this.jtextfield_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void devide() {
        double firstValue = Double.valueOf(jtextfield_firstValue.getText());
        double secondValue = Double.valueOf(jtextfield_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.devide();
        this.jtextfield_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void power() {
        double firstValue = Double.valueOf(jtextfield_firstValue.getText());
        double secondValue = Double.valueOf(jtextfield_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.power();
        this.jtextfield_answer.setText(this.miniCalculatorModel.getAnswer() + "");

    }

    public void mod() {
        double firstValue = Double.valueOf(jtextfield_firstValue.getText());
        double secondValue = Double.valueOf(jtextfield_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.mod();
        this.jtextfield_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }
}
