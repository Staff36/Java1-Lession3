package com.lession3;

import java.util.Scanner;

public class GameMenu  {
    public void menu(){
        Scanner scanner= new Scanner(System.in);
        int gameNumber;
        while (true) {
            System.out.println("Выберите игру: 1- угадай число, 2- Угадай слово, 0-выход");

            gameNumber=scanner.nextInt();
            GuessTheDigitGame guessTheDigitGame = new GuessTheDigitGame();
            GuessTheWordGame guessTheWordGame= new GuessTheWordGame();

            if (gameNumber==1) guessTheDigitGame.startGame(scanner);
            else if(gameNumber==2) guessTheWordGame.startGame(scanner);
            else if (gameNumber==0) break;
            else System.out.println("Неверный номер");

        }
        System.out.println("Спасибо за игру");
        scanner.close();
    }
}
