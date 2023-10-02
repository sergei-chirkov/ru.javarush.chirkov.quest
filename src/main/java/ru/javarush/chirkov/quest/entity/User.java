package ru.javarush.chirkov.quest.entity;

public class User {
    int  id ;
    String name;
    Integer countWin = 0;

    public User(String name) {
        this.name = name;
    }

    public Integer getCountWin() {
        return countWin;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCountWin() {
        this.countWin ++;
    }
    public void setId(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countWin=" + countWin +
                '}';
    }
}
