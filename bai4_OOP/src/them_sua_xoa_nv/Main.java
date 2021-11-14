package them_sua_xoa_nv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NhanVien[] nhanViens = new NhanVien[3];
        nhanViens[0] = new NhanVien("Toàn", 23, "nam");
        nhanViens[1] = new NhanVien("Nam", 23, "nam");
        nhanViens[2] = new NhanVien("Tùng", 23, "nam");

        while (true) {
            System.out.println("1. Hiển thị nhân viên");
            System.out.println("2. thêm nhân viên");
            System.out.println("3. xóa nhân viên");
            System.out.println("4. sửa thông tin nhân viên");
            int so = scanner.nextInt();

            switch (so) {
                case 1:
                    Controller.show(nhanViens);
                    break;
                case 2:
                    nhanViens = Controller.createNhanVien(nhanViens);
                    break;
                case 3:
                    nhanViens = Controller.delete(nhanViens);
                    break;
                case 4:
                    nhanViens = Controller.eddit(nhanViens);
            }
        }
    }
}
