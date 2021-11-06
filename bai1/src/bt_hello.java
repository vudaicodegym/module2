import java.util.Scanner;

public class bt_hello {
    public static void main(String[] args) {
//        phát triển một ứng dụng Java cho phép nhập tên của người dùng từ bàn phím, sau đó hiển thị lời chào kèm theo tên của người đó.
        Scanner scanner = new Scanner(System.in);
        System.out.println("bạn tên gì? ");
        String name = scanner.nextLine();
        System.out.println("xin chào " + name + " bạn ổn chứ");
    }
}
