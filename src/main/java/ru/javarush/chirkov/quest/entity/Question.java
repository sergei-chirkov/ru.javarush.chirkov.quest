package ru.javarush.chirkov.quest.entity;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String question ;
    private List<String> answwerds = new ArrayList<>();
    private String answerd ;

    public String nameImg;

    public String getQuestion() {
        return question;
    }

    public List<String> getAnswwerds() {
        return answwerds;
    }

    public String getAnswerd() {
        return answerd;
    }

    public String getNameImg() {
        return nameImg;
    }

    @Override
    public String toString() {
        return "Question{" +
                ", question='" + question + '\'' +
                ", answwerds=" + answwerds +
                ", answerd='" + answerd + '\'' +
                '}';
    }
}
