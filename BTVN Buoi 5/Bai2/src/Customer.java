import java.util.Scanner;

public class Customer {
    static Scanner sc = new Scanner(System.in);
    private String customerFullName;
    private String customerName;
    private String address;
    private String cardNumber;
    private String payments;
    private String MST;
    final String cost = "VNĐ";

    public Customer(String customerFullName, String customerName, String address, String cardNumber, String payments, String MST) {
        this.customerFullName = customerFullName;
        this.customerName = customerName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.payments = payments;
        this.MST = MST;
    }

    public Customer() {

    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPayments() {
        return payments;
    }

    public void setPayments(String payments) {
        this.payments = payments;
    }

    public String getMST() {
        return MST;
    }

    public void setMST(String MST) {
        this.MST = MST;
    }

    public String getCost() {
        return cost;
    }

    public void input(){
        System.out.print("Enter full-name's customer : ");
        this.customerFullName = sc.nextLine();
        System.out.print("Enter name customer : ");
        this.customerName = sc.nextLine();
        System.out.print("Enter address's customer : ");
        this.address = sc.nextLine();
        System.out.print("Enter full card number's customer : ");
        this.cardNumber = sc.nextLine();
        System.out.print("Enter payments : ");
        this.payments = sc.nextLine();
        System.out.print("Enter MST : ");
        this.MST = sc.nextLine();
    }

    public void output(){
        System.out.println("| Họ tên người mua hàng : " + this.customerFullName + "                                                             |");
        System.out.println("| Tên người mua : " + this.customerName + "                                                                                 |");
        System.out.print("| Địa chỉ : " + this.address);
        System.out.println("                    Số tài khoản : " + this.cardNumber + "                                       |");
        System.out.print("| Hình thức thanh toán : " + this.payments);
        System.out.print("        MST : " +this.MST);
        System.out.println("                        Đồng tiền thanh toán : " + cost + "           |");
    }

}
