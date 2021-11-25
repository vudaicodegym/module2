package bt_IllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleException {
//    Viết một ứng dụng nhập vào 3 cạnh của hình tam giác. Kiểm tra
//    nếu giá trị nhập vào là số âm hoặc tổng 2 cạnh không lớn hơn cạnh còn lại thì sinh ngoại lệ.


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào 3 cạnh của 1 tam giác abc");
        System.out.println("nhập vào canh a");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào canh b.");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào canh c.");
        int c = Integer.parseInt(scanner.nextLine());

            try {
                if (a < 0 || b < 0 || c < 0) {
                    throw new Exception("giá trị nhâp vào là số âm ");
//                    System.out.println("giá trị nhâp vào là số âm");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }


            try {
                if (a + b <= c || a + c <= b || b + c <= a) {
                throw new Exception("tổng 2 cạnh không lớn hơn cạnh còn lại! ");
//                    System.out.println("tổng 2 cạnh không lớn hơn cạnh còn lại!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

    }
}
