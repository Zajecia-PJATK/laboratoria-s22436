package com.company;

import java.io.*;

class MyDate{
    int month, day, year;

    public MyDate(int day, int month, int year) throws Exception {
        this.setMonth(month);
        this.setDay(day);
        this.setYear(year);
    }

    public String displayDate(){
        return  day + "/" + month + "/" + year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) throws Exception {
        if(month > 0 && month < 13){
            this.month = month;
        }else{
            throw new Exception("INVALID MONTH");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) throws Exception {
        if(day > 0 && day < 32){
            this.day = day;
        }else{
            throw new Exception("INVALID DAY");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws Exception {
        if(year > 1990 && day < 2051){
            this.year = year;
        }else{
            throw new Exception("INVALID DAY");
        }
    }
}

public class Main {

    public static void main(String[] args) throws IOError {
        try{
            MyDate firstDate = new MyDate(12,11, 2003);
            System.out.println("First date: " + firstDate.displayDate());
            MyDate secondDate = new MyDate(31,3, 2050);
            System.out.println("Second date: " + secondDate.displayDate());
            MyDate invalidDate = new MyDate(0,11, 2003);

            // The line above will throw an error so the line below will not be invoked
            System.out.println("Third date: " + invalidDate.displayDate());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
