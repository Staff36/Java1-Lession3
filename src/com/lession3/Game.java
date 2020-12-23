package com.lession3;

import java.util.Scanner;

public abstract class Game {
    protected boolean checkOnRepeat(Scanner scanner){
        while (true){
            System.out.println("Повторить игру еще раз? 1-да / 0- нет");
            int repeat = scanner.nextInt();
            if (repeat < 0 || repeat > 1) {
                System.out.println("Чтобы повторить игру, введите 1, для выхода введите 0");
            }   else if (repeat==1) return true;
            else return false;
        }

}
    public void startGame(Scanner scanner){}




}
