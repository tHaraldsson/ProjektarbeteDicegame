package se.tommy.DiceGame;

public class Player {
    //ATTRIBUT
    private String namePlayer;
    private int scorePlayer;
    private int totalScore;

    //KONSTRUKTOR FÖR NAMEPLAYER
    public Player(String name) {
        this.namePlayer = name;
        this.totalScore = 0;
    }

    //GETTER-bää
    public String getNamePlayer() {
        return namePlayer;
    }

    public int getScorePlayer() {
        return scorePlayer;
    }

    public int getTotalScore() {
        return totalScore;
    }

    //SETTER FÖR SCORE
    public void setScorePlayer(int scorePlayer) {
        this.scorePlayer = scorePlayer;
    }
    //LÄGGER TILL POÄNG EFTER VARJE RUNDA I TOTALSCORE
    public void addTotalScore(int score) {
        this.totalScore += score;
    }
}



