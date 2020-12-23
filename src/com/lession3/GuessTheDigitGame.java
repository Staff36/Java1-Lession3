package com.lession3;

import java.util.Scanner;

public class GuessTheDigitGame extends Game{

    private int digit;
    private int userDigit;
    private String status;


    public void startGame(Scanner scanner){

        do {
            status = "проиграли.";
            digit = (int) (Math.random() * 9);
            System.out.print("Отгадайте число от 0 до 9. ");
            for (int i = 3; i > 0; i--) {
                System.out.println("Количество попыток: " + i);
                userDigit = scanner.nextInt();
                if (userDigit == digit) {
                    status = "выиграли!!!";
                    break;
                } else if (userDigit < 0 || userDigit > 9) {
                    System.out.println("Указанное число должно быть в диапазоне от 0 до 9");
                } else if(digit>userDigit) {
                    System.out.println("Загаданное число больше!");
                } else if (digit<userDigit){
                    System.out.println("Загаданное число меньше!");
                }
            }
            System.out.println("Вы " + status + "!!!");


        } while (checkOnRepeat(scanner));

    }



}

