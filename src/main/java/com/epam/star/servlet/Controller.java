package com.epam.star.servlet;

import com.epam.star.entity.Text;
import com.epam.star.parser.Parser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        Parser parser = new Parser();
        Text parsedText = parser.parseText(request.getParameter("text"));
        String string = "";

        string = parsedText.getParagraph(0).toString();
        request.setAttribute("paragraph", string);

        string = parsedText.getSentence(0,0).toString();
        request.setAttribute("sentence", string);

        string = parsedText.getWord(0,0,0).toString();
        request.setAttribute("word", string);

        string = parsedText.getChar(0,0,0,0).toString();
        request.setAttribute("char", string);

        request.getRequestDispatcher("/WEB-INF/result.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
