package ru.javarush.quest.servlets;

import ru.javarush.quest.entities.Model;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserListServlet", value = "/userList")
public class UserListServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Model model = Model.getInstance();
        List<String> names = model.list();
        req.setAttribute("userNames", names);

        RequestDispatcher dispatcher = req.getRequestDispatcher("jsp/userList.jsp");
        dispatcher.forward(req, resp);
    }
}
