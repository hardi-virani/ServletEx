package com.star;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        System.out.println("In Service");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h2><b><I>Hello, giving a response to the client back.</I></b></h2>");


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