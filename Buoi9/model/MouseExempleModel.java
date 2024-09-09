package Buoi9.model;

/*
|---------------------------------------
 Bài 87:Xử lí các sự kiện của chuột máy tính
|---------------------------------------
 */
public class MouseExempleModel {
    private int x, y;
    private int count;
    private String checkIn;

    public MouseExempleModel() {
        this.x = 0;
        this.y = 0;
        this.count = 0;
        this.checkIn = "no";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public void addClick() {
        this.count++;

    }
}
