package view;

import javax.swing.JButton;
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
import javax.swing.JToolBar;

import controller.MenuExempleController;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;;

public class MenuExempleView extends JFrame {
    private JLabel jLabel;

    public MenuExempleView() {
        this.setTitle("Menu Exemple");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
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
        JMenuItem jMenuItem_new = new JMenuItem("New", KeyEvent.VK_N);
        jMenuItem_new.addActionListener(menuExempleController);
        JMenuItem jMenuItem_open = new JMenuItem("Open", KeyEvent.VK_O);
        jMenuItem_open.addActionListener(menuExempleController);
        JMenuItem jMenuItem_exit = new JMenuItem("Exit", KeyEvent.VK_X);
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
         * Tạo Toolbar (Thanh công cụ)
         */
        JToolBar jToolBar = new JToolBar();
        JButton jButton_Undo = new JButton("Undo");
        jButton_Undo.addActionListener(menuExempleController);
        JButton jButton_Redo = new JButton("Redo");
        jButton_Redo.addActionListener(menuExempleController);
        JButton jButton_Copy = new JButton("Copy");
        jButton_Copy.addActionListener(menuExempleController);
        JButton jButton_Cut = new JButton("Cut");
        jButton_Cut.addActionListener(menuExempleController);
        JButton jButton_Paste = new JButton("Paste");
        jButton_Paste.addActionListener(menuExempleController);
        /*
         * |---------------------------------
         */
        jToolBar.add(jButton_Undo);
        jToolBar.add(jButton_Redo);
        jToolBar.add(jButton_Cut);
        jToolBar.add(jButton_Copy);
        jToolBar.add(jButton_Paste);
        /*
         * |---------------------------------
         */
        this.add(jToolBar, BorderLayout.NORTH);

        /*
         * |---------------------------------
         * Thêm thanh menu vào chương trình
         * |---------------------------------
         */
        this.setJMenuBar(jMenuBar);
        Font font = new Font("Arial", Font.BOLD, 50);
        jLabel = new JLabel();

        this.add(jLabel, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public void SetTextJLable(String s) {
        this.jLabel.setText(s);
    }
}