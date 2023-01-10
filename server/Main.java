package server;

import javax.xml.ws.Endpoint;
import server.controllers.UserServer;

public class Main {

    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:8000/user-server",
        new UserServer());
    }
}
