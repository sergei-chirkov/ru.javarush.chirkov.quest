package repository;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Quest;
import entity.Question;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class Repository {
    public static Quest getQuest() {
        return quest;
    }

    private static Quest quest = new Quest();
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("/home/administrator/IdeaProjects/ru.javarush.chirkov.quest/src/main/java/database/quest.json");

        quest = objectMapper.readValue(file, Quest.class);
//        System.out.println(question);
    }
}
