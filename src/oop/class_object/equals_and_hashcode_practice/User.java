package oop.class_object.equals_and_hashcode_practice;

import java.util.Objects;
import java.util.function.IntToDoubleFunction;

public class User {
    private String login;
    private Integer password;

    public User(String login, Integer password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public Integer getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj instanceof User user)
            return this.login.equals(user.login) && this.password.equals(user.password);
        return false;
    }

    @Override
    public int hashCode() {
        return this.login.hashCode();
    }
}
