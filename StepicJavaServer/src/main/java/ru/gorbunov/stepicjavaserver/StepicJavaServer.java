package ru.gorbunov.stepicjavaserver;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import ru.gorbunov.frontend.Frontend;
import ru.gorbunov.servlets.AllRequestsServlet;

/**
 * Created by VIRUZ on 27.03.2016.
 */
public class StepicJavaServer {
    public static void main (String arg[]) throws Exception {
        //Frontend frontend = new Frontend();
        //Создать сервлет
        AllRequestsServlet allRequestsServlet = new AllRequestsServlet();

        //Создать хендлер
        ServletContextHandler context =
                new ServletContextHandler(ServletContextHandler.SESSIONS);
        //Кладём сервлет в хендлер, указывая старинцы,
        // которые будут обработаны данным сервлетом
        //context.addServlet(new ServletHolder(frontend), "/authform");
        context.addServlet(new ServletHolder(allRequestsServlet), "/*");

        //создаём сервер
        Server server = new Server(8080);
        //Устанавливаем серверу хендлер
        server.setHandler(context);

        //Запускаем сервер
        server.start();
        server.join();

    }
}
