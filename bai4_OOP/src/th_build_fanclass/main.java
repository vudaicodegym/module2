package th_build_fanclass;

public class main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(2,true,10,"yellow");
        fan1.setSpeed(fan1.fast);
        System.out.println(fan1);
        Fan fan2 = new Fan(2,false, 5, "blue");
        System.out.println("fan2 = " + fan2);
    }
}
