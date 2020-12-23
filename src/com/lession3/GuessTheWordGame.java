package com.lession3;

import java.util.Scanner;

public class GuessTheWordGame extends Game {
    private String[] words = {
            "apple", "orange", "lemon", "banana",
            "apricot", "avocado", "broccoli", "carrot",
            "cherry","garlic", "grape", "melon",
            "leak", "kiwi", "mango", "mushroom",
            "nut", "olive", "pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin",
            "potato"};
    private String userWord;
    private String hiddenWord;
    private int count=0;
    private boolean isCheat=false;
    private boolean win=false;

    public void startGame(Scanner scanner) {

        do {
            hiddenWord = words[((int) (Math.random() * (words.length - 1)))];
            showWords(words);
            scanner.nextLine();

            while (win==false) {

                userWord = scanner.nextLine().toLowerCase();
                count++;
                if (userWord.equals(hiddenWord) && isCheat == true) {
                    System.out.println("Вы угадали c " + count + " попытки, но постарайтесь играть честно");
                    win=true;
                } else if (userWord.equals(hiddenWord) && isCheat == false) {
                    System.out.println("Вы угадали c " + count + " попытки");
                    win=true;
                } else {
                    printElements(hiddenWord, userWord);
                    checkOnCheat(userWord);

                }
            }

        } while (checkOnRepeat(scanner));
    }


    private void showWords(String[] words){
        System.out.println("Система загадала слово, отгадайте из следующих:");
            for (int i=1;i<=words.length;i++){
                if (i%4==0) {
                    System.out.println(words[i-1]);
                }
                 else {
                    if (i==words.length) System.out.println(words[i-1]);
                     else System.out.print(words[i-1]+", ");
                }
            }
        }


    protected void checkOnCheat(String userWord){
        if(userWord.equals("iddqd")) {
            isCheat=true;
            System.out.println();
            System.out.println(hiddenWord);
            System.out.println();}
    }

    private void printElements(String hiddenWord, String userWord){
        int baseLength;
        if(userWord.length()>hiddenWord.length()) baseLength=hiddenWord.length();
          else baseLength=userWord.length();
        int deltaLength=15-baseLength;
        for (int i=0; i<baseLength;i++){
            if (userWord.charAt(i)==hiddenWord.charAt(i))
                System.out.print(hiddenWord.charAt(i));
            else System.out.print('#');
        }
        for (int i=0;i<deltaLength;i++) System.out.print('#');
        System.out.println();
    }

}






