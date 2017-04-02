package main;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by VIRUZ on 02.04.2017.
 */
public class Main {
    public static final int PORT = 5050;

    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(PORT);
        System.out.println("Server started");
        try {
            while (true) {
                // Блокируется до возникновения нового соединения:
                Socket socket = s.accept();
                try {
                    new OneConnection(socket);
                }
                catch (IOException e) {
                    // Если завершится неудачей, закрывается сокет,
                    // в противном случае, нить закроет его:
                    socket.close();
                }
            }
        }
        finally {
            s.close();
        }
    }
}
