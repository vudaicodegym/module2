import java.util.Scanner;

public class bt_total_num_in_colum {
//    Viết một ứng dụng cho phép người dùng nhập vào một mảng hai chiều của các số thực,
//    sau đó cho phép người dùng nhập vào thứ tự của một cột
//    (tính từ 0) và tính ra tổng các phần tử của cột đó.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số hàng");
        int hang = scanner.nextInt();
        System.out.println("nhập số cột");
        int cot = scanner.nextInt();
        int[][] array  = new int[hang][cot];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println("nhập phần tử cho hàng " + (i + 1) + ", cột " + (j + 1));
                array[i][j] = scanner.nextInt();
            }
        }
        int total = 0;
        System.out.println("nhập cột muốn tính tổng");
        int colum = scanner.nextInt() - 1;
        for(int k = 0; k < array.length; k++){
            total += array[k][colum];
        }
        System.out.println("tổng của các phần tử trong cột " + (colum + 1) + " là: " + total);
    }
}
