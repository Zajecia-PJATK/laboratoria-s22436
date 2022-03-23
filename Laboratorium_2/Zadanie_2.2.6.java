package com.company;

import java.io.*;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" +
                x + "," +
                y +
                ')';
    }

    public Point() {
        this.x = 320;
        this.y = 200;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCoordinates(int x,int y){
        setX(x);
        setY(y);
    }
    public void setCoordinates(Point point){
        setX(point.getX());
        setY(point.getY());
    }

    public Point getCoordinates() {
        Point p = new Point(x,y);
        return p;
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(p.x - this.x,2) + Math.pow(p.y - this.y, 2));
    }

}

class Segment{
    private Point v1;
    private Point v2;

    public Segment(Point v1, Point v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    @Override
    public String toString() {
        return "Segment[" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ']';
    }

    public Point getV1() {
        return v1;
    }

    public void setV1(Point v1) {
        this.v1 = v1;
    }

    public Point getV2() {
        return v2;
    }

    public void setV2(Point v2) {
        this.v2 = v2;
    }
    public double getLength(){
        return v1.distance(v2);
    }


}

class Triangle{
    private Point v1;
    private Point v2;
    private Point v3;

    public Triangle(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "Triangle[" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                ']';
    }

    public double getDistances(){
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }

    public String getType(){
        double a = v1.distance(v2);
        double b = v1.distance(v3);
        double c = v2.distance(v3);
        if(a == b && b == c && c == a){
            return "Równoboczny";
        }
        if(a == b || b == c || c == a ){
            return "Równoramienny";
        }
        return "Różnoboczny";
    }

    public Point getV1() {
        return v1;
    }

    public void setV1(Point v1) {
        this.v1 = v1;
    }

    public Point getV2() {
        return v2;
    }

    public void setV2(Point v2) {
        this.v2 = v2;
    }

    public Point getV3() {
        return v3;
    }

    public void setV3(Point v3) {
        this.v3 = v3;
    }
}

public class Main {

    public static void main(String[] args) throws IOError {
        Point p1 = new Point(5, 5);
        Point p2 = new Point(0, 0);
        Point p3 = new Point(10, 0);

        Segment s1 = new Segment(p1, p2);
        Triangle t1 = new Triangle(p1, p2, p3);

        Triangle t2 = new Triangle(new Point(1,1), new Point(4,2), new Point(0,3));

        Triangle t3 = new Triangle(p1, p2, new Point(11,11));

        System.out.println("Wyświetlenie Triangle: " + t1);
        System.out.println("Wyświetlenie Segment: " + s1);

        System.out.println("Obwód trójkąta: " + t1.getDistances());
        System.out.println("Długość odcinka: " + s1.getLength());

        System.out.println("Typ trójkąta t1: " + t1.getType());
        System.out.println("Typ trójkąta t2: " + t2.getType());
        System.out.println("Typ trójkąta t3: " + t3.getType());

    }
}
