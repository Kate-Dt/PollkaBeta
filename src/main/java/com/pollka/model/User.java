package com.pollka.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class User {

    @NotNull
    @NotEmpty
    @Email
    private String email;
    @NotNull
    @NotEmpty
    @Pattern(regexp = "^[a-zA-Z0-9_-]{3,15}$")
    private String login;
    @NotNull
    @NotEmpty
    private String password;

    public User(@NotNull @NotEmpty @Email String email,
                @NotNull @NotEmpty String login,
                @NotNull @NotEmpty String password) {
        this.email = email;
        this.login = login;
        this.password = password;
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

    public void setPassword(String password){ this.password = password; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getEmail().equals(user.getEmail()) &&
                getLogin().equals(user.getLogin()) &&
                password.equals(user.password);
    }

    @Override
    public int hashCode() {
        return getEmail().hashCode();
    }
}
