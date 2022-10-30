package com.github.novotnyr.soap;

import jakarta.jws.WebService;
import jakarta.xml.ws.Endpoint;

import java.time.LocalDateTime;

@WebService
public class TimeService {
    public LocalDateTime getNow() {
        return LocalDateTime.now();
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:18888/ws/now", new TimeService());
    }
}
