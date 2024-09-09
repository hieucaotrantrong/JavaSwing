<<<<<<< HEAD
package model;

/*
 |-------------------------------------------
 Bài 85: cách sử dụng jtextArea để hiển thị
=======
package Buoi8.model;

/*
 |-------------------------------------------
 Bài 85: cách sử dụng jtextArea để huển thị
>>>>>>> e33f062a91ee8de8e4867850598fdb9aee9d922a
 và nhập dữ liệu văn bản nhiều dòng
  |-------------------------------------------
 */
public class TimKiemModel {
    private String vanBan, tuKhoa, ketQua;
    /*
     * |----------------------------------------
     * |----------------------------------------
     */

    public TimKiemModel() {
        this.vanBan = "";
        this.tuKhoa = "";
        this.ketQua = "";
    }

    public String getVanBan() {
        return vanBan;
    }

    public void setVanBan(String vanBan) {
        this.vanBan = vanBan;
    }

    public String getTuKhoa() {
        return tuKhoa;
    }

    public void setTuKhoa(String tuKhoa) {
        this.tuKhoa = tuKhoa;
    }

    public String getKetQua() {
        return ketQua;
    }

    public void setKetQua(String ketQua) {
        this.ketQua = ketQua;
    }

    public void timKiem() {
        int dem = 0;
        int viTri = 0;
        while (true) {
<<<<<<< HEAD
            int i = this.vanBan.indexOf(this.tuKhoa, viTri);
=======
            int i = this.vanBan.indexOf(this.tuKhoa, 0);
>>>>>>> e33f062a91ee8de8e4867850598fdb9aee9d922a
            if (i == -1) {
                /*
                 * |---------------------------------------
                 * Tình huống không tìm thấy
                 * |---------------------------------------
                 */
                break;
            } else {
                dem++;
                viTri = i + 1;
            }
        }
<<<<<<< HEAD
        this.ketQua = "Ket qua: Co :" + dem + " " + this.tuKhoa;
        System.out.println(ketQua);
=======
        this.ketQua = "Ket qua: Co" + dem + this.tuKhoa;
>>>>>>> e33f062a91ee8de8e4867850598fdb9aee9d922a
    }
}
