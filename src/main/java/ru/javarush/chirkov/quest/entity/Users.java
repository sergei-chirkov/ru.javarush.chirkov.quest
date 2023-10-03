package ru.javarush.chirkov.quest.entity;

import ru.javarush.chirkov.quest.entity.User;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private final List<User> userList = new ArrayList<>();

    public User getUser(int id){
        User resultUser = new User("empty");
      for(User user : userList){
          if( user.getId() == id)
              resultUser = user;
      }
      return resultUser;
    }

    public boolean checkUser(User user){
        if(userList.contains(user)){
            return true;
        }
        else return false;
    }
    public void setUser(String userName){
        boolean addUser = true;
        for(User user : userList){
            if(user.getName().equals(userName)){
                addUser = false;
            }
        }
        if(addUser){
            User user = new User(userName);
            user.setId(userList.size());
            userList.add(user);
        }
    }
    public int getIdUser(String nameUser){
        int result = 0;
        for (User user : userList){
            if(user.getName().equals(nameUser)){
                result = user.getId();
            }
        }
        return result;
    }


    public List<User> getUserList() {
        return userList;
    }
}
