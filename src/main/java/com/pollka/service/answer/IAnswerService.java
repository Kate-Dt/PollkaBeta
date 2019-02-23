package com.pollka.service.answer;

import com.pollka.model.Answer;
import com.pollka.model.Question;
import com.pollka.model.User;
import java.util.List;

public interface IAnswerService {

    Answer createAnswer(Answer question);
    Answer updateAnswer(Answer question);
    Answer getAnswer(int id);
    Answer deleteAnswer(int id);

    List<Answer> getAll();
    List<Answer> getAnswersByName(String name);
    List<Answer> getAnswersByQuestion(Question question);//all answers to question
    List<Answer> getAnswersByUser(User user);
}
