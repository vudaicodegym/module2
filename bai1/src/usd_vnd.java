import java.util.Scanner;

public class usd_vnd {
    public static void main(String[] args) {
//        bài này đổi đô la ra vnđ
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số dô la");
        int usd = scanner.nextInt();
        int vnd = usd * 23000;
        System.out.println(usd + " tương đương với " + vnd + "VNĐ");
    }
}
