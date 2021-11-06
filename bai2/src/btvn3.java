import java.util.Scanner;

public class btvn3 {
    public static void main(String[] args) {
//        Nhập vào 1 số, kiểm tra số đó có phải SNT hay không.
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số");
        int number = scanner.nextInt();
        boolean check = true;
        for (int i = 2; i < number/2; i++){
            if (number % i == 0){
                check = false;
                System.out.println("số " + number + " không phải là số nguyên tố");
                break;
            }
        }if (check){
            System.out.println("nó là số nguyên tố");
        }
    }
}
