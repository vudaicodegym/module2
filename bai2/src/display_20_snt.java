public class display_20_snt {
    public static void main(String[] args) {
//        chúng ta sẽ phát triển một ứng dụng cho phép hiển thị 20 số nguyên tố đầu tiên.
         int amount = 20;
         int count = 0;
         int number = 2;
         while (count < amount){
             boolean check = true;
             for (int i = 2; i <= number/2; i++){
                 if (number % i == 0){
                     check = false;
                     break;
                 }
             }
            if (check){
                count++;
                System.out.println(number);
            }
            number++;
         }
    }
}
