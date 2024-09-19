package se.tommy.DiceGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Player player = new Player();


        System.out.println("--------Välkommen till Dicegame!!---------");
        System.out.println("Ange namn för spelare 1");
        player.setNamePlayer1(scanner.nextLine());
        System.out.println("Ange namn för spelare 2");
        player.setNamePlayer2(scanner.nextLine());
        System.out.println("\nSpelare1: " + player.getNamePlayer1() + "\n" + "Spelare2: " + player.getNamePlayer2());
        System.out.println("\nNamnen valda. Nu startar spelet");

        boolean continueGame = true;
        while (continueGame) {
            //SPELARE 1 BÖRJAR
            System.out.println("\n" + player.getNamePlayer1() + " börjar spelet, tryck enter för att kasta tärningen");
            scanner.nextLine();
            int roll1 = random.nextInt(6) + 1;
            System.out.println(player.getNamePlayer1() + " kastade: " + roll1);
            System.out.println("Tryck enter igen för att kasta tärningen");
            scanner.nextLine();
            int roll2 = random.nextInt(6) + 1;
            System.out.println(player.getNamePlayer1() + " kastade: " + roll2);
            player.setScorePlayer1(diceSum(roll1, roll2));
            System.out.println(player.getNamePlayer1() + " fick " + player.getScorePlayer1() + " poäng");

            //SPELARE 2 BÖRJAR
            System.out.println("\nNu är det " + player.getNamePlayer2() + "s tur, tryck enter för att kasta tärningen");
            scanner.nextLine();
            int roll3 = random.nextInt(6) + 1;
            System.out.println(player.getNamePlayer2() + " kastade: " + roll3);
            System.out.println("Tryck enter igen för att kasta tärningen");
            scanner.nextLine();
            int roll4 = random.nextInt(6) + 1;
            System.out.println(player.getNamePlayer2() + " kastade: " + roll4);
            player.setScorePlayer2(diceSum(roll3, roll4));
            System.out.println(player.getNamePlayer2() + " fick " + player.getScorePlayer2() + " poäng");
            System.out.println("\n" + player.getNamePlayer1() + " fick " + player.getScorePlayer1() + " poäng");

            //IFSATS FÖR ATT SE VEM VINNAREN ÄR
            if (player.getScorePlayer1() > player.getScorePlayer2()) {
                System.out.println("\nVinnaren är: " + player.getNamePlayer1() + " med " + player.getScorePlayer1() + " poäng");
            } else if (player.getScorePlayer2() > player.getScorePlayer1()) {
                System.out.println("\nVinnaren är: " + player.getNamePlayer2());
            } else if (player.getScorePlayer1() == player.getScorePlayer2()) {
                System.out.println("\nDet blev oavgjort!!!");
            }

            boolean continueAsking = true;
            while (continueAsking) {
                System.out.println("\nvill du fortsätta spela? Y/N");
                String answer = scanner.nextLine();

                if (answer.equalsIgnoreCase("y")) {
                    continueGame = true;
                    continueAsking = false;
                } else if (answer.equalsIgnoreCase("n")) {
                    continueGame = false;
                    continueAsking = false;
                    System.out.println("Game Over!!!");
                } else {
                    System.out.println("Ogiltig inmatning, försök igen.");
                    continueAsking = true;
                }
            }
        }


    }

    public static int diceSum(int roll1, int roll2) {
        int sum = roll1 + roll2;
        return sum;
    }
//    // LEADERBOARD
//    public static int calculateTotalScore() {
//        int total = 0;
//        //iter
//        for (Player product1 : ) {
//            total += product1.getScorePlayer1();
//        }
//        return total;
//    }
}
