import java.util.ArrayList;
import java.util.Scanner;

public class PhongMay {
    static Scanner sc = new Scanner(System.in);
    private String maPhongMay;
    private String tenPhong;
    QuanLy x = new QuanLy();
    private May[] y;
    private int n;

    public PhongMay(String maPhongMay, String tenPhong, QuanLy x, May[] y, int n) {
        this.maPhongMay = maPhongMay;
        this.tenPhong = tenPhong;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public PhongMay() {

    }

    public PhongMay(String number, String lab, QuanLy quanLy, ArrayList<May> mays, int n) {
    }

    public String getMaPhongMay() {
        return maPhongMay;
    }

    public void setMaPhongMay(String maPhongMay) {
        this.maPhongMay = maPhongMay;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void nhap() {
        System.out.print("Enter ID of room : ");
        this.maPhongMay = sc.nextLine();
        System.out.print("Enter name of room : ");
        this.tenPhong = sc.nextLine();
        x.nhap();
        System.out.print("Enter number of machine : ");
        this.n = sc.nextInt();
        sc.nextLine();
        y = new May[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter information of machine " + (i + 1) + " : ");
            y[i] = new May();
            y[i].nhap();
        }
    }


    public void xuat(){
        System.out.println("ID of room : " + this.maPhongMay);
        System.out.println("Name of room : " + this.tenPhong);
        x.xuat();
        for (int i = 0; i < n; i++) {
            System.out.println("---Information of machine " + (i + 1) + "---");
            y[i].xuat();
        }
    }

    public void searchByTypeOfMachine(String key){
        boolean find = false;
        for (int i = 0; i < n; i++) {
            if(y[i].getKieuMay().contains(key)){
                find = true;
                System.out.println("Found this machine , this is information about this machine :");
                y[i].xuat();
            }
        }
        if(!find){
            System.out.println("Can't not find this machine ! ");
        }
    }
    public void searchByIDMachine(int key){
        boolean find = false;
        for (int i = 0; i < n; i++) {
            if(y[i].getMaMay() == key){
                find = true;
                System.out.println("Found this machine , this is information about this machine :");
                y[i].xuat();
            }
        }
        if(!find){
            System.out.println("Can't not find this machine ! ");
        }
    }
}
