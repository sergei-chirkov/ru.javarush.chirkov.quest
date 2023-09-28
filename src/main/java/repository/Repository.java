package repository;


import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Quest;

import java.io.File;
import java.io.IOException;

public class Repository {
    private static Quest quest = new Quest();

    public static Quest getQuest() {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("C:\\Users\\PK\\IdeaProjects\\Task\\ru.javarush.chirkov.quest\\src\\main\\resources\\quest.json");

        try {
            quest = objectMapper.readValue(file, Quest.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return quest;
    }


}



