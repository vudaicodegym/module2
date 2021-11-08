public class bt_findmax_mang2chieu {
    public static void main(String[] args) {
        int[][] arr = {{8,6,4,2,0,}, {1,3,5,7,9}};
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("giá trọ lớn nhất trong mảng 2 chiều là: " + max);
    }
}
