package ru.javarush.quest.servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LuckyEndServlet", value = "/luckyendgame")
public class LuckyEndServlet extends HttpServlet {

    private static final Logger log = LoggerFactory.getLogger(IndexServlet.class);

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        log.trace("Инициализация LuckyEndServlet.");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("jsp/luckyendgame.jsp");
        dispatcher.forward(req, resp);
        log.trace("doGet (LuckyEndServlet) -> отработал");
    }
}
