package com.epam.star.action;

import com.epam.star.entity.Text;
import com.epam.star.parser.Parser;

import javax.servlet.http.HttpServletRequest;

public class ParseAction implements Action{


    @Override
    public String execute(HttpServletRequest request) {

        Parser parser = new Parser();
        Text parsedText = parser.parseText(request.getParameter("text"));
        String string;

        int numParagraph = Integer.parseInt(request.getParameter("paragraph"))-1;
        int numSentance = Integer.parseInt(request.getParameter("sentence"))-1;
        int numWord = Integer.parseInt(request.getParameter("word"))-1;
        int numSymbol = Integer.parseInt(request.getParameter("symbol"))-1;

        string = parsedText.getParagraph(numParagraph).toString();
        request.setAttribute("paragraph", string);

        string = parsedText.getSentence(numParagraph, numSentance).toString();
        request.setAttribute("sentence", string);

        string = parsedText.getWord(numParagraph, numSentance, numWord).toString();
        request.setAttribute("word", string);

        string = parsedText.getChar(numParagraph, numSentance, numWord, numSymbol).toString();
        request.setAttribute("charr", string);

        return "/WEB-INF/result.jsp";
    }
}
