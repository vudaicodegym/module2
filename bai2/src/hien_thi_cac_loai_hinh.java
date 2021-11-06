public class hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        //hình chữ nhật
//        for (byte i = 0; i < 3; i++){
//            for (byte j = 0; j < 50; j++){
//                System.out.print("*");
//            }
//            System.out.println("\n");
//        }
        //hình tam giác 1
//        for (byte i = 0; i < 10; i++){
//            for (byte j = 0; j < i; j++){
//                System.out.print("*");
//            }
//            System.out.println("\n");
//        }
        //hình tam giác 2
        for (byte i = 0; i < 6; i++){
            for(byte j = 6; j > i; j--){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
