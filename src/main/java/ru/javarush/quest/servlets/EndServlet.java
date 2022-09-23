package ru.javarush.quest.servlets;

import ru.javarush.quest.repository.GamePageRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EndServlet", value = "/endgame")
public class EndServlet extends HttpServlet {
    public GamePageRepository pageRepository = GamePageRepository.getPageRepository();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("pageRepository", pageRepository);
        RequestDispatcher dispatcher = req.getRequestDispatcher("jsp/endgame.jsp");
        dispatcher.forward(req, resp);
    }

}
