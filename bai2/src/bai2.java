import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số");
        int number = scanner.nextInt();
        if (number < 2){
            System.out.println(number + " không phải số nguyên tố");
        }else {
            int i = 2;
            boolean check =  true;
            while (i < number){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " là snt");
            else System.out.println(number + " không là snt");
        }

    }
}
