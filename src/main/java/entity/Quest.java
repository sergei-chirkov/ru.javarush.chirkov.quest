package entity;

import java.util.ArrayList;

public class Quest {
    public ArrayList<Question> questions = new ArrayList<>();
    @Override
    public String toString() {
        return "Quest{" +
                "questions=" + questions +
                '}';
    }


}
