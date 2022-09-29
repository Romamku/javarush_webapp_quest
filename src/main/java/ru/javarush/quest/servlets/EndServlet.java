package ru.javarush.quest.servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.javarush.quest.repository.GamePageRepository;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EndServlet", value = "/endgame")
public class EndServlet extends HttpServlet {
    private static final Logger log = LoggerFactory.getLogger(IndexServlet.class);

    private final GamePageRepository pageRepository = GamePageRepository.getPageRepository();

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        log.trace("Инициализация EndServlet.");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("pageRepository", pageRepository);
        RequestDispatcher dispatcher = req.getRequestDispatcher("jsp/endgame.jsp");
        dispatcher.forward(req, resp);
        log.trace("doGet (EndServlet) -> отработал");
    }
}
