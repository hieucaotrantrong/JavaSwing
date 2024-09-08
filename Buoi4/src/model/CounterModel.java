package model;

/*
 |--------------------------------------
 Bài 81:Áp dụng mô hình MVC trong xây dựng
 chương trình và các sử lí sự kiện
  |--------------------------------------
 */
public class CounterModel {
    private int value;

    public CounterModel() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void increment() {
        this.value++;
    }

    public void decrement() {
        this.value--;
    }

    public void reset() {
        this.value = 0;
    }
}
