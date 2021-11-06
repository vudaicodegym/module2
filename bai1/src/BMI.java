import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("nhập cân nặng (kg):");
        weight = scanner.nextDouble();

        System.out.print("chiều cao (mét):");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "gầy");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "bình thường");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "thừa cân");
        else
            System.out.printf("%-20.2f%s", bmi, "béo phì");
    }
}
