package ru.javarush.chirkov.quest.servlet;

import ru.javarush.chirkov.quest.entity.Quest;
import ru.javarush.chirkov.quest.entity.Question;
import ru.javarush.chirkov.quest.entity.User;
import ru.javarush.chirkov.quest.repository.Repository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

@WebServlet(name = "QuestServlet", value = "/start")
public class QuestServlet extends HttpServlet {
    Quest quest = Repository.getQuest();
    ArrayList<Question> questions = quest.questions;
    int idUser;
    int index = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(quest);
        if (req.getAttribute("id") != null) {
            idUser = (int) req.getAttribute("id");
        }
        if (index == questions.size()) {
            User user1 = Repository.users.getUser(idUser);
            user1.setCountWin();
            index = 0;
            req.setAttribute("id", idUser);

            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/statistic");
            requestDispatcher.forward(req, resp);

        }


        req.setAttribute("questions", questions.get(index).getAnswwerds());
        req.setAttribute("question", questions.get(index).getQuestion());
        req.setAttribute("img", questions.get(index).getNameImg());
        Map<String, String[]> parameterMap = req.getParameterMap();

        if (parameterMap.get("answer") != null) {
            String answer = parameterMap.get("answer")[0];
            if (answer.equals(questions.get(index).getAnswerd())) {
                req.setAttribute("result", true);
                index++;
            } else {
                req.setAttribute("result", false);
                index = 0;
                req.getSession().invalidate();
            }

        }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/quest.jsp");
        requestDispatcher.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String questName = req.getParameter("selectbasic");
        String userName = req.getParameter("UserName");
        doGet(req, resp);
    }

    private User getUser(HttpServletRequest req) {
        Object user = req.getAttribute("user");
        if (!user.getClass().equals(String.class)) {
            throw new RuntimeException();
        }
        return (User) user;
    }


}
