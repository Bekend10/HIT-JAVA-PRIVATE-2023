import java.util.Scanner;

public class Subject {
    static Scanner sc = new Scanner(System.in);

    public String id;
    public String subjectName;
    public int studentCount;
    public String timeStart;
    public String timeEnd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Subject(){

    }
    public Subject(String id, String subjectName, int studentCount, String timeStart, String timeEnd) {
        this.id = id;
        this.subjectName = subjectName;
        this.studentCount = studentCount;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public int getStartMinutes() {
        String[] time = timeStart.split(":");
        return Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
    }

    public int getEndMinutes() {
        String[] time = timeEnd.split(":");
        return Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
    }

    public void display() {
        System.out.printf("%-4s %-30s %-20s %-20s\n", id, subjectName, studentCount, timeStart + " - " + timeEnd);
    }
}
