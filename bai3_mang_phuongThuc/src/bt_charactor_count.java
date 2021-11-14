import java.util.Scanner;

public class bt_charactor_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap mot chuoi ");;
        String str = sc.nextLine();
        System.out.println("Nhap ki tu can kiem tra");
        char c = sc.nextLine().charAt(0);
        int count= 0;


        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c){
                count++;
            }
        }
        System.out.println("số lần xuat hien cua ki tu " + c + " la: " +count);

    }

}
