import java.util.Scanner;
// tìm số nguyên tố thứ 20 kể từ 13
public class chek_snt {
    public static void main(String[] args) {
        int count = 1;
        int i = 13;

        while (count <= 20) {
            int j = 2;
            boolean check = true;
            while (j <= i / 2) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
                j++;
            }
            if (check) {
                if (count == 20) {
                    System.out.println(i);
                }
                count++;
            }
            i++;
        }
    }
}
