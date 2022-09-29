package ru.javarush.quest.entities;

public class GamePageCard {
    public String ideaOne;
    public String ideaTwo;
    public String respond;
    public boolean result;

    public GamePageCard(String ideaOne, String ideaTwo, String respond, boolean result) {
        this.ideaOne = ideaOne;
        this.ideaTwo = ideaTwo;
        this.respond = respond;
        this.result = result;
    }

    public String getIdeaOne() {
        return ideaOne;
    }

    public String getIdeaTwo() {
        return ideaTwo;
    }

    public String getRespond() {
        return respond;
    }
}
