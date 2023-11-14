import java.util.Scanner;

public class TacGia {
    public String tenTacGia;
    public int namSinh;

    public TacGia(String tenTacGia, int namSinh) {
        this.tenTacGia = tenTacGia;
        this.namSinh = namSinh;
    }

    public TacGia() {

    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void output(){
        System.out.println("Name of author : " + this.tenTacGia);
        System.out.println("Year of birth : " + this.namSinh);
    }
}
