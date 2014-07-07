package com.epam.star.action;

import com.epam.star.entity.Char;
import com.epam.star.entity.Text;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

public class ParseAction implements Action{


    @Override
    public String execute(HttpServletRequest request) {

//        String soursText = request.getParameter("text");
//
//        String[] text = Char.parseToChar(soursText);
//        request.setAttribute("text", Arrays.toString(text));

        return "/WEB-INF/result.jsp";
    }
}
