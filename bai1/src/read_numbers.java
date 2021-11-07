import java.util.Arrays;
import java.util.Scanner;

public class read_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any number: ");
        int num = scanner.nextInt();
        String[] temp = Integer.toString(num).split("");
        System.out.println(Arrays.toString(temp));//xác nhận biến thành mảng
        for (String a : temp) {
            number(a);
        }
    }

    public static void number(String num) {
        switch (num) {
            case "1":
                System.out.print("Một ");
                break;
            case "2":
                System.out.print("Hai ");
                break;
            case "3":
                System.out.print("Ba ");
                break;
            case "4":
                System.out.print("Bốn ");
                break;
            case "5":
                System.out.print("Năm ");
                break;
            case "6":
                System.out.print("Sáu ");
                break;
            case "7":
                System.out.print("Bảy ");
                break;
            case "8":
                System.out.print("Tám ");
                break;
            case "9":
                System.out.print("Chín ");
                break;
            case "0":
                System.out.println("Không ");
                break;
        }
    }
}
