import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    private static ArrayList<May> mays= new ArrayList<>();
    private static PhongMay phongMay= new PhongMay();
    static {
        mays.add(new May(1,"Dell","Tốt"));
        mays.add(new May(2,"Asus","Tốt"));
        mays.add(new May(3,"Lenovo","Khá"));
        mays.add(new May(4,"HP","Tệ"));
        mays.add(new May(5,"Acer","Tốt"));
        QuanLy quanLy= new QuanLy("01","Liên");
        phongMay= new PhongMay("001","Lab",quanLy,mays,10);
    }

    public static void main(String[] args) {
        PhongMay pm = new PhongMay();
        while (true){
            System.out.println("                MENU                ");
            System.out.println("-------------------------------------");
            System.out.println("1. Enter machine room information");
            System.out.println("2. Display machine room infomation");
            System.out.println("3. Find machine by type of machine");
            System.out.println("4. Find machine by machine's ID");
            System.out.println("5. EXIT");
            System.out.print("Enter an option : ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    pm.nhap();
                    break;
                case 2:
                    System.out.println("----------INFORMATION-------------");
                    pm.xuat();
                    break;
                case 3:
                    System.out.println("FIND BY TYPE OF MACHINE : ");
                    System.out.print("Enter your type of machine : ");
                    String key = sc.nextLine();
                    pm.searchByTypeOfMachine(key);
                    break;
                case 4:
                    System.out.println("FIND BY MACHINE's ID : ");
                    System.out.print("Enter your machine's ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    pm.searchByIDMachine(id);
                    break;
                case 5:
                    return;
                default :
                    System.out.println("Don't have this option !");
                    break;
            }
        }
    }
}