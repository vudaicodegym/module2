import java.util.Scanner;

public class btvn6 {
    public static void main(String[] args) {
//        Thiết kế menu chương trình.
//
//                Chào bạn đến với GAME AI LÀ TRIỆU PHÚ.
//        LỚP C0921K1 CÓ BAO NHIÊU BẠN NỮ.
//        1 BẠN.
//        2 BẠN.
//        3. BẠN.
//        4 BẠN.
//
//                Nếu chọn 1 => thông báo sai rồi
//        Nếu chọn 2 => thông báo sai rồi
//        Nếu chọn 3 => thông báo đúng rồi.
//        Nếu chọn 4 => thông báo sai rồi
//        ------- cách 1 --------

//
//        System.out.println("lớp C0921k1 có bao nhiêu bạn nữ <3?");
//        System.out.println("1 bạn");
//        System.out.println("2 bạn");
//        System.out.println("3 bạn");
//        System.out.println("4 bạn");
//        Scanner scanner = new Scanner(System.in);
//        int selec = scanner.nextInt();
//        switch (selec){
//            case 1:
//                System.out.println("sai");
//                break;
//            case 2:
//                System.out.println("sai");
//                break;
//            case 3:
//                System.out.println("chính cmn xác");
//                break;
//            case 4:
//                System.out.println("sai nữa :))");
//                break;
//            default:
//                System.out.println("đáp án là 1234 mà??");
//        }
//        ---- bonus cách 2----
        System.out.println("lớp c0921k1 có bao nhiêu chị em phụ nữ");
//        System.out.println("1 chị em");
//        System.out.println("2 chị em");
//        System.out.println("3 chị em");
//        System.out.println("4 chị em");
        Scanner scanner = new Scanner(System.in);
        byte selec = scanner.nextByte();
        if(selec == 3){
            System.out.println("chính xách nhé! Thảo, Lâm, Lan");
        }else System.out.println("sai rồi ạ :((");
    }
}
