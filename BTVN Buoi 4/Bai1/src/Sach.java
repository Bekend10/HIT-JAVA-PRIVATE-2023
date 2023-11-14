import java.util.Scanner;

public class Sach {
    public static int count = 0;
    public int id;
    public String tenSach;
    public int namXuatBan;
    public String theLoai;
    public TacGia x = new TacGia();


    public Sach() {

    }

    public Sach(String tenSach, int namXuatBan, String theLoai, String tenTacGia, int namSinh) {
        this.id = ++count;
        this.tenSach = tenSach;
        this.namXuatBan = namXuatBan;
        this.theLoai = theLoai;
        x.tenTacGia = tenTacGia;
        x.namSinh = namSinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public TacGia getX() {
        return x;
    }

    public void setX(TacGia x) {
        this.x = x;
    }

    public void output() {
        System.out.println("\nID : " + this.id);
        System.out.println("Name of book : " + this.tenSach);
        System.out.println("Publishing year : " + this.namXuatBan);
        System.out.println("Type of book : " + this.theLoai);
        x.output();
    }
}
