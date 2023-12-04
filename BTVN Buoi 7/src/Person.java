import java.util.Scanner;

public abstract class Person implements Displayable{
    static Scanner sc = new Scanner(System.in);
     private int id;
     private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void getInfo(){
        System.out.print("Enter id : ");
        this.id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name : ");
        this.name = sc.nextLine();
    }

    @Override
    public void displayInfo() {
        System.out.printf("%-5d %-15s" , getId() , getName());
    }
}
