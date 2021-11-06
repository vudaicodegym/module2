import java.util.Scanner;

public class tim_uoc_so {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập sô a");
        a = input.nextInt();
        System.out.println("nhập số b");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0){
            System.out.println("không có ước chung lớn nhất");
        };
        while (a != b){
            if (a>b)
                a = a - b;
            else
                b = b -a;
        }
        System.out.println("ước chung lớn nhất là: " + a);

    }
}
