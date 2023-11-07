import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Menu {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Subject> list = new ArrayList<>();
        while (true) {
            System.out.print("                    MENU                    ");
            System.out.print("\n----------------------------------------\n");
            System.out.println(" 1. Enter a lesson");
            System.out.println(" 2. Display all list");
            System.out.println(" 3. Sort by finish time");
            System.out.println(" 4. How many lesson that i can join");
            System.out.print(" 5. EXIT");
            System.out.print("\n----------------------------------------\n");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            System.out.println();
            scan.nextLine();
            switch (choice) {
                case 1: {
                    System.out.print("Enter ID: ");
                    String ID = scan.nextLine();
                    System.out.print("Enter subject name: ");
                    String subjectName = scan.nextLine();
                    System.out.print("Enter student count: ");
                    int studentCount = scan.nextInt();
                    System.out.print("Enter time to start: ");
                    scan.nextLine();
                    String timeStart = scan.nextLine();
                    System.out.print("Enter time to finish: ");
                    String timeEnd = scan.nextLine();
                    Subject subject = new Subject(ID, subjectName, studentCount, timeStart, timeEnd);
                    list.add(subject);
                    break;
                }
                case 2: {
                    System.out.printf("%-4s %-30s %-20s %-20s \n", "Id", "Subject name", "Student count", "Time start - end");
                    for (Subject subject : list) {
                        subject.display();
                    }
                    break;
                }
                case 3: {
                    Collections.sort(list, new SortByMinute());
                    break;
                }
                case 4: {
                    ArrayList<Subject> temporarilyList = new ArrayList<>();
                    for (Subject subject : list) {
                        temporarilyList.add(subject);
                    }

                    Collections.sort(temporarilyList, new SortByMinute());
                    System.out.print("Enter time start time: ");
                    String start = scan.nextLine();
                    int startTime = Integer.parseInt(start.substring(0, 2)) * 60 + Integer.parseInt(start.substring(3, 5));

                    System.out.print("Enter time finish time: ");
                    String end = scan.nextLine();
                    int temp = startTime;
                    int cnt = 0;
                    int endTime = Integer.parseInt(end.substring(0, 2)) * 60 + Integer.parseInt(end.substring(3, 5));

                    for (Subject subject : list) {
                        if (subject.getStartMinutes() >= temp && subject.getEndMinutes() <= endTime) {
                            temp = subject.getEndMinutes();
                            cnt++;
                        }
                    }
                    if (cnt > 1)
                        System.out.println("There is only " + cnt + "lesson you can join");
                    else
                        System.out.println("There are " + cnt + " lessons you can join");

                    temp = startTime;
                    for (Subject subject : list) {
                        if (subject.getStartMinutes() >= temp && subject.getEndMinutes() <= endTime) {
                            temp = subject.getEndMinutes();
                            subject.display();
                        }
                    }
                    break;
                }
                case 5: {
                    scan.close();
                    return;
                }

                default:
                    break;
            }
        }
    }
}

