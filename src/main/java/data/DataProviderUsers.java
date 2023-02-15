package data;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataProviderUsers {
    private  static List<User> usersList = new ArrayList<>();
    static {
        usersList.add(new User());
        usersList.add(new User("Elena","Ivanova1","ivanova1@dfdf.com","503252365","Other"));

    }

    public static List<User> getUsersList(){
        return  usersList;
    }
    public static  User getValidUser(){
        return new User("Elena","Ivanova2","ivanova2@dfdf.com","932563147","Other");
    }
    public static User getRandomUser(){
        return usersList.get(new Random().nextInt(usersList.size()-1));
    }

//    @DataProvider
//    public Object[][] getUsersList() {
//        return  new Object[][] {
//                {"Cedric", "name"},
//                {"Anne", "Family"}
//        };
//    }
//    @DataProvider
//    public Object[][] getUSERS{
//        return
//    }
}
