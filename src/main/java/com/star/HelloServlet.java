package com.star;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



import java.io.IOException;

public class HelloServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        System.out.println("In Service");

        resp.getWriter().println("Hello, giving a response to the client back.");


    }



}

//package com.star;
//
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//
//public class HelloServlet extends HttpServlet {
//
//    @Override
//    protected void service(
//            HttpServletRequest req,
//            HttpServletResponse resp)
//            throws IOException {
//
//        System.out.println("In Service");
//
//        resp.setContentType("text/html");
//
//        resp.getWriter().println(
//                "<h1>Hello from Embedded Tomcat Servlet!</h1>"
//        );
//    }
//}