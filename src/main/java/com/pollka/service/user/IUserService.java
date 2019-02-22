package main.java.com.pollka.service.user;

import com.pollka.model.User;

import java.util.List;

public interface IUserService {

    User createUser(User user);
    User updateUser(User user);
    User getUser(String email);
    User deleteUser(String email);

    List<User> getAll();
}
