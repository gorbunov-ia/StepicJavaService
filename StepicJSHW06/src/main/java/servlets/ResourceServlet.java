package servlets;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import resourceServer.ResourceServerI;
import resources.TestResource;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by VIRUZ on 01.04.2017.
 */
public class ResourceServlet extends HttpServlet {
    static final Logger logger = LogManager.getLogger(ResourceServlet.class.getName());
    public static final String PAGE_URL = "/resources";
    private final ResourceServerI resourceServer;

    public ResourceServlet(ResourceServerI resourceServer) {
        this.resourceServer = resourceServer;
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");

        TestResource resource = resourceServer.getResource();

        logger.info("Resource: {}.", resource);

        response.getWriter().println(resource);
        response.setStatus(HttpServletResponse.SC_OK);
    }

    protected void doPost(HttpServletRequest request,
                        HttpServletResponse response) throws ServletException, IOException {
        logger.info("POST");
        logger.info(request.getParameter("path"));
        resourceServer.setResource(request.getParameter("path"));
        /*
        String protocol = req.getProtocol();
        String msg = lStrings.getString("http.method_post_not_supported");
        if (protocol.endsWith("1.1")) {
            resp.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, msg);
        } else {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, msg);
        }
        */
    }
}
