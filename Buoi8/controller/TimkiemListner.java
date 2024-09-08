package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TimKiemView;

public class TimkiemListner implements ActionListener {
    private TimKiemView timKiemView;

    public TimkiemListner(TimKiemView timKiemView) {
        this.timKiemView = timKiemView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.timKiemView.timKiem();
    }
}
