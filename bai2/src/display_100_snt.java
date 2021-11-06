public class display_100_snt {
    public static void main(String[] args) {
//        hiển thị các số nguyên tố nhỏ hơn 100.
        for (byte i = 2; i < 100; i++){
            boolean check = true;
            for (byte j = 2; j <= i/2; j++){
                if (i % j == 0){
                    check = false;
                }
            }
            if (check){
                System.out.println(i);
            }
        }
    }
}
