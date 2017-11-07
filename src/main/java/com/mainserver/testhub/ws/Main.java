package com.mainserver.testhub.ws;

import com.mainserver.testhub.ws.dao.QuestionDao;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        QuestionDao questionDao = new QuestionDao();

        try {
            System.out.println(questionDao.getQuestionByID(3).getQuestion());
            System.out.println();
            questionDao.deleteQuestion(3);

            for(int i = 0; i < questionDao.getAllQuestions().size(); i++){
                System.out.println(questionDao.getAllQuestions().get(i).getQuestion());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
