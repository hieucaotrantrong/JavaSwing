package Test;

/*
 |--------------------------------------
 Bài 81:Áp dụng mô hình MVC trong xây dựng
 chương trình và các sử lí sự kiện
  |--------------------------------------
 */
import model.CounterModel;
import view.CounterView;

public class Main {
    public static void main(String[] args) {
        CounterModel counterModel = new CounterModel();
        counterModel.increment();
        counterModel.increment();
        counterModel.increment();
        System.out.println();
        CounterView counterView = new CounterView();
    }
}
