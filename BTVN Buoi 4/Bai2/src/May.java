
import java.util.Scanner;

public class May {
    static Scanner sc = new Scanner(System.in);
    private int maMay;
    private String kieuMay;
    private String tinhTrang;

    public May(int maMay, String kieuMay, String tinhTrang) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.tinhTrang = tinhTrang;
    }

    public May() {

    }

    public int getMaMay() {
        return maMay;
    }

    public void setMaMay(int maMay) {
        this.maMay = maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void nhap() {
        System.out.print("Enter ID of machine : ");
        this.maMay = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter type of machine : ");
        this.kieuMay = sc.nextLine();
        System.out.print("Enter machine status : ");
        this.tinhTrang = sc.nextLine();
    }

    public void xuat() {
        System.out.println("ID of machine : " + this.maMay);
        System.out.println("Type of machine : " + this.kieuMay);
        System.out.println("Machine status : " + this.tinhTrang);
    }
}
