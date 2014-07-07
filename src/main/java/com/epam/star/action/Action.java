package com.epam.star.action;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Администратор on 03.07.2014.
 */
public interface Action {
    String execute(HttpServletRequest request);
}
