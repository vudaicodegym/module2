package test2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Staff[] listStaff = new Staff[3];
        listStaff[0] = new Staff("aaa", "0123456789","hanoi");
        listStaff[1] = new Staff("abc", "0123456779","hanoi");
        listStaff[2] = new Staff("xyz", "0123456579","hanoi");

        while (true) {
            System.out.println("1. thêm nhân viên");
            System.out.println("2. xóa nhân viên");
            System.out.println("3. hiển thị nhân viên");
            System.out.println("4. sửa thông tin nhân viên");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    listStaff = Controller.addStaff(listStaff);
                    break;
                case 2: listStaff = Controller.delete(listStaff);
                    break;
                case 3:
                    Controller.display(listStaff);
                    break;
                case 4: Controller.editStaff(listStaff);
                    break;
            }
        }
    }
}
