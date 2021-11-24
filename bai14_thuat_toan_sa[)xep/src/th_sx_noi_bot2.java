import java.util.Scanner;

public class th_sx_noi_bot2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập kích thước danh sách:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("nhập " + list.length + " giá trị: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println("nhập phần tử thứ " + i);
            list[i] = scanner.nextInt();
        }
        System.out.print("danh sách của bạn là: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.println("\n đang sắp xếp...");
        bubbleSortByStep(list);
    }
    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    System.out.println("so sánh " + list[i] + " với " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("danh sách đã đực sắp xếp! ");
                break;
            }
            System.out.print("dánh sách sau bước " + k + " là: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();

        }
    }
}
