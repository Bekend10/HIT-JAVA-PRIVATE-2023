import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends Person{
    static Scanner sc = new Scanner(System.in);
    private int age;
    private String grade;
    List<Course> courses;
    public Student(int id, String name, int age, String grade) {
        super(id, name);
        this.age = age;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void enroll(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public Student() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("%-5d %-10s" , this.getAge() , this.getGrade());
        int n = courses.size();
        for (Course x :
                courses) {
            if(n > 1){
                System.out.print(x.getCourseName() + ",");
                n--;
            }
            else {
                System.out.print(x.getCourseName());
            }
        }
        System.out.println();
    }
}
