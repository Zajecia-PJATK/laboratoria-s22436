package com.company;

import java.io.*;

class Numbers{
    private int n1, n2, n3;

    public Numbers(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public int sum(){
        return n1+n2+n3;
    }

    public double average(){
        return (n1+n2+n3)/3.0;
    }

    public int min(){
        return Math.min(Math.min(n1, n2), n3);
    }

    public int max(){
        return Math.max(Math.max(n1, n2), n3);
    }

    public double geometric(){
        return Math.pow(n1*n2*n3, 1.0/3.0);
    }

}

public class Main {

    public static void main(String[] args) throws IOError {
        Numbers numberSet = new Numbers(4,5,6);
        System.out.println("Sum: " + numberSet.sum());
        System.out.println("Average: " + numberSet.average());
        System.out.println("Max: " + numberSet.max());
        System.out.println("Min: " + numberSet.min());
        System.out.println("Geometric: " + numberSet.geometric());
    }
}
