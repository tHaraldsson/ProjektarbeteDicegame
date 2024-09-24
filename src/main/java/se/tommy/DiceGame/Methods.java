package se.tommy.DiceGame;

import java.util.Random;
import java.util.Scanner;

public class Methods {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    //METOD FÖR EN SPELOMGÅNG
    public void playerTurn(Player player){
        System.out.println("\n" + player.getNamePlayer() + " börjar spelet, tryck enter för att kasta tärningen");
        scanner.nextLine();
        int roll1 = random.nextInt(6) + 1;
        System.out.println(player.getNamePlayer() + " kastade: " + roll1);
        System.out.println("Tryck enter igen för att kasta tärningen");
        scanner.nextLine();
        int roll2 = random.nextInt(6) + 1;
        System.out.println(player.getNamePlayer() + " kastade: " + roll2);
        player.setScorePlayer(diceSum(roll1, roll2));
        System.out.println("*****" + player.getNamePlayer() + " fick " + player.getScorePlayer() + " poäng*****");
    }
    //METOD FÖR ATT BERÄKNA SUMMAN AV TÄRNINGSKASTEN
    public int diceSum(int roll1, int roll2) {
        int sum = roll1 + roll2;
        return sum;
    }

}
