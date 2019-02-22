package com.pollka.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class User {

    @NotNull
    @Email
    private String email;

    private String login;

    private String password;

    public User(String email, String login) {
        this.email = email;
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
