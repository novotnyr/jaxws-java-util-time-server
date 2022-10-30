package com.github.novotnyr.soap;

import jakarta.jws.WebService;
import jakarta.xml.ws.Endpoint;

@WebService
public class TimeService {
    public CurrentLocalDateTime getNow() { //<1>
        return new CurrentLocalDateTime();
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:18888/ws/now", new TimeService()); //<2>
    }
}
