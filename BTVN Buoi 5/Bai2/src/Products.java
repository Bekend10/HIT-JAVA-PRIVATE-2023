import java.util.ArrayList;
import java.util.Scanner;
public class Products {
    static ArrayList<Products> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    private int id;
    private String nameProduct;
    private String unit;
    private int quantity;
    private int unitPrice;

    static int cnt = 0;
    public Products(String nameProduct, String unit, int quantity, int unitPrice) {
        this.id = cnt++;
        this.nameProduct = nameProduct;
        this.unit = unit;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public Products() {
        this.id = cnt++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void input(){
        System.out.print("Enter number of products : ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ; i < num ; i++) {
            System.out.print("Enter name's product " + (i + 1) + " : ");
            this.nameProduct = sc.nextLine();
            System.out.print("Enter unit : ");
            this.unit = sc.nextLine();
            System.out.print("Enter quantity : ");
            this.quantity = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter unit price : ");
            this.unitPrice = sc.nextInt();
            sc.nextLine();
            Products products = new Products(nameProduct, unit, quantity, unitPrice);
            list.add(products);
            System.out.println();
        }
    }

    public int total(){
        return quantity * unitPrice;
    }

    public void output(){
        for (Products x:
             list) {
            System.out.printf("| %-3s | %-23s | %-13s | %-13d | %-13d | %-21d %-25s\n", x.id, x.nameProduct, x.unit, x.quantity, x.unitPrice, x.total(), "|");
            System.out.println( "--------------------------------------------------------------------------------------------------------");
        }
    }
    public void output2(){
        System.out.println("| Tổng tiền thanh toán : " + this.bill() + "                                                                      |");
        System.out.println("| Số tiền viết thành chữ : " + this.convertToWords(bill()) + " Đồng                       |");
    }

    public int bill(){
        int sum = 0;
        for (Products x :
                list) {
            sum += x.total();
        }
        return sum;
    }

    private static final String[] units = {"", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
    private static final String[] teens = {"", "Mười Một", "Mười Hai", "Mười Ba", "Mười Bốn", "Mười Lăm", "Mười Sáu", "Mười Bảy", "Mười Tám", "Mười Chín"};
    private static final String[] tens = {"", "Mười", "Hai Mươi", "Ba Mươi", "Bốn Mươi", "Năm Mươi", "Sáu Mươi", "Bảy Mươi", "Tám Mươi", "Chín Mươi"};

    public static String convertToWords(long number) {

        String words = "";

        if (number < 10) {
            words += units[(int) number];
        } else if (number < 20) {
            words += teens[(int) (number - 10)];
        } else if (number < 100) {
            words += tens[(int) (number / 10)] + " " + units[(int) (number % 10)];
        } else if (number < 1000) {
            words += units[(int) (number / 100)] + " Trăm " +  convertToWords(number % 100);
        } else if (number < 1000000) {
            words += convertToWords(number / 1000) + " Nghìn " + convertToWords(number % 1000);
        } else if (number < 1000000000) {
            words += convertToWords(number / 1000000) + " Triệu " + convertToWords(number % 1000000);
        } else {
            words += convertToWords(number / 1000000000) + " Tỷ " + convertToWords(number % 1000000000);
        }

        return words.trim();
    }


}
