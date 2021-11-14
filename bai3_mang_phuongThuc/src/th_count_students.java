import java.util.Scanner;

public class th_count_students {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhập số sinh viên:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("không nhiều hơn 30");
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("điểm của sinh viên thứ " + (i + 1) + "là : ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("các điểm thi đỗ: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n số dinh viên thi đỗ là: " + count);
    }
}
