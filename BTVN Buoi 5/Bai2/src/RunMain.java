public class RunMain {
    static Company company = new Company();
    static Customer customer = new Customer();
    static Products products = new Products();
    static final String sign = "2C21TBB";
    static final int number = 98723;
    static final int day = 15;
    static final int month = 10;
    static final int year = 2021;

    public static void main(String[] args) {
        company.input();
        customer.input();
        products.input();
        System.out.println( "========================================================================================================");
        System.out.println("|                                            HÓA ĐƠN BÁN HÀNG                                          |");
        System.out.println("|                                                                 Ký hiệu :" + sign + "                     |");
        System.out.println("|                                                                 Số : " + number + "                           |");
        System.out.println("|                                        Ngày " + day + " tháng " + month + " năm " + year + "                                     |");
        System.out.println( "========================================================================================================");
        company.output();
        System.out.println( "========================================================================================================");
        customer.output();
        System.out.println( "========================================================================================================");
        System.out.println( "--------------------------------------------------------------------------------------------------------");
        System.out.printf("%-5s %-25s %-15s %-15s %-15s %-22s %-15s\n" , "| STT" , "|Tên hàng hóa , dịch vụ" , "|Đơn vị tính" , "|Số lượng" , "|Đơn giá" , "|Thành tiền" ,"|");
        System.out.println( "--------------------------------------------------------------------------------------------------------");
        products.output();
        products.output2();
        System.out.println( "========================================================================================================");
        System.out.println("|           Người mua hàng                                                      Người bán hàng         |");
        System.out.println("|             Chữ ký số (nếu có)                                        (Chữ kí điện tử , Chữ ký số)   |");
        System.out.println("|                                                                                                      |");
        System.out.println("|                                                                                                      |");
        System.out.println("|                               (Cần kiểm tra , đối chiếu khi lập , nhận hóa đơn)                      |");
        System.out.println( "========================================================================================================");
    }
}
