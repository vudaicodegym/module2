package bt2_sx_chen;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void  insertionSort(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập kích thước danh sách:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("nhập " + list.length + " giá trị: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println("nhập phần tử thứ " + (i + 1));
            list[i] = scanner.nextInt();
        }
        int x, y;
        for (int i = 0; i <list.length ; i++) {
           x = list[i];
           y = i;
            while (y > 0 && x < list[y-1]){
                list[y] = list[y-1];
                y--;
            }
            list[y] = x;
        }
        System.out.println(Arrays.toString(list));
    }
}
