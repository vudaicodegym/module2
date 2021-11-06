import java.util.Scanner;

public class btvn5 {
    public static void main(String[] args) {
//        Giải phương trình bậc 2. nhập a,b,c từ bàn phím và trả về kết quả
//        pt bậc 2 có dạng ax^2+bx+c=0
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số a");
        double a = scanner.nextDouble();
        System.out.println("nhập số b");
        double b = scanner.nextDouble();
        System.out.println("nhập số c");
        double c = scanner.nextDouble();
        double delta = b*b-(4*a*c);
        double x1 = 0;
        double x2 = 0;
        if (delta == 0){
            x1 = -b/2*a;
            System.out.println("phương trình có nghiệm kép x1 = x2 = " + x1);
        }else if (delta > 0){
            x1 = (-b + Math.sqrt(delta))/2*a;
            x2 = (-b - Math.sqrt(delta))/2*a;
            System.out.println("phương trình có 2 nghiệm phân biệt, x1= " + x1 + " x2 = " + x2);
        }else System.out.println("phương trình vô nghiệm");
    }
}
