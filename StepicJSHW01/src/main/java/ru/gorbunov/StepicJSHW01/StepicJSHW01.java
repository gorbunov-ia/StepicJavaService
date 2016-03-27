package ru.gorbunov.stepicjshw01;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import ru.gorbunov.servlets.MirrorServlet;

/**
 * Created by VIRUZ on 27.03.2016.
 */
public class StepicJSHW01 {
    public static void main (String arg[]) throws Exception {
        //Создать сервлет
        MirrorServlet mirrorServlet = new MirrorServlet();

        //Создать хендлер
        ServletContextHandler context =
                new ServletContextHandler(ServletContextHandler.SESSIONS);
        //Кладём сервлет в хендлер, указывая старинцы,
        // которые будут обработаны данным сервлетом
        context.addServlet(new ServletHolder(mirrorServlet), "/mirror");

        //создаём сервер
        Server server = new Server(8080);
        //Устанавливаем серверу хендлер
        server.setHandler(context);

        //Запускаем сервер
        server.start();
        System.out.println("Server started");
        server.join();

    }
}
