package data;

import io.qameta.allure.Attachment;
import lesson0402.Massengers;

public class User {
    String name, lastName,email,telephone,gender;

    public User(String name, String lastName, String email, String telephone, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.gender = gender;
    }

    @Override
    @Attachment
    public String toString(){
        return name+" "+email+" "+telephone;
    }

    public User() {
        this.name = "Nicole";
        this.lastName = "User2";
        this.email = "user2@email.com";
        this.telephone = "951452302";
        this.gender = "Female";
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getGender() {
        return gender;
    }

}
