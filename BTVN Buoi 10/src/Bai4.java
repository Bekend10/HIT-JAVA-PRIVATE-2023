public class Bai4 {
    public static void main(String[] args) {
        String check = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        /// [\w!#$%&’*+/=?`{|}~^-] : Bắt đầu là chữ hay số hoặc kí tự đặc biệt
        /// +(?:\.[\w!#$%&’*+/=?`{|}~^-]+) : đằng trc dấu chấm là 1 chuỗi sau dấu chấm là 1 chuỗi chứa số , chữ hoặc kí tự đặc biệt
        /// *@(?:[a-zA-Z0-9-]+\\.) : @ đứng trc và có chứa 1 hoặc nhiều kí tự và số phân tách bởi dấu chấm
        /// +[a-zA-Z]{2,6}$" : có chứa từ 2 đến 6 kí tự bất kì là chữ
        /// ==> regex email
    }
}
