package view;

/*
|--------------------------------------
Cách thêm thanh Meni và xử lí sự kiện
cho các Menu
|--------------------------------------
 
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controller.MenuExempleController;

import java.awt.BorderLayout;
import java.awt.Font;;

public class MenuExempleView extends JFrame {
    private JLabel jLabel;

    public MenuExempleView() {
        this.setTitle("Menu Exemple");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        /*
         * |------------------------------
         * Tạo thanh menu
         * |------------------------------
         */
        MenuExempleController menuExempleController = new MenuExempleController(this);

        JMenuBar jMenuBar = new JMenuBar();
        /*
         * |------------------------------
         * Tạo một menu
         * |------------------------------
         */
        JMenu jMenu_file = new JMenu("File");
        /*
         * |------------------------------------
         * Tạo các menu con
         * |------------------------------------
         */
        JMenuItem jMenuItem_open = new JMenuItem("Open");
        jMenuItem_open.addActionListener(menuExempleController);
        JMenuItem jMenuItem_exit = new JMenuItem("Exit");
        jMenuItem_exit.addActionListener(menuExempleController);
        jMenu_file.add(jMenuItem_open);
        jMenu_file.addSeparator();
        jMenu_file.add(jMenuItem_exit);
        /*
         * |------------------------------------
         * |------------------------------------
         */
        JMenu jMenu_help = new JMenu("Help");
        JMenuItem jMenuItem_welcome = new JMenuItem("Welcome");
        jMenuItem_welcome.addActionListener(menuExempleController);
        jMenu_help.add(jMenuItem_welcome);
        jMenuBar.add(jMenu_file);
        jMenuBar.add(jMenu_help);
        /*
         * |---------------------------------
         * Thêm thanh menu vào chương trình
         * |---------------------------------
         */
        this.setJMenuBar(jMenuBar);
        Font font = new Font("Arial", Font.BOLD, 50);
        jLabel = new JLabel();

        this.setLayout(new BorderLayout());
        this.add(jLabel, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public void SetTextJLable(String s) {
        this.jLabel.setText(s);
    }
}