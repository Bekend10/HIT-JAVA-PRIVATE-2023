import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    static {
        // id, tenSach, namXuatBan, theLoai , tenTacGia , namSinh
        Sach[] book = new Sach[5];
        book[0] = new Sach("Conan", 1994, "Trinh thám ", "Aoyama Gosho", 1963);
        book[1] = new Sach("Shin", 1990, "Thiếu nhi ", " Usui Yoshito", 1979);
        book[2] = new Sach("Doremon", 1970, "Thiếu nhi ", "Fujio", 1933);
        book[3] = new Sach("Di Ây Vi", 1990, "Người lớn ", "Tokuda", 1940);
        book[4] = new Sach("Hành Trình Vô Địch CKTG 2023", 2023, "Người yếu tim ", "Faker", 1996);
    }

    public static void main(String[] args) {
        ArrayList<Sach> list = new ArrayList<>();
        while (true) {
            System.out.println("                MENU                ");
            System.out.println("------------------------------------");
            System.out.println("1. Enter books information");
            System.out.println("2. Display all list");
            System.out.println("3. Find book by name");
            System.out.println("4. Sort by author's name");
            System.out.println("5. EXIT");
            System.out.println("------------------------------------");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter name of book : ");
                    String tenSach = sc.nextLine();
                    System.out.print("Enter publishing year : ");
                    int namXuatBan = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter type of book : ");
                    String theLoai = sc.nextLine();
                    System.out.print("Enter name of author : ");
                    String tenTacGia = sc.nextLine();
                    System.out.print("Enter year of birth : ");
                    int namSinh = sc.nextInt();
                    sc.nextLine();
                    Sach book = new Sach(tenSach, namXuatBan, theLoai, tenTacGia, namSinh);
                    list.add(book);
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("List is empty . Please enter book information ! ");
                    } else {
                        System.out.println("------INFORMATION------");
                        for (Sach sach :
                                list) {
                            sach.output();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter book if you want to find : ");
                    String findBook = sc.nextLine();
                    boolean find = false;
                    for (Sach sach :
                            list) {
                        if (sach.getTenSach().contains(findBook)) {
                            System.out.print("Found this book , this is information about your book :");
                            sach.output();
                            find = true;
                            break;
                        }
                    }
                    if (!find) {
                        System.out.println("Can't find this book !");
                    }
                    break;

                case 4:
                    System.out.println("--- SORT BY AUTHOR'S NAME ----");
                    Collections.sort(list, Comparator.comparing(Sach -> Sach.getX().getTenTacGia()));
                    for (Sach sach :
                            list) {
                        sach.output();
                    }
                    break;

                case 5:
                    sc.close();
                    return;

                default:
                    System.out.println("You choose wrong option !");
                    break;

            }
        }
    }
}
