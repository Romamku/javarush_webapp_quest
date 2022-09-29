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

@WebServlet(name = "ServletQuest", value = "/quest")
public class ServletQuest extends HttpServlet {
    private static final Logger log = LoggerFactory.getLogger(IndexServlet.class);

    public GamePageRepository pageRepository = GamePageRepository.getPageRepository();

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        log.trace("Инициализация ServletQuest.");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("pageRepository", pageRepository);

        int index = getQuestionId(req);
        pageRepository.getStatistics().add(index);
        req.setAttribute("index", index);
        if (pageRepository.getStorageSize() < index) {
            log.trace("index != 0 -> luckyendgame");
            resp.sendRedirect("luckyendgame");
            return;
        }
        if (index == 0){
            log.trace("index = 0 -> endgame");
            resp.sendRedirect("endgame");
            return;
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("jsp/quest.jsp");
        dispatcher.forward(req, resp);
        log.trace("doGet (ServletQuest) -> отработал");
    }

    private int getQuestionId(HttpServletRequest req) {
        String questionId = req.getParameter("questionId");
        boolean isNumeric = questionId.chars().allMatch(Character::isDigit);
        return isNumeric ? Integer.parseInt(questionId) : 0;
    }
}
