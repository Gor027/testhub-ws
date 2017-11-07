package com.mainserver.testhub.ws.dao;

import com.mainserver.testhub.ws.dao.base.BaseDao;
import com.mainserver.testhub.ws.domain.Question;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionDao extends BaseDao{



    public List<Question> getAllQuestions() throws SQLException{

        PreparedStatement ps = connectingDatabase().prepareStatement("SELECT * FROM questions");
        ResultSet rs = ps.executeQuery();

        ArrayList<Question> questions = new ArrayList<Question>();

        while(rs.next()){
            int questionID = rs.getInt("QuestionID");
            String question = rs.getString("Question");
            questions.add(new Question(questionID, question));
        }
        //todo

        return questions;

    }

    public Question getQuestionByID(int id) throws SQLException {

        PreparedStatement ps = connectingDatabase().prepareStatement("SELECT * FROM questions WHERE QuestionID = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        Question questionByID = null;
        while (rs.next()) {

            int questionID = rs.getInt("QuestionID");
            String question = rs.getString("Question");
            questionByID = new Question(questionID, question);
        }


        return questionByID;
    }

    public void addQuestion() throws SQLException {

        Scanner in = new Scanner(System.in);
        System.out.println("Write the new question... ");
        String newQuestion = in.nextLine();

        PreparedStatement ps = connectingDatabase().prepareStatement("INSERT INTO questions (Question)" + "VALUES (?)");
        ps.setString(1, newQuestion);
        ps.executeUpdate();
    }

    public void deleteQuestion(int id) throws SQLException{

        PreparedStatement ps = connectingDatabase().prepareStatement("DELETE FROM questions WHERE QuestionID = ?");
        ps.setInt(1, id);
        ps.executeUpdate();

    }



}
