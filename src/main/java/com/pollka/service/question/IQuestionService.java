package com.pollka.service.question;

import com.pollka.model.Question;
import com.pollka.model.User;
import java.util.List;

public interface IQuestionService {

    Question createQuestion(Question question);
    Question updateQuestion(Question question);
    Question getQuestion(int id);
    Question deleteQuestion(int id);

    List<Question> getAll();
    List<Question> getQuestionsByName(String name);
    List<Question> getQuestionsByType(String type);
    List<Question> getQuestionsByUser(User user);//questions created by user
}
