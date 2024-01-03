import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai2 {
    public static void main(String[] args) {
        String regexDay = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Date : ");
        String date = sc.nextLine();
        Pattern pattern = Pattern.compile(regexDay);
        Matcher matcher = pattern.matcher(date);
        System.out.println(matcher.matches() ? "Legal" : "Illegal");
    }

}
