package Model;

/*
|-------------------------------------
Bài 83: cách tùy chỉnh màu nền và màu
chữ cho các thành phần giao diện
|-------------------------------------
 */
import java.awt.Color;

public class MyColorModel {
    private Color foreGround;
    private Color backGround;
    private boolean opaque;

    public MyColorModel() {
        this.foreGround = Color.BLACK;
        this.backGround = Color.WHITE;
        this.opaque = true;
    }

    /*
     * |------------------------------------------
     * |------------------------------------------
     */
    public Color getForeGround() {
        return foreGround;
    }

    public Color getBackGround() {
        return backGround;
    }

    public boolean isOpaque() {
        return opaque;
    }

    public void setForeGround(Color foreGround) {
        this.foreGround = foreGround;
    }

    public void setBackGround(Color backGround) {
        this.backGround = backGround;
    }

    public void setOpaque(boolean opaque) {
        this.opaque = opaque;
    }

    /*
     * |------------------------------------------
     * |------------------------------------------
     */
}
