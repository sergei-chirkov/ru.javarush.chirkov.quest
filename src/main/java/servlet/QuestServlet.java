package servlet;

import entity.Quest;
import entity.Question;
import repository.Repository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

@WebServlet(name = "QuestServlet", value = "/start")
public class QuestServlet extends HttpServlet {
    int index = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Quest quest = Repository.getQuest();
        ArrayList<Question> questions = quest.questions;

        if(index == questions.size()){
            req.setAttribute("end", true);
            index =0;
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/quest.jsp");
            requestDispatcher.forward(req,resp);
        }
        HttpSession session = req.getSession(true);
        req.setAttribute("questions", questions.get(index).getAnswwerds());
        req.setAttribute("question", questions.get(index).getQuestion());

        Map<String, String[]> parameterMap = req.getParameterMap();

        if(parameterMap.get("answer")!=null){
            String answer = parameterMap.get("answer")[0];
            if(answer.equals(questions.get(index).getAnswerd())){
                req.setAttribute("result", true);
                index++;
            }
            else{
                req.setAttribute("result", false);
                index=0;
                req.getSession().invalidate();
            }

        }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/quest.jsp");
        requestDispatcher.forward(req,resp);

    }




}
