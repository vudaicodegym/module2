import java.util.Scanner;

public class bt_StopWatch {
    double startTime;
    double endTime;
    public  bt_StopWatch(){};
    public bt_StopWatch(double startTime, double endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public double start(){
         startTime = System.currentTimeMillis ();
         return startTime;
    }
    public double stop(){
        endTime = System.currentTimeMillis ();
        return endTime;
    }
    public double getElapspedTime(){
        return endTime - startTime;
    }

    public static void main(String[] args) {
        //tao doi tuong
        bt_StopWatch bt_stopWatch = new bt_StopWatch();
//        Scanner scanner = new Scanner(System.in);
        // goi start
        bt_stopWatch.start();
        for (int i = 0; i < 100000; i++){
            System.out.println(i);
        }
        // goi stop
        bt_stopWatch.stop();
        // in ra tgian
        System.out.println(bt_stopWatch.getElapspedTime());
    }
}


