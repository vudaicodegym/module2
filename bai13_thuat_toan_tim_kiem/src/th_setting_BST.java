import java.util.Scanner;

//Cài đặt phương thức binarySearch(int[] list)
// để tìm kiếm một giá trị trong một mảng được sắp xếp theo trật tự tăng dần
public class th_setting_BST {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1; /* Now high < low, key not found */
    }
    public static void main(String[] args) {
        System.out.println("nhập số bát kỳ");
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        System.out.println("vị trí của phần tử: " + key + " trong mảng là: " + binarySearch(list, key));
//        System.out.println(binarySearch(list, 2));  /* 0 */
//        System.out.println(binarySearch(list, 11)); /* 4 */
//        System.out.println(binarySearch(list, 79)); /*12 */
//        System.out.println(binarySearch(list, 1));  /*-1 */
//        System.out.println(binarySearch(list, 5));  /*-1 */
//        System.out.println(binarySearch(list, 80)); /*-1 */
    }
}
