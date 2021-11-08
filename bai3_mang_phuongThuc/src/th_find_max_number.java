import java.util.Scanner;

public class th_find_max_number {
    public static void main(String[] args) {
//        phát triển một ứng dụng cho phép xác định phần tử có giá trị lớn nhất trong mảng.
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

        System.out.print("danh sách phần tử: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        int max = arr[0];
        int index = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                index = j + 1;
            }
        }
System.out.println("giá trị lớn nhất trong mảng là: " + max + ", ở vị trí " + index);
//        int size;
//        int[] array;
//        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.print("Enter a size:");
//            size = scanner.nextInt();
//            if (size > 20)
//                System.out.println("Size should not exceed 20");
//        } while (size > 20);
//        array = new int[size];
//        int i = 0;
//        while (i < array.length) {
//            System.out.print("Enter element" + (i + 1) + " : ");
//            array[i] = scanner.nextInt();
//            i++;
//        }
//        System.out.print("Property list: ");
//        for (int j = 0; j < array.length; j++) {
//            System.out.print(array[j] + "\t");
//        }
//        int max = array[0];
//        int index = 1;
//        for (int j = 0; j < array.length; j++) {
//            if (array[j] > max) {
//                max = array[j];
//                index = j + 1;
//            }
//        }
//        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
