package bt_luyentap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManager {
    static ArrayList<Product> listControl = new ArrayList<>(
    );
    static {
        listControl.add(new Product("cbr1000", "red", 999 ));
        listControl.add(new Product("YZF R1", "blue", 998 ));
        listControl.add(new Product("ninja H2", "black", 999 ));
    }

    static Scanner scanner = new Scanner(System.in);

    //thêm
    public static void add() {
        Product product = create();
        listControl.add(product);
    }

    //sửa
    public static void edit() {
        int idEdit = finIndexById();
        Product newProduct = create();
       listControl.set(idEdit, newProduct);
    }

    //xóa
    public static void delete() {
        int deleteId = finIndexById();
        listControl.remove(deleteId);
    }


    // hiển thị
    public static  void display() {
        for (Product element: listControl) {
            System.out.println(element);
        }
    }

    //tìm kiếm
    public static void search(){
        int search = finIndexById() + 1;
//        Product show = new Product();
        for (int i = 0; i < listControl.size(); i++) {
            if (listControl.get(i).getId() == search){
                System.out.println(listControl.get(i));
            }
        }
    }
    //sắp xếp
    public static class PriceComparator implements Comparator<Product>{

        @Override
        public int compare(Product product1, Product product2) {
            if (product1.getSize() > product2.getSize()) {
                return 1;
            } else if (product1.getSize() == product2.getSize()) {
                return 0;
            } else {
                return -1;
            }
        }
    }
    public static void sort(){
        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(listControl,priceComparator);
        System.out.println("sắp xếp theo dung tích xy lanh");
        for (Product price: listControl) {
            System.out.println(price.toString());
        }
    }
    //
    public static Product create(){
        System.out.println("nhập tên sản phẩm");
        String newName = scanner.nextLine();
        System.out.println("màu sắc");
        String newColor = scanner.nextLine();
        System.out.println("dung tích xy lanh");
        int newVolume = Integer.parseInt(scanner.nextLine());
        Product newProduct = new Product(newName, newColor, newVolume);
        return newProduct;
    }
    public static int finIndexById(){
        System.out.println("nhập id muốn thao tác");
        int searchId = Integer.parseInt(scanner.nextLine());
        int index = -1;
        for (int i = 0; i < listControl.size(); i++) {
            if (listControl.get(i).getId() == searchId){
                return index = i;
            }
        }
        return index;
    }
}
