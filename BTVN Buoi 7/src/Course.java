import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course implements Displayable{
    static Scanner sc = new Scanner(System.in);
    private int courseID;
    private String courseName;
    List<Student> list = new ArrayList<>();

    public Course(int courseID, String courseName, List<Student> list) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.list = list;
    }

    public Course(int courseID, String courseName){
        this.courseID = courseID;
        this.courseName = courseName;
    }

    public Course() {
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void displayInfo(){
        System.out.printf("%-5d %-15s\n" ,getCourseID() , getCourseName());
    }

}
