package th_build_fanclass;

import jdk.nashorn.internal.runtime.regexp.joni.SearchAlgorithm;

public class Fan {
    final int slow = 1, medium = 2, fast =3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    @Override
    public String toString() {
        return "Fan{" +
                "slow=" + slow +
                ", medium=" + medium +
                ", fast=" + fast +
                ", speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public int getSpeed() {
        return speed;
    }
    public String getColor() {
        return color;
    }
    public int getFast() {
        return fast;
    }
    public int getMedium() {
        return medium;
    }
    public int getSlow() {
        return slow;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

