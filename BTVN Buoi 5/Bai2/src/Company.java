import java.util.Scanner;

public class Company {
    static Scanner sc = new Scanner(System.in);
    final private String nameSeller = "CÔNG TY TNHH A";
    final private String code = "010023400";
    final static String address = "45 phố X , quận Y , thành phố Hà Nội ";
    private String cardNumber;
    private String phoneNumber;

    public Company() {

    }

    public Company(String cardNumber, String phoneNumber) {
        this.cardNumber = cardNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getNameSeller() {
        return nameSeller;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void input(){
        System.out.print("Enter card number : ");
        this.cardNumber = sc.nextLine();
        System.out.print("Enter phone number : ");
        this.phoneNumber = sc.nextLine();
    }

    public void output(){
        System.out.println("| Tên người bán : " + nameSeller + "                                                                       |");
        System.out.println("| Mã số thuế : " + code + "                                                                               |");
        System.out.println("| Địa chỉ : " + address + "                                                      |");
        System.out.println("| Số tài khoản : " + this.cardNumber + "                                                                                  |");
        System.out.println("| Số điện thoại : " + this.phoneNumber + "                                                                           |");
    }
}
