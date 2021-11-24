package bt_luyentap;

import java.util.Scanner;

public class mainProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. thêm sản phẩm");
            System.out.println("2. sửa sản phẩm ");
            System.out.println("3. xóa sản phẩm");
            System.out.println("4. hiển thị list sản phẩm");
            System.out.println("5. tìm kiếm sản phẩm");
            System.out.println("6. sắp xếp");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    ProductManager.add();
                    break;
                case 2: ProductManager.edit();
                    break;
                case 3: ProductManager.delete();
                    break;
                case 4:
                    ProductManager.display();
                    break;
                case 5: ProductManager.search();
                    break;
                case 6: ProductManager.sort();
                    break;
            }
        }
    }
}
