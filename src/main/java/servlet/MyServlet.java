package servlet;

import models.Adress;
import models.Role;
import models.User;
import service.ServiceDaoImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/use")
public class MyServlet extends HttpServlet {
    ServiceDaoImpl service = new ServiceDaoImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        Integer id = service.showId(login, password);
        if (service.userId(id).getRole().getTitle().equals("Admin")) {
            req.setAttribute("user", service.findAll());
            RequestDispatcher dispatcher = req.getRequestDispatcher("/ListUserForm.jsp");
            dispatcher.forward(req, resp);
        } else {
            req.setAttribute("user", service.userId(id));
            RequestDispatcher dispatcher = req.getRequestDispatcher("/listOne.jsp");
            dispatcher.forward(req, resp);
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        Adress adress = new Adress();
        user.setLogin(req.getParameter("login"));
        user.setPassword(req.getParameter("password"));
        user.setAge(Integer.parseInt(req.getParameter("age")));
        user.setName(req.getParameter("name"));
        user.setDescription(req.getParameter("description"));
        adress.setTown(req.getParameter("town"));
        adress.setStreet(req.getParameter("street"));
        adress.setHouse(req.getParameter("house"));
        user.setAdress(adress);
        Role role = new Role();
        role.setTitle(req.getParameter("role"));
        role.addUsers(user);
        user.setRole(role);
        service.saveUser(user);
        resp.sendRedirect("/enterAccount.jsp");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        User user = service.userId(id);
        user.setId(Integer.parseInt(req.getParameter("id")));
        user.setLogin(req.getParameter("login"));
        user.setPassword(req.getParameter("password"));
        user.setAge(Integer.parseInt(req.getParameter("age")));
        user.setName(req.getParameter("name"));
        user.setDescription(req.getParameter("description"));
        user.getAdress().setTown(req.getParameter("town"));
        user.getAdress().setStreet(req.getParameter("street"));
        user.getAdress().setHouse(req.getParameter("house"));
        user.getRole().setTitle(req.getParameter("role"));
        service.update(user);
        resp.sendRedirect("/enterAccount.jsp");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        service.delete(id);
        resp.sendRedirect("/enterAccount.jsp");
    }
}
