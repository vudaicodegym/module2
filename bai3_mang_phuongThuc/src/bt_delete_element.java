import java.util.Scanner;

public class bt_delete_element {
//    phát triển một chương trình thực hiện xoá một phần tử được nhập vào từ bàn phím ra khỏi mảng,
//    nếu phần tử đó xuất hiện trong mảng.
public static void main(String[] args) {
    System.out.println("cho trước mảng arr gồm các phần tử: 142857, 285714, 428571, 571428, 714285, 857142");
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhập phần tử muốn xóa: ");
    int x = scanner.nextInt();
    int[] arr = {142857, 285714, 428571, 571428, 714285, 857142};
    int[] newArr = new int[arr.length-1];
    int j =0;
    for (int i: arr){
        boolean check = true;
        if (i == x){
            check = false;
            continue;
        }else if (check){
            System.out.println("số bạn nhập không có trong mảng");
            break;
        }else {
        newArr[j] = i;
        j++;}
    }arr = newArr;
    for (int i: arr){
    System.out.println(i);
    }
}
}
