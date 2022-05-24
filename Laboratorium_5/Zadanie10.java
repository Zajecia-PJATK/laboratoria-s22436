package com.company;

interface One {
    void exampleOne();
}

interface Two {
    int exampleTwo(int a, int b, int c);
}

interface Three {
    void exampleThree(int a);
}

interface Four {
    int exampleFour(int a, int b);
}

public class Main {
    public static void main(String[] args)  {
        One exOne = () -> System.out.println("This is printed by Lambda example One");
        exOne.exampleOne();
        Two exTwo = (int a, int b, int c) -> a+  b + c;
        System.out.println("This is result of Lambda example Two: " + exTwo.exampleTwo(1, 2 ,3));
        Three exThree = (int a) -> System.out.println("This is printed by Lambda example Three: " + a);
        exThree.exampleThree(32);
        Four exFour = (int a, int b) -> {
            int exampleTempVariable = a + b;
            exampleTempVariable *= 2;
            return exampleTempVariable;
        };
        System.out.println("This is result of multiline Lambda example Four: " + exFour.exampleFour(3, 6));
    }
}
