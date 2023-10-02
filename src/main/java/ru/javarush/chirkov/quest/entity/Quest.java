package ru.javarush.chirkov.quest.entity;

import java.util.ArrayList;

public class Quest {
    public String questName;
    public ArrayList<Question> questions = new ArrayList<>();

    @Override
    public String toString() {
        return "Quest{" +
                "questName='" + questName + '\'' +
                ", questions=" + questions +
                '}';
    }
}
