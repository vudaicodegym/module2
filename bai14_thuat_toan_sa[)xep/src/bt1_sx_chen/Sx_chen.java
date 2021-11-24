package bt1_sx_chen;

import java.util.Arrays;
import java.util.Scanner;

public class Sx_chen {
    public static void sort() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập kích thước danh sách:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("nhập " + list.length + " giá trị: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println("nhập phần tử thứ " + (i + 1));
            list[i] = scanner.nextInt();
        }
        System.out.print("danh sách của bạn là: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.println("\n đang sắp xếp...");
        int x;
        int pos;
        for(int i = 1; i < list.length; i++){
            System.out.println("danh sách con hiện tại là: " + Arrays.toString(list));

            x = list[i];
            pos = i;
            while(pos > 0 && x < list[pos-1]){
                System.out.println(" so sánh " + x + " với " + list[pos-1] + " và đổi chỗ nếu cần");
                list[pos] = list[pos-1]; // đổi chỗ
                pos--;
            }
            list[pos] = x;
        }
            

        System.out.println("danh sách sau khi sắp xếp là: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
