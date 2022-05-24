package com.company;

import java.util.Arrays;
import java.util.Scanner;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable{
    private double x,y,xSpeed, ySpeed;

    public MovablePoint(double x, double y, double xSpeed, double ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        setY(getY() + getySpeed());
    }

    @Override
    public void moveDown() {
        setY(getY() - getySpeed());
    }

    @Override
    public void moveLeft() {
        setX(getX() - getxSpeed());
    }

    @Override
    public void moveRight() {
        setX(getX() + getxSpeed());
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }


}


public class Main {
    public static void main(String[] args)  {
        MovablePoint mp = new MovablePoint(0, 0, 10, 10);
        System.out.println(mp);
        mp.moveUp();
        mp.moveRight();
        System.out.println(mp);
        mp.setxSpeed(20);
        mp.setySpeed(20);
        mp.moveDown();
        mp.moveLeft();
        System.out.println(mp);
    }
}
