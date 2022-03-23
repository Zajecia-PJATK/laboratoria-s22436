package com.company;

import java.io.*;

class Student {
    private String name = "Unknown", surname = "Unknown", indexNumber;
    private double attendancePercentage;
    int grade;

    public Student(String name, String surname, String indexNumber, double attendancePercentage, int grade) {
        this.name = name.length() > 0 ? name : "Unknown";
        this.surname = surname.length() > 0 ? surname : "Unknown";
        this.indexNumber = indexNumber;
        this.attendancePercentage = attendancePercentage;
        this.grade = attendancePercentage < .5 ? 2 : grade;
    }

    public Student(String indexNumber, double attendancePercentage, int grade) {
        this.indexNumber = indexNumber;
        this.attendancePercentage = attendancePercentage;
        this.grade = attendancePercentage < .5 ? 2 : grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public double getAttendancePercentage() {
        return attendancePercentage;
    }

    public void setAttendancePercentage(double attendancePercentage) {
        if(attendancePercentage < .5){
            setGrade(2);
        }
        this.attendancePercentage = attendancePercentage;
    }

    public int getGrade() {
        if(attendancePercentage < .5){
            return 2;
        }
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", indexNumber='" + indexNumber + '\'' +
                ", attendancePercentage=" + attendancePercentage +
                ", grade=" + grade +
                '}';
    }
}

public class Main {

    public static void main(String[] args) throws IOError {
        Student knownStudent = new Student("Marek", "Kowlski", "s2232", .9, 5);
        Student unknownStudent = new Student("s1132", .6, 4);
        Student unattendedStudent = new Student("Kamil", "Piątek", "s5632", .4, 4);

        System.out.println(knownStudent);
        System.out.println(unknownStudent);
        System.out.println(unattendedStudent);
    }
}
