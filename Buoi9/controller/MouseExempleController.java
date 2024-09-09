package Buoi9.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import Buoi9.view.MousExempleView;

public class MouseExempleController implements MouseListener, MouseMotionListener {
    private MousExempleView mousExempleView;

    public MouseExempleController(MousExempleView mousExempleView) {
        this.mousExempleView = mousExempleView;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.mousExempleView.click();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.mousExempleView.enter();
        int x = e.getX();
        int y = e.getY();
        this.mousExempleView.update(x, y);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.mousExempleView.exit();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseDragged'");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        this.mousExempleView.update(x, y);
    }

}
