import java.util.Scanner;
//tính tổng số phần tử trên đường chéo chính của ma trận vuông nhập vào bàn phím
public class bt_ma_tan_vuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số hàng");
        int hang = scanner.nextInt();
        System.out.println("nhập số cột");
        int cot = scanner.nextInt();
        int[][] array = new int[hang][cot];
        if (hang == cot) {
            for (int i = 0; i < hang; i++) {
                for (int j = 0; j < cot; j++) {
                    System.out.println("nhập phần tử cho hàng " + (i + 1) + ", cột " + (j + 1));
                    array[i][j] = scanner.nextInt();
                }
            }
            int total = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i == j) {
                        total += array[i][j];
                    } else if (j == array.length - i - 1) {
                        total += array[i][j];
                    }
                    System.out.println(total);
                }
            }
        } else System.out.println("không phải ma trận vuông");
    }
}
