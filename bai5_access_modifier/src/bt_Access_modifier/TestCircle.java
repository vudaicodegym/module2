package bt_Access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle.getRadius());
        Circle circle1 = new Circle();
        System.out.println(circle.getArea());
    }
}
