import java.util.Scanner;

public class bt_them_pt {
//    khai báo mảng mảng số nguyên gồm N phần tử.
//    Nhập một giá trị bất kỳ từ bàn phím và vị trí cần chèn,
//    giá trị này được chèn vào vị trí đó trong mảng.
    public static void main(String[] args) {
        System.out.println("cho sẵn 1 mảng: arr = {0,1,2,3,4,5,6}");
        int[] arr = {0, 1, 2, 3, 4, 5, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tứ tự phần tử muốn thêm: ");
        int them = scanner.nextInt() - 1;
        System.out.println("nhập giá trị muốn thêm");
        int value = scanner.nextInt();
        int[] newArr = new int[arr.length+1];
        for (int i = 0; i < arr.length+1; i++){
            if (them == i){
                newArr[i] = value;
            }else if (i < them){
                newArr[i] = arr[i];

            }else if (i > them){
                newArr[i] = arr[i -1];
            }
        }
        for (int a: newArr) {
            System.out.print(a + ", ");
        }
    }
}
