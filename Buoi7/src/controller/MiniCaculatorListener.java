package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MiniCaculatorView;

public class MiniCaculatorListener implements ActionListener {
    private MiniCaculatorView miniCaculatorView;

    public MiniCaculatorListener(MiniCaculatorView miniCaculatorView) {
        this.miniCaculatorView = miniCaculatorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if (button.equals("+")) {
            this.miniCaculatorView.plus();
        } else if (button.equals("-")) {
            this.miniCaculatorView.minus();
        } else if (button.equals("*")) {
            this.miniCaculatorView.muitiply();
        } else if (button.equals("/")) {
            this.miniCaculatorView.devide();
        } else if (button.equals("^")) {
            this.miniCaculatorView.power();
        } else if (button.equals("%")) {
            this.miniCaculatorView.mod();
        }
    }

}
