public class Student extends Person{
    private int id;
    private  String nameClass;
    private float gpa;
    final float criteria = 2;

    public Student(String name, int age, String commune, String distric, String city, int id, String nameClass, float gpa) {
        super(name, age , commune , distric , city);
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public float getCriteria() {
        return criteria;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Enter ID : ");
        this.id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name of class : ");
        this.nameClass = sc.nextLine();
        System.out.println("Enter GPA : ");
        this.gpa = sc.nextFloat();
        sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.printf("%-10d %-15s %-11.2f" , this.id , this.nameClass , this.gpa);
        if(checkFall()){
            System.out.printf("%-10s\n" , "Fall");
        }
        else{
            System.out.printf("%-10s\n" , "Pass");
        }
    }

    boolean checkFall(){
        return gpa < criteria;
    }

}
