public abstract class Person {
    private int id;
    static int cnt = 1;
    private String name;
    private short age;
    private Adress adress = new Adress();

    public Person() {
        this.id = cnt++;
    }

    public Person(String name, short age, Adress adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    public int getId() {
        return id = cnt++;
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

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    abstract public String getCapacity();

    @Override
    public String toString() {
        return "ID : " + this.getId() + " Name : " + this.getName() + " Age : " + this.getAge() + adress.toString();
    }
}
