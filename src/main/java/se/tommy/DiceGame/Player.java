package se.tommy.DiceGame;

public class Player {
    //ATTRIBUT
    private String namePlayer;
    private int scorePlayer;

    //KONSTRUKTOR FÖR NAMEPLAYER
    public Player(String name) {
        this.namePlayer = name;
    }

    //GETTER-bää
    public String getNamePlayer() {
        return namePlayer;
    }

    public int getScorePlayer() {
        return scorePlayer;
    }

    //SETTER FÖR SCORE
    public void setScorePlayer(int scorePlayer) {
        this.scorePlayer = scorePlayer;
    }


}



