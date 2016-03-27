package ru.gorbunov.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by VIRUZ on 27.03.2016.
 */
public class MirrorServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) /*throws IOException*/ {
        /*
        Map<String, Object> pageVariables = createPageVariablesMap(request);
        pageVariables.put("message","");

        response.getWriter().println(PageGenerator.instance().getPage("page.html",pageVariables));

        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        */
    }

    @Override
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) /*throws IOException*/ {
        /*
        Map<String, Object> pageVariables = createPageVariablesMap(request);

        String message = request.getParameter("message");

        response.setContentType("text/html;charset=utf-8");

        if (message == null || message.isEmpty()) {
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        } else {
            response.setStatus(HttpServletResponse.SC_OK);
        }
        pageVariables.put("message", message == null ? "" : message);

        response.getWriter().println(PageGenerator.instance().getPage("page.html", pageVariables));
        */
    }

}
