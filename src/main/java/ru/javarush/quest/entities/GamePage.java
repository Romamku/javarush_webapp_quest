package ru.javarush.quest.entities;

public class GamePage {

    private String title;
    private String question;
    private GamePageCard[] cards;

    public GamePage(String title, String question, GamePageCard[] cards) {
        this.title = title;
        this.question = question;
        this.cards = cards;
    }

    public String getTitle() {
        return title;
    }

    public String getQuestion() {
        return question;
    }

    public GamePageCard[] getCards() {
        return cards;
    }
}
