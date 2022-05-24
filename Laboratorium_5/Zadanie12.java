package com.company;

interface One{
    void exOne();
    void exTwo();
}

interface Two{
    void exThree();
    void exFour();
}

interface Three extends One, Two{
    void exFive();
}

class SomeParentClass {
    void exSix(){
        System.out.println("This is written inside SomeParentClass in method exSix");
    }
}

class SomeChildClass extends SomeParentClass implements Three{

    @Override
    public void exOne() {
        System.out.println("This is written inside SomeChildClass in method exOne");
    }

    @Override
    public void exTwo() {
        System.out.println("This is written inside SomeChildClass in method exTwo");
    }

    @Override
    public void exThree() {
        System.out.println("This is written inside SomeChildClass in method exThree");
    }

    @Override
    public void exFour() {
        System.out.println("This is written inside SomeChildClass in method exFour");
    }

    @Override
    public void exFive() {
        System.out.println("This is written inside SomeChildClass in method exFive");
    }
}

public class Main {

    public static void testMethodOne(One one){
        one.exOne();
    }

    public static void testMethodTwo(Two two){
        two.exFour();
    }

    public static void testMethodThree(Three three){
        three.exFive();
        three.exTwo();
        three.exThree();
    }

    public static void main(String[] args)  {
        SomeChildClass someChildClass = new SomeChildClass();
        testMethodOne(someChildClass);
        testMethodTwo(someChildClass);
        testMethodThree(someChildClass);
    }
}