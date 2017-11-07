package com.mainserver.testhub.ws.domain;

public class Answer {

    private int AnswerID;
    private int QuestionID;
    private String Answer;
    private boolean IsRight;

    public Answer(int answerID, int questionID, String question, boolean isRight) {
        AnswerID = answerID;
        QuestionID = questionID;
        Answer = question;
        IsRight = isRight;
    }

    public int getAnswerID() {
        return AnswerID;
    }

    public void setAnswerID(int answerID) {
        AnswerID = answerID;
    }

    public int getQuestionID() {
        return QuestionID;
    }

    public void setQuestionID(int questionID) {
        QuestionID = questionID;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public boolean isRight() {
        return IsRight;
    }

    public void setRight(boolean right) {
        IsRight = right;
    }
}
