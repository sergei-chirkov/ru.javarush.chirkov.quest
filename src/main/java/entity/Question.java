package entity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Question {
    public String question ;
    public List<String> answwerds = new ArrayList<>();
    public String answerd ;

    public String getQuestion() {
        return question;
    }

    public List<String> getAnswwerds() {
        return answwerds;
    }

    public String getAnswerd() {
        return answerd;
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
