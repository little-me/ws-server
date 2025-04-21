package org.example;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * 一个简单的webservice服务端示例
 * 
 * @author SunQiang
 * @date 2025/4/21 20:01
 * @since 1.0
 */
@WebService
public class Server {

    @WebMethod
        public String hello(@WebParam(name = "name") String name) {
        System.out.println("hello " + name);
        return "hello " + name;
    }

}
