package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataProviderUsers {
    private  static List<User> usersList = new ArrayList<>();
    static {
        usersList.add(new User());

    }
    public static  User getValidUser(){
        return new User("Elena","Ivanova","ivanova@dfdf.com","12345678999","Other");
    }
    public static User getRandomUser(){
        return usersList.get(new Random().nextInt(usersList.size()-1));
    }
}
