import java.util.Scanner;

public class tinh_lai_cho_vay {
    public static void main(String[] args) {
        double money = 1.0;
        double laiSuat = 1.0;
        int thang = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số tiền gửi");
        money = input.nextDouble();
        System.out.println("nhập số tháng");
        thang = input.nextInt();
        System.out.println("nhập lãi suất (%/năm)");
        laiSuat = input.nextDouble();
        double tienlai = 0;
        for (int i = 0; i < thang; i++)
        tienlai += money * (laiSuat/100/12*thang);
        System.out.println("tổng lãi suất là " + tienlai);
    }
}
