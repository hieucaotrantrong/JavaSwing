package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MenuExempleView;

public class MenuExempleController implements ActionListener {
    MenuExempleView menuExempleView;

    public MenuExempleController(MenuExempleView menuExempleView) {
        this.menuExempleView = menuExempleView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if (button.equals("Exit")) {
            System.exit(0);
        } else {
            this.menuExempleView.SetTextJLable("Ban da Click " + button);
        }
    }

}
