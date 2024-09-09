package Buoi9.view;

import java.awt.HeadlessException;

import javax.swing.JFrame;

import Buoi9.model.MouseExempleModel;

public class MousExempleView extends JFrame {
    private MouseExempleModel model;

    public MousExempleView() throws HeadlessException {
        this.model = new MouseExempleModel();
        this.init();
    }

    private void init() {

    }
}
