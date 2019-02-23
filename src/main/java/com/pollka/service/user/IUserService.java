package com.pollka.service.user;

import com.pollka.model.Answer;
import com.pollka.model.Question;
import com.pollka.model.User;
import java.util.List;

public interface IUserService {

    User createUser(User user);
    User updateUser(User user);
    User getUser(String email);
    User deleteUser(String email);

    List<User> getAll();
    List<User> getUsersByAnswer(Answer answer); //who gave answer to question
    User getUserByQuestion(Question question); //who created question
}
