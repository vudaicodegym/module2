import java.util.Scanner;

public class bt_find_min {
    public static void main(String[] args) {
        int kichThuoc;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhập kích thước mảng");
            kichThuoc = scanner.nextInt();
            if (kichThuoc > 20)
                System.out.println("khích thước không được lớn hơn 20!");
        } while (kichThuoc > 20);
        arr = new int[kichThuoc];
        int i = 0;
        while (i < arr.length) {
            System.out.print("nhập phần tử " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        int min = arr[0];
        for (int j: arr){
            if (min > j){
                min = j;
            }
        }
        System.out.println("giá trị nhỏ nhất trong mảng là: " + min);
    }
}
