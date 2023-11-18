import java.util.Scanner;

public class Person {
    static Scanner sc = new Scanner(System.in);
    protected String name;
    protected int age;
    protected Address address = new Address();

    public Person(String name, int age , String commune , String district , String city){
        this.name = name;
        this.age = age;
        address.commune = commune;
        address.distric = district;
        address.city = city;
    }
    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void input(){
        System.out.print("Enter name : ");
        this.name = sc.nextLine();
        System.out.print("Enter age : ");
        this.age = sc.nextInt();
        sc.nextLine();
        address.intput();
    }

    public void output(){
        System.out.printf("%-20s %-10d" , this.name , this.age);
        address.output();
    }

}
