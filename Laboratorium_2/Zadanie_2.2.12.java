package com.company;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.*;
@AllArgsConstructor @ToString
class Numbers{
    @Getter @Setter
    private int n1, n2, n3;
}

public class Main {
    public static void main(String[] args) throws IOError {
        Numbers collectionOfNumbers = new Numbers(1,2,3);
        System.out.println(collectionOfNumbers);
        collectionOfNumbers.setN1(6);
        collectionOfNumbers.setN2(7);
        collectionOfNumbers.setN3(8);
        System.out.println(collectionOfNumbers);
        System.out.println(collectionOfNumbers.getN1());
        System.out.println(collectionOfNumbers.getN2());
        System.out.println(collectionOfNumbers.getN3());
    }
}
