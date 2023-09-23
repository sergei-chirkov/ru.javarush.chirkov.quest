package servlet;

import entity.Quest;
import entity.Question;
import repository.Repository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "QuestServlet", value = "/start")
public class QuestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Quest quest = Repository.getQuest();
        resp.setContentType("text/html");
        Map<String, String[]> parameterMap = req.getParameterMap();
        PrintWriter writer = resp.getWriter();
        Set<String> strings = parameterMap.keySet();

        for(Question question : quest.questions){
            String question1 = question.getQuestion();
            writer.println(question1);
            writer.println("<button> Answer </button>");
        }

        for (String s: strings){
            writer.println(s);
        }


    }
}
