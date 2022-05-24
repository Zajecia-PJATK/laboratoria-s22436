package com.company;

class Word implements Comparable<Word>{
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public int compareTo(Word w) {
        // Compares lengths of internal String variable
        if(getWord().length() > w.getWord().length()){
            return 1;
        }
        if(getWord().length() < w.getWord().length()){
            return -1;
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args)  {
        Word word1 = new Word("Long");
        Word word2 = new Word("Longer");
        System.out.println(word1.compareTo(word2));
        word1.setWord("Even longer");
        System.out.println(word1.compareTo(word2));
        word1.setWord("The same length");
        word2.setWord("The same length");
        System.out.println(word1.compareTo(word2));
    }
}