package ru.javarush.chirkov.quest.repository;


import com.fasterxml.jackson.databind.ObjectMapper;
import ru.javarush.chirkov.quest.entity.Quest;
import ru.javarush.chirkov.quest.entity.User;
import ru.javarush.chirkov.quest.entity.Users;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Repository {
    private static Quest quest = new Quest();
    public static Users users = new Users();

    public static Quest getQuest(String nameQuest) {
        ObjectMapper objectMapper = new ObjectMapper();
        URL location = Repository.class.getProtectionDomain().getCodeSource().getLocation();
        File filePath = new File(location.getPath());
        Path path = Path.of(nameQuest + ".json");
        Path result = filePath.toPath().resolve(path);
        File file = new File(result.toString());
        try {
            quest = objectMapper.readValue(file, Quest.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return quest;
    }
    public static User getStatistic(int id){
        return users.getUser(id);
    }
    public static List<String> getQustsName() {
        List<String>questsName = null;
        URL location = Repository.class.getProtectionDomain().getCodeSource().getLocation();
        File filePath = new File(location.getPath());
        File[] arrFiles = filePath.listFiles();
        List<File> lst = Arrays.asList(arrFiles);
        for(File file : lst){
            if(file.getName().endsWith(".json")){
                questsName.add(file.getName().replaceFirst("[.][^.]+$",""));
            }
        }
        return questsName;
    }


}



