package main.java.com.pollka.service.question;

import main.java.com.pollka.model.Question;

import java.util.List;

public interface IQuestionService {

    Question createQuestion(Question question);
    Question updateQuestion(Question question);
    Question getQuestion(int id);
    Question deleteQuestion(int id);

    List<Question> getAll();
    List<Question> getQuestionsByName(String name);
    List<Question> getQuestionsByType(String type);
}
