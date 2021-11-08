import java.util.Scanner;

//        chúng ta sẽ phát triển một ứng dụng cho phép chuyển đổi nhiệt độ từ độ C sang độ F và ngược lại
public class th_convert_temp {
    public static double doF(double celsius){
        double fahrenheit = (9.0/5) * celsius +32;
        return fahrenheit;
    }
    public static double doC(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return  celsius;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do{
            System.out.println("menu.");
            System.out.println("1. độ F xang độ C");
            System.out.println("2. độ C xang độ F");
            System.out.println("0. exit");
            System.out.println("nhập lựa chọn của bạn!");
            choice = scanner.nextInt();
            switch (choice){
                case 1: {
                    System.out.println("nhập độ F: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("độ C là: " + doC(fahrenheit));
                    break;
                }
                case 2: {
                    System.out.println("nhập độ c: ");
                    celsius = scanner.nextDouble();
                    System.out.println("độ F là:" + doF(celsius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        }while (choice != 0);
    }
}
