import java.util.Scanner;

public class bt_ptbac2 {
    double a, b, c;
    public bt_ptbac2(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDelta(){
        return b*b - 4 * a * c;
    }
    public double getX1(){
        return -b + Math.sqrt(getDelta()) / a * 2;
    }
    public double getX2(){
        return -b - Math.sqrt(getDelta()) / 2 * a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("nhập c: ");
        double c = scanner.nextDouble();
        bt_ptbac2 ptbac2 = new bt_ptbac2(a, b, c);
         if (ptbac2.getDelta() >= 0){
             System.out.println("x1 = " + ptbac2.getX1() + "\nx2 = " + ptbac2.getX2());
         }
    }
}

