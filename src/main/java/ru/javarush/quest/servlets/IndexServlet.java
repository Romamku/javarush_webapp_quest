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

@WebServlet(name = "IndexServlet", value = "")
public class IndexServlet extends HttpServlet {
private static final Logger log = LoggerFactory.getLogger(IndexServlet.class);

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        log.trace("Инициализация IndexServlet.");

    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("jsp/index.jsp");
        dispatcher.forward(req, resp);
        log.trace("doGet (IndexServlet) -> отработал");
    }
}
