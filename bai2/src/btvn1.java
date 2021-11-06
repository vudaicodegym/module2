public class btvn1 {
    public static void main(String[] args) {
//        Tìm số chia hết cho 5 tại vị trí thứ 20, bắt đầu từ 11.
        int a = 0;
        int b = 11;
        while (a < 20){
            b++;
            if (b % 5 == 0) {
                a++;
            }
        }
        System.out.println(b);
    }
}
