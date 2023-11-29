import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentServiceImpl implements StudentService{
    static ArrayList<Student> list = new ArrayList<>();

    public StudentServiceImpl(ArrayList<Student> list) {
        this.list = list;
    }

    @Override
    public void addStudent(Student t) {
        list.add(t);
    }

    @Override
    public void deleteStudent(int id) {
        list.remove(id);
    }

    @Override
    public void searchStudent(String name) {
        boolean find = true;
        System.out.println("Thông tin sinh viên cần tìm kiếm : ");
        for (Student x:
             list ) {
            if(x.getName().contains(name)){
                System.out.println(x.toString());
            }
            else{
                find = false;
            }
        }
        if(!find){
            System.out.println("Không tìm thấy sinh viên này !");
        }
    }

    @Override
    public void sortedStudent() {
        list.sort(Comparator.comparingDouble(Student -> Student.getScore()));
    }

    @Override
    public void showAllStudent() {
        for (Student x :
                list) {
//            System.out.println(x.toString());
            System.out.printf("%-5s %-15s %-10d %-15s %-10.2f\n" , x.getId() , x.getName() , x.getAge() ,x.getAdress() ,x.getScore());
        }
    }

}
