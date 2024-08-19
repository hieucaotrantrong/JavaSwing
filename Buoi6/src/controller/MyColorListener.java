package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MyColorView;

public class MyColorListener implements ActionListener {
    private MyColorView myColorView;

    public MyColorListener(MyColorView myColorView) {
        this.myColorView = myColorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String string = e.getActionCommand();
        if (string.equals("Red Text")) {
            this.myColorView.changTextColor(Color.RED);
        } else if (string.equals("Yellow Text")) {
            this.myColorView.changTextColor(Color.YELLOW);
        } else if (string.equals("Green Text")) {
            this.myColorView.changTextColor(Color.GREEN);
        } else if (string.equals("Red Background")) {
            this.myColorView.changBackgroundColor(Color.RED);
        } else if (string.equals("Yellow Background")) {
            this.myColorView.changBackgroundColor(Color.YELLOW);
        } else if (string.equals("Green Background")) {
            this.myColorView.changBackgroundColor(Color.GREEN);
        }
    }

}