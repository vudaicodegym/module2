import java.util.Scanner;

public class design_menu {
//    chúng ta sẽ phát triển một ứng dụng cho phép người dùng hiển thị một menu các hình mà ứng dụng có thể vẽ,
//    kèm theo số thứ tự, người dùng chọn một lựa chọn bằng cách nhập và số thứ tự trên menu
//    và ứng dụng sẽ vẽ hình tương ứng.
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("menu");
        System.out.println("1. vẽ hình tam giác");
        System.out.println("2. vẽ hình vuông");
        System.out.println("3. vẽ hình chữ nhật");
        System.out.println("0. exit");
        System.out.println("nhập lựa chon của bạn");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Draw the triangle");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Draw the square");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 3:
                System.out.println("Draw the rectangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
