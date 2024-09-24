package se.tommy.DiceGame;

import java.util.Random;
import java.util.Scanner;

public class Methods {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    //METOD FÖR EN SPELOMGÅNG
    public void playerTurn(Player player) {
        System.out.println("\n" + player.getNamePlayer() + " spelar nu, tryck enter för att kasta tärningen");
        scanner.nextLine();
        int roll1 = random.nextInt(6) + 1;
        System.out.println(player.getNamePlayer() + " kastade: " + roll1);
        System.out.println("Tryck enter igen för att kasta tärningen");
        scanner.nextLine();
        int roll2 = random.nextInt(6) + 1;
        System.out.println(player.getNamePlayer() + " kastade: " + roll2);
        int roundscore = diceSum(roll1, roll2);
        player.setScorePlayer(roundscore);
        System.out.println("*****" + player.getNamePlayer()
                + " fick " + player.getScorePlayer() + " poäng*****");
        player.addTotalScore(roundscore);
    }

    //METOD FÖR ATT BERÄKNA SUMMAN AV TÄRNINGSKASTEN
    public int diceSum(int roll1, int roll2) {
        int sum = roll1 + roll2;
        return sum;
    }

    public void showHighScore(Player player1, Player player2) {
        System.out.println("\n*****HIGHSCORE EFTER DENNA RUNDA*****");
        System.out.println(player1.getNamePlayer() + " : " + player1.getTotalScore());
        System.out.println(player2.getNamePlayer() + " : " + player2.getTotalScore());

    }
}
