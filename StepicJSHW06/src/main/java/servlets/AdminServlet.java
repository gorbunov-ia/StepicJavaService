package servlets;

import accountServer.AccountServerI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author a.akbashev
 * @author v.chibrikov
 *         <p>
 *         Пример кода для курса на https://stepic.org/
 *         <p>
 *         Описание курса и лицензия: https://github.com/vitaly-chibrikov/stepic_java_webserver
 */
public class AdminServlet extends HttpServlet {
    static final Logger logger = LogManager.getLogger(AdminServlet.class.getName());
    public static final String PAGE_URL = "/admin";
    private final AccountServerI accountServer;

    public AdminServlet(AccountServerI accountServer) {
        this.accountServer = accountServer;
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");

        int limit = accountServer.getUsersLimit();

        logger.info("Limit: {}.", limit);

        response.getWriter().println(accountServer.getUsersLimit());
        response.setStatus(HttpServletResponse.SC_OK);

    }
}
