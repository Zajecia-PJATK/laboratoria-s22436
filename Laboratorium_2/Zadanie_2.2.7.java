package com.company;

import java.io.*;

enum CARD_COLOR{
    HEARTS,
    DIAMONDS,
    CLUBS,
    SPADES
}

class Card {
    private int power;
    private CARD_COLOR color;

    public Card(int power, CARD_COLOR color) {
        this.power = power;
        this.color = color;
    }

    private String getPowerLabel(){
        if(power > 10){
            switch (power){
                case 11: return "Walet";
                case 12: return "Dama";
                case 13: return "Król";
                case 14: return "As";
                case 15: return "Jocker";
                default: return Integer.toString(power);
            }
        }else{
            return Integer.toString(power);
        }
    }

    private String getColorLabel(){
        switch (color){
            case DIAMONDS: return "Karo";
            case CLUBS: return "Trefl";
            case HEARTS: return "Kier";
            case SPADES: return "Pik";
            default: return "";
        }
    }

    @Override
    public String toString() {
        return "Moc karty: " +
                getPowerLabel() +
                ", Kolor karty: " + getColorLabel();
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public CARD_COLOR getColor() {
        return color;
    }

    public void setColor(CARD_COLOR color) {
        this.color = color;
    }
}

public class Main {

    public static void main(String[] args) throws IOError {
        Card c1 = new Card(1, CARD_COLOR.HEARTS);
        Card c2 = new Card(10, CARD_COLOR.DIAMONDS);
        Card c3 = new Card(12, CARD_COLOR.CLUBS);
        Card c4 = new Card(14, CARD_COLOR.SPADES);

        System.out.println("Karta c1: " + c1);
        System.out.println("Karta c2: " + c2);
        System.out.println("Karta c3: " + c3);
        System.out.println("Karta c4: " + c4);


    }
}
