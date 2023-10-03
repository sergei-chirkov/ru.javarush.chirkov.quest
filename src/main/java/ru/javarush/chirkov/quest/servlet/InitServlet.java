package ru.javarush.chirkov.quest.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ru.javarush.chirkov.quest.repository.Repository;

import java.io.IOException;

@WebServlet(name = "InitServlet", value = "/init")
public class InitServlet extends HttpServlet {

    int idUser ;


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String questName = req.getParameter("selectbasic");
         String userName = req.getParameter("UserName");

         Repository.users.setUser(userName);
         idUser = Repository.users.getIdUser(userName);

         Cookie cookie = new Cookie("userName", userName);
         resp.addCookie(cookie);
         req.setAttribute("id", idUser);
         req.setAttribute("questName", questName);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/start");
        requestDispatcher.forward(req,resp);
    }

}
