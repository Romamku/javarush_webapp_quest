package ru.javarush.quest.servlets;

import ru.javarush.quest.entities.Model;
import ru.javarush.quest.entities.User;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "EntranceServlet", value = "/entrance")
public class EntranceServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("pass");

        HttpSession session = req.getSession();
        if (session.getAttribute("user") != null) {
            resp.sendRedirect("prologue");
            return;
        }

        User user = new User(name, password);
        Model model = Model.getInstance();
        model.add(user);
        session.setAttribute("user", user);
        req.setAttribute("userName", name);
        resp.sendRedirect("prologue");
    }
}
