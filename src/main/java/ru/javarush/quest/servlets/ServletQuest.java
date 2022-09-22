package ru.javarush.quest.servlets;

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

    public GamePageRepository pageRepository = GamePageRepository.getPageRepository();

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("pageRepository", pageRepository);

        int index = getQuestionId(req);
        req.setAttribute("index", index);
        if (index == 0){
            resp.sendRedirect("endgame");
            return;
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("jsp/quest.jsp");
        dispatcher.forward(req, resp);
    }

    private int getQuestionId(HttpServletRequest req) {
        String click = req.getParameter("questionId");
        boolean isNumeric = click.chars().allMatch(Character::isDigit);
        System.out.println(click);
        return isNumeric ? Integer.parseInt(click) : 0;
    }
}
