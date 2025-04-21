package org.example;


import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        // 发布地址
        Endpoint.publish("http://127.0.0.1:8099/server", new Server());
        System.out.println("发布成功");
    }
}
