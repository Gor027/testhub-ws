package com.mainserver.testhub.ws.domain;

public class Question {

    private int QuestionID;
    private String Question;

    public Question(int questionID, String question) {
        QuestionID = questionID;
        Question = question;
    }

    public int getQuestionID() {
        return QuestionID;
    }

    public void setQuestionID(int questionID) {
        QuestionID = questionID;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }
}
