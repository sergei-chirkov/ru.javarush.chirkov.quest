package ru.javarush.chirkov.quest.entity.servlet;

import ru.javarush.chirkov.quest.entity.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ru.javarush.chirkov.quest.entity.repository.Repository;

import java.io.IOException;
import java.net.Inet4Address;

@WebServlet(name = "StatisticServlet", value = "/statistic")

public class StatisticServlet extends HttpServlet {
    String userName;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        for(Cookie cookie : cookies){
//            System.out.println("idName: " + cookie.getValue());
           if(cookie.getName().equals("userName")){
               System.out.println("userName: " + cookie.getValue());
               userName = cookie.getValue();
           }
        }
        int idUser = Repository.users.getIdUser(userName);
        User statistic = Repository.getStatistic(idUser);

        String hostAddress = Inet4Address.getLocalHost().getHostAddress();
        req.setAttribute("ipAdress", hostAddress);
        req.setAttribute("userName", statistic.getName());
        req.setAttribute("countWin", statistic.getCountWin());

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/static.jsp");
        requestDispatcher.forward(req,resp);
    }
}
