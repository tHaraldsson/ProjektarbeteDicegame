package se.tommy.DiceGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //INTRODUKTION TILL SPELET
        System.out.println("--------Välkommen till Dicegame!!--------");
        System.out.println("Ange namn för spelare 1");
        Player player1 = new Player(scanner.nextLine());//HÄR SKAPAS FÖRSTA SPELARENS OBJEKT
        System.out.println("Ange namn för spelare 2");
        Player player2 = new Player(scanner.nextLine());//HÄR SKAPAS ANDRA SPELARENS OBJEKT
        System.out.println("\nSpelare1: " + player1.getNamePlayer() + "\n" + "Spelare2: " + player2.getNamePlayer());
        System.out.println("\nNamnen valda. Nu startar spelet");

        //WHILE LOOP IFALL MAN VILL FORTSÄTTA SPELA
        boolean continueGame = true;
        while (continueGame) {

            //SPELARE 1 BÖRJAR
            System.out.println("\n" + player1.getNamePlayer() + " börjar spelet, tryck enter för att kasta tärningen");
            scanner.nextLine();
            int roll1 = random.nextInt(6) + 1;
            System.out.println(player1.getNamePlayer() + " kastade: " + roll1);
            System.out.println("Tryck enter igen för att kasta tärningen");
            scanner.nextLine();
            int roll2 = random.nextInt(6) + 1;
            System.out.println(player1.getNamePlayer() + " kastade: " + roll2);
            player1.setScorePlayer(player1.diceSum(roll1, roll2));
            System.out.println("*****" + player1.getNamePlayer() + " fick " + player1.getScorePlayer() + " poäng*****");

            //SPELARE 2 BÖRJAR
            System.out.println("\nNu är det " + player2.getNamePlayer() + "s tur, tryck enter för att kasta tärningen");
            scanner.nextLine();
            int roll3 = random.nextInt(6) + 1;
            System.out.println(player2.getNamePlayer() + " kastade: " + roll3);
            System.out.println("Tryck enter igen för att kasta tärningen");
            scanner.nextLine();
            int roll4 = random.nextInt(6) + 1;
            System.out.println(player2.getNamePlayer() + " kastade: " + roll4);
            player2.setScorePlayer(player2.diceSum(roll3, roll4));
            System.out.println("\n" + "*****" + player2.getNamePlayer() + " fick " + player2.getScorePlayer() + " poäng*****");
            System.out.println("*****" + player1.getNamePlayer() + " fick " + player1.getScorePlayer() + " poäng*****");

            //IF SATS FÖR ATT SE VEM VINNAREN ÄR
            if (player1.getScorePlayer() > player2.getScorePlayer()) {
                System.out.println("\nVinnaren är: " + player1.getNamePlayer() + " med " + player1.getScorePlayer() + " poäng" + "\uD83C\uDF88");
            } else if (player2.getScorePlayer() > player1.getScorePlayer()) {
                System.out.println("\nVinnaren är: " + player2.getNamePlayer() + " med " + player2.getScorePlayer() + " poäng" + "\uD83C\uDF88");
            } else if (player1.getScorePlayer() == player2.getScorePlayer()) {
                System.out.println("\nDet blev oavgjort!!!");
            }
            //WHILE LOOP IFALL MAN FÅR ETT OGILTIGT SVAR FRÅN FRÅGAN "VILL DU FORTSÄTTA"
            boolean continueAsking = true;
            while (continueAsking) {
                //VILL DU FORTSÄTTA SPELA FRÅGA MED IF SATS
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
}
