package com.epam.star.servlet;

import com.epam.star.action.Action;
import com.epam.star.action.ParseAction;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        Action parser = new ParseAction();
        String result = parser.execute(req);

        req.getRequestDispatcher(result).forward(req, resp);
    }
}
