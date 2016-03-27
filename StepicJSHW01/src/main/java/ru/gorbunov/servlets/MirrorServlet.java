package ru.gorbunov.servlets;

import ru.gorbunov.templater.PageGenerator;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by VIRUZ on 27.03.2016.
 */
public class MirrorServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException {

        //Map<String, Object> pageVariables = new HashMap<>();

        String key = request.getParameter("key");

        //pageVariables.put("key",key == null ? "" : key);

        //response.getWriter().println(PageGenerator.instance().getPage("page.html",pageVariables));
        response.getWriter().println(key == null ? "" : key);

        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
    }
    /*
    @Override
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws IOException {

        Map<String, Object> pageVariables =  new HashMap<>();

        String key = request.getParameter("key");

        response.setContentType("text/html;charset=utf-8");

        if (key == null || key.isEmpty()) {
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        } else {
            response.setStatus(HttpServletResponse.SC_OK);
        }
        pageVariables.put("key", key == null ? "" : key);

        response.getWriter().println(PageGenerator.instance().getPage("page.html", pageVariables));
    }
    */

}
