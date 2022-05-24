package com.company;

public interface Analyzable{
    double getAverage();
    GradedActivity getHighest();
    GradedActivity getLowest();
}

class GradedActivity {
    private double score; // Wynik punktowy.

    public void setScore(double s)
    {
        score = s;
    }

    public double getScore()
    {
        return score;
    }

    public char getGrade(){
        char letterGrade;
        if (score >= 90)
            letterGrade = '5';
        else if (score >= 80)
            letterGrade = '4';
        else if (score >= 70)
            letterGrade = '3';
        else if (score >= 60)
            letterGrade = '2';
        else
            letterGrade = '1';
        return letterGrade;
    }
}

class CourseGrades implements Analyzable {
    private GradedActivity[] grades;

    public GradedActivity[] getGrades() {
        return grades;
    }

    public void setGrades(GradedActivity[] grades) {
        this.grades = grades;
    }

    @Override
    public double getAverage() {
        double sum = 0;
        for(GradedActivity gradedActivity : grades){
            sum += gradedActivity.getScore();
        }
        return sum / grades.length;
    }

    @Override
    public GradedActivity getHighest() {
        int highestIndex = 0;
        double highestScore = grades[highestIndex].getScore();

        for(int i = highestIndex + 1; i < grades.length; i++){
            if(grades[i].getScore() > highestScore){
                highestIndex = i;
                highestScore = grades[i].getScore();
            }
        }

        return grades[highestIndex];
    }

    @Override
    public GradedActivity getLowest() {
        int lowestIndex = 0;
        double lowestScore = grades[lowestIndex].getScore();

        for(int i = lowestIndex + 1; i < grades.length; i++){
            if(grades[i].getScore() < lowestScore){
                lowestIndex = i;
                lowestScore = grades[i].getScore();
            }
        }

        return grades[lowestIndex];
    }
}





public class Main {
    public static void main(String[] args)  {
        CourseGrades courseGrades = new CourseGrades();
        GradedActivity gaOne = new GradedActivity();
        gaOne.setScore(100);
        GradedActivity gaTwo = new GradedActivity();
        gaTwo.setScore(50);
        GradedActivity gaThree = new GradedActivity();
        gaThree.setScore(40);
        GradedActivity gaFour = new GradedActivity();
        gaFour.setScore(70);
        courseGrades.setGrades(new GradedActivity[] {gaOne, gaTwo, gaThree, gaFour});

        System.out.println(courseGrades.getHighest().getScore());
        System.out.println(courseGrades.getLowest().getScore());
        System.out.println(courseGrades.getAverage());
    }
}
