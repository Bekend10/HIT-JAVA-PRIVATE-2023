import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai1 {
    static List<String> signup = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String regexUserName = "^(?!^[0-9])([a-z0-9]{6,})$";
        String regexPasswordName = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+~-]).{8,}$";
        boolean accept = true;
        while(true){
            System.out.println("                    ME N U                  ");
            System.out.println("                                            ");
            System.out.println("1. Create account");
            System.out.println("2. Exit");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1 :
                    System.out.print("Enter username : ");
                    String username = sc.nextLine();
                    if(isUsedUserName(username)){
                        System.out.println("This user is already used ! ");
                        accept = false;
                    }
                    System.out.print("Enter password : ");
                    String password = sc.nextLine();
                    Pattern p1 = Pattern.compile(regexUserName);
                    Matcher m1 = p1.matcher(username);
                    if(!m1.matches()){
                        System.out.println("This username is not exactly as requested ! ");
                        accept = false;
                    }

                    Pattern p2 = Pattern.compile(regexPasswordName);
                    Matcher m2 = p2.matcher(password);

                    if(!m2.matches()){
                        System.out.println("This password is not exactly as requested ! ");
                        accept = false;
                    }

                    if(accept) {
                        System.out.println("Sign Up Success ! ");
                        signup.add(username);
                    }
                    else System.out.println("Sign Up Failed ! ");
                    break;
                case 2 :
                    return;
                default:
                    System.out.println("Don't have this function , please choose an another one !");
                    break;
            }
        }
    }


    public static boolean isUsedUserName(String name){
        for(String x : signup){
            if(x.equals(name))  return true;
        }
        return false;
    }
}
