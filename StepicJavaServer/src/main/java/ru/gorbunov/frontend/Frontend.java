package ru.gorbunov.frontend;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by VIRUZ on 27.03.2016.
 */
public class Frontend extends HttpServlet {

    private String login = "";

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
                /*throws ServletException, IOException */{
        System.out.println("doGet");
    }

    public void doPost(HttpServletRequest request,
                      HttpServletResponse response)
                /*throws ServletException, IOException */{
        System.out.println("doPost");
    }

}
