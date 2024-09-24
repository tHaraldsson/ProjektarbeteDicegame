package se.tommy.DiceGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Methods methods = new Methods();
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
            methods.playerTurn(player1);
            //SPELARE 2 BÖRJAR
            methods.playerTurn(player2);

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
