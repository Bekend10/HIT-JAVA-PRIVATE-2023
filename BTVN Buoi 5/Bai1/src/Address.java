import javax.swing.text.Style;
import java.util.Scanner;

public class Address {
    static Scanner sc = new Scanner(System.in);
    public String commune;
    public String distric;
    public String city;

    public Address(String commune, String distric, String city) {
        this.commune = commune;
        this.distric = distric;
        this.city = city;
    }

    public Address() {

    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistric() {
        return distric;
    }

    public void setDistric(String distric) {
        this.distric = distric;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void intput(){
        System.out.print("Enter commune : ");
        this.commune = sc.nextLine();
        System.out.print("Enter district : ");
        this.distric = sc.nextLine();
        System.out.print("Enter city : ");
        this.city = sc.nextLine();
    }

    public void output(){
        System.out.printf("%-12s %-13s %-10s" , this.commune , this.distric , this.city);
    }

}
