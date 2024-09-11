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
        if (button.equals("Open")) {
            this.menuExempleView.SetTextJLable("Bạn đã click JmenuItem OPEN");
        } else if (button.equals("Exit")) {
            // this.menuExempleView.SetTextJLable("Bạn đã click JmenuItem Exit");
            System.exit(0);
        } else if (button.equals("Welcome")) {
            this.menuExempleView.SetTextJLable("Bạn đã click Jmenu Ưelcome");
        }
    }

}
