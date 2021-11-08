import java.util.Scanner;

public class th_find_element_in_arr {
    public static void main(String[] args) {
//        phát triển một ứng dụng cho phép tìm vị trí của một phần tử trong mảng.
        String[] studens = {"đại", "hồng sơn", "ngọc sơn", "vinh", "tú anh", "tài", "lan", "phạm thắng", "bùi thắng", "trung"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập tên học sinh: ");
        String nhapTen = scanner.nextLine();
        boolean isexist = false;
        for (int i = 0; i < studens.length; i++){
            if (studens[i].equals(nhapTen)){
                System.out.println("vị trí của học sinh trong danh sách " + nhapTen + " là: "+i );
                isexist = true;
                break;
            }
        }
        if (!isexist){
            System.out.println("không tìm thấy " + nhapTen + " trong danh sách!");
        }
    }
}
