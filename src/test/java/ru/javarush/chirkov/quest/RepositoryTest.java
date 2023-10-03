package ru.javarush.chirkov.quest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import ru.javarush.chirkov.quest.entity.Quest;
import ru.javarush.chirkov.quest.entity.Question;
import ru.javarush.chirkov.quest.repository.Repository;

import java.util.ArrayList;
import java.util.List;


public class RepositoryTest {
    @Test
    public void shouldReturnQuest(){
        Quest quest = Repository.getQuest("quest");
        ArrayList<Question> questions = quest.questions;
        List<String> answwerds = new ArrayList<>();
        answwerds.add("Показывает как высоко он сидит");
        answwerds.add("Показывает какой объем информации помещается на диск");

        assertEquals(quest.questName,"quest");
        assertEquals(questions.get(0).getQuestion(),"Что делает Билл Гейтс?" );
        assertEquals(questions.get(0).getAnswerd(),"Показывает какой объем информации помещается на диск" );
        assertEquals(questions.get(0).getNameImg(),"https://cs13.pikabu.ru/post_img/2020/01/19/10/og_og_157945511426699035.jpg" );
        assertEquals(questions.get(0).getAnswwerds(),answwerds );
    }


}
