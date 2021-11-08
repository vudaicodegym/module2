import java.util.Scanner;

public class bt_gop_mang {
//    Trong phần này, chúng ta sẽ phát triển một chương trình cho phép gộp 2 mảng thành một mảng thứ 3.
public static void main(String[] args) {
    int kichThuoc;
    int[] arr;
    int[] arr2;
    Scanner scanner = new Scanner(System.in);
    do {
        System.out.print("nhập kích thước mảng 1: ");
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
    int kichThuoc2;
    do {
        System.out.print("nhập kích thước mảng 2");
        kichThuoc2 = scanner.nextInt();
        if (kichThuoc2 > 20)
            System.out.println("khích thước không được lớn hơn 20!");
    } while (kichThuoc2 > 20);
    arr2 = new int[kichThuoc2];
    int j = 0;
    while (j < arr2.length) {
        System.out.print("nhập phần tử " + (j + 1) + ": ");
        arr2[j] = scanner.nextInt();
        j++;
    }
    int l = 0;
    int[] arr3 = new int[arr.length + arr2.length];
    for (int k = 0; k < arr3.length; k++) {
        if (arr.length > k) {
            arr3[k] = arr[k];
        } else {
            arr3[k] = arr2[l];
            l++;
        }
        System.out.print(arr3[k] + ", ");
    }

}
}
