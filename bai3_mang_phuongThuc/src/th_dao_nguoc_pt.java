import java.util.Scanner;

public class th_dao_nguoc_pt {
    public static void main(String[] args) {
//        xây dựng một ứng dụng cho phép đảo ngược thứ tự của các phần tử trong mảng.
        int size;
        int[] array;
        Scanner scanner= new Scanner(System.in);
        do {
            System.out.println("nhập nhập kích thước mảng");
             size = scanner.nextInt();
             if (size > 20)
                 System.out.println("không được lớn hơn 20");
        }while (size > 20);
        array = new  int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("nhập phần tử " + i + ": ");
            array[i] = scanner.nextInt();
            i++;
            System.out.printf("%-20s%s", "phần tử trong mảng: ", "");
            }
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length/2; j++){
            int temp = array[j];
            array [j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "mảng đảo ngược: ", "");
        for (int j = 0; j < array.length; j++){
            System.out.println(array[j] + "\t");
        }
    }
}
