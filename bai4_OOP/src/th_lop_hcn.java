import java.awt.geom.Area;
import java.util.Scanner;

public class th_lop_hcn { //===tạo class hcn
    double witdh, height;
    public th_lop_hcn(){}
    //thuộc tính hcn
    public th_lop_hcn(double witdh, double height){
        this.witdh = witdh;
        this.height = height;
    }
    //phương thức của hcn
    public double getArea(){ //phương thức tính diện tích
        return this.witdh * this.height;
    }
    public double getPerimeter(){ //phương thức tính chu vi
        return (this.witdh + this.height) *  2;
    }
    public String display(){//phương thức hiển thị thuộc tính của hcn
        return "hcn{ " + "chieu rộng = " + witdh + ", chiều cao= " + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều rộng: ");
        double witdh = scanner.nextDouble();
        System.out.println("nhập chiều cao: ");
        double height = scanner.nextDouble();
        th_lop_hcn th_lop_hcn = new th_lop_hcn(witdh, height);
        System.out.println("hcn của bạn \n" + th_lop_hcn.display());
        System.out.println("chu vi hcn = " + th_lop_hcn.getPerimeter());
        System.out.println("diện tích =" + th_lop_hcn.getArea());
    }
}

