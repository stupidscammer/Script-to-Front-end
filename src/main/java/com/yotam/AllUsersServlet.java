package com.yotam;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/**
 * Created by yotamm on 28/04/16.
 */
@WebServlet("/users")
public class AllUsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UsersDB usersDB = UsersDB.getInstance();
        Collection<User> users = usersDB.getAllUsers(); //fetch all the users

        //Forward the request to users.jsp to render the list
        req.setAttribute("model", users);
        req.getRequestDispatcher("users.jsp").forward(req, resp);
    }
}
