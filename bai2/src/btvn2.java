public class btvn2 {
    public static void main(String[] args) {
//        Tính tổng các SNT từ 10 -> 50.
        int total = 0;
        for (int a = 10; a < 50; a++) {
            boolean check = true;
            for (int b = 2; b <= a/2; b++) {
                if (a % b == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
            total += a;
            }
        }
        System.out.print(total);
    }
}
