import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        StudentServiceImpl test = new StudentServiceImpl(new ArrayList<Student>());
//        Student t1 = new Student("Dũng" , (short) 19,new Adress("Nghi Xuân" , "Hà Tĩnh"), 9.0);
//        Student t2 = new Student("Cường" , (short) 19,new Adress("Nghi Xuân" , "Hà Nam"), 7.0);
//        test.addStudent(t1);
//        test.addStudent(t2);
//        test.showAllStudent();
        ArrayList<Student> list = new ArrayList<>();
        while(true){
            System.out.println("            MENU            ");
            System.out.println("1 . Thêm Sinh Viên");
            System.out.println("2 . Xóa Sinh Viên");
            System.out.println("3 . Tìm Sinh Viên");
            System.out.println("4 . Sắp Xếp Sinh Viên Theo Điểm");
            System.out.println("5 . Hiện Thị Sinh Viên");
            System.out.println("6 . Thoát");
            System.out.print("Nhập lựa chọn : ");
            int choose = sc.nextInt();
            sc.nextLine();
            double score;
            switch (choose) {

                case 1 :
                    System.out.print("Nhập tên của sinh viên : ");
                    String name = sc.nextLine();
                    System.out.print("Nhập tuổi của sinh viên : ");
                    short age = sc.nextShort();
                    sc.nextLine();
                    System.out.print("Nhập Huyện : ");
                    String disctrict = sc.nextLine();
                    System.out.print("Nhập Tỉnh : ");
                    String city = sc.nextLine();
                    do {
                        System.out.print("Nhập điểm : ");
                        score = sc.nextFloat();
                        sc.nextLine();
                        if(score < 0 || score > 10){
                            System.out.println("Nhập sai điểm , mời bạn nhập lại");
                        }
                    }
                    while (score < 0 || score > 10);
                    Student st = new Student(name ,age , new Adress(disctrict , city) , score);
                    test.addStudent(st);
                    break;
                case 2 :
                    System.out.print("Nhập ID sinh viên cần xóa : ");
                    int id = sc.nextInt();
                    test.deleteStudent(id);
                    break;
                case 3 :
                    System.out.print("Nhập tên sinh viên cần tìm : ");
                    String ten = sc.nextLine();
                    test.searchStudent(ten);
                    break;
                case 4 :
                    test.sortedStudent();
                    break;
                case 5 :
                    System.out.println("Thông tin của sinh viên");
                    System.out.printf("%-5s %-15s %-10s %-15s %-15s %-10s\n" , "ID" , "Tên" , "Tuổi" , "Huyện" , "Thành Phố" , "Điểm");
                    test.showAllStudent();
                    break;
                case 6 :
                    return;
            }
        }



    }
}