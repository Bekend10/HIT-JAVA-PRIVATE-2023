import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class University {
    static Scanner sc = new Scanner(System.in);
    private List<Student> students;
    private List<Course> courses;
    public University() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent() {
        System.out.print("Enter student's ID to remove : ");
        int id = sc.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getId() == id){
                students.remove(students.get(i));
                System.out.println("Remove successfully");
                return;
            }
        }
        System.out.println("Don't have this ID to remove");
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse() {
        System.out.print("Enter course's ID to remove : ");
        int id = sc.nextInt();
        for (int i = 0; i < courses.size(); i++) {
            if(courses.get(i).getCourseID() == id){
                courses.remove(courses.get(i));
                System.out.println("Remove successfully");
                return;
            }
        }
        System.out.println("Remove fail");
    }
    public List<Student> getStudents() {
        return students;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public boolean isStudentIdUsed(int studentId) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                return true;
            }
        }
        return false;
    }

    public boolean isCourseIdUsed(int courseId) {
        for (Course course : courses) {
            if (course.getCourseID() == courseId) {
                return true;
            }
        }
        return false;
    }

    public void enrollStudentInCourse(University university){
        System.out.print("Enter student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter course ID: ");
        int courseID = sc.nextInt();
        sc.nextLine();
        Student student = findStudentById(university , studentId);
        Course course = findCourseById(university , courseID);

        if(student != null && course != null){
            student.enroll(course);
            System.out.println("Enroll successfully");
        }
        else{
            System.out.println("Enroll fail");
        }
    }

    public Student findStudentById(University university,int key){
        for (Student x :
                students) {
            if(x.getId() == key){
                return x;
            }
        }
        return null;
    }

    public Course findCourseById(University university,int key){
        for (Course x :
                courses) {
            if(x.getCourseID() == key){
                return x;
            }
        }
        return null;
    }
}
