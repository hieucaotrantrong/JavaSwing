package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CounterView;

public class CounterListener implements ActionListener {
    CounterView counterView;

    public CounterListener(CounterView counterView) {
        this.counterView = counterView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String string = e.getActionCommand();
        System.out.println("Ban da nhan nut: " + string);
        if (string.equals("UP")) {
            this.counterView.increment();
        } else if (string.equals("Down")) {
            this.counterView.decrement();
        }
    }

}
