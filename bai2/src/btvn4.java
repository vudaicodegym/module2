import java.util.Scanner;

public class btvn4 {
    public static void main(String[] args) {
//        Game đoán số, cho Random 1 số từ 1->10.
//        Cho người dùng nhập vào 1 số để đoán,
//        nếu nhỏ hơn thông báo nhỏ hơn và cho nhập lại,
//        nếu lớn hơn thông báo lớn hơn và cho nhập lại,
//        bằng thì hiển thị chúc mừng và dừng chương trình.
//
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số");
        int number = scanner.nextInt();
        final double random = Math.round((float)Math.random()*10);
//        System.out.println(random);
        while (number != random) {
            if (number > random){
                System.out.println("số đó lớn hơn số ngẫu nhiên!");
                System.out.println("cho đoán lại");
                number = scanner.nextInt();
            }else if (number < random){
                System.out.println("số đó nhỏ hơn số ngẫu nhiên");
                System.out.println("cho đoán lại");
                number = scanner.nextInt();
            }
        }
        if (number == random) {
            System.out.println("bạn đã nhập đúng số ngẫu nhiên! bạn đoán đc số đề ngày mai chứ? cho xin con lô!");
        }
    }
}
