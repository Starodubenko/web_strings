package com.epam.star.servlet;

import com.epam.star.entity.Text;
import com.epam.star.parser.Parser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        Parser parser = new Parser();
        Text parsedText = parser.parseText(req.getParameter("text"));
        String string;

        string = parsedText.getParagraph(0).toString();
        req.setAttribute("paragraph", string);

        string = parsedText.getSentence(0, 0).toString();
        req.setAttribute("sentence", string);

        string = parsedText.getWord(0, 0, 0).toString();
        req.setAttribute("word", string);

        string = parsedText.getChar(0, 0, 0, 0).toString();
        req.setAttribute("charr", string);

        req.getRequestDispatcher("/WEB-INF/result.jsp").forward(req, resp);
    }
}
