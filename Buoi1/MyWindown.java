package Buoi1;

import javax.swing.JFrame;

/*
|--------------------------------------
Bài 74: Lập tringh gaio diện với JFame
Jfame có thể kế thừa lại lớp đã tạo
|--------------------------------------
 */
public class MyWindown extends JFrame {
    public MyWindown() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void showIt() {
        this.setVisible(true);
    }

    public void showIt(String title) {
        this.setTitle(title);
        this.setVisible(true);
    }

    public void showIt(String title, int width, int height) {
        this.setTitle(title);
        this.setSize(width, height);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyWindown myWindown = new MyWindown();
        myWindown.showIt();
        MyWindown myWindown2 = new MyWindown();
        myWindown2.showIt("Windown2");
        MyWindown myWindown3 = new MyWindown();
        myWindown3.showIt("Windown3", 600, 400);
    }
}
