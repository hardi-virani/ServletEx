package com.star;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import jakarta.servlet.*;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println( "Hello World!" );
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        tomcat.getConnector();


        Context context = tomcat.addContext("",null);
        Tomcat.addServlet(context, "HelloServlet", new HelloServlet());
        context.addServletMappingDecoded("/hello", "HelloServlet");

        tomcat.start();
        tomcat.getServer().await();

    }

}


//package com.star;
//
//import org.apache.catalina.Context;
//import org.apache.catalina.LifecycleException;
//import org.apache.catalina.startup.Tomcat;
//
//public class App {
//
//    public static void main(String[] args) throws LifecycleException {
//
//        System.out.println("Starting Embedded Tomcat...");
//
//        Tomcat tomcat = new Tomcat();
//
//        // Port on which Tomcat will listen
//        tomcat.setPort(8080);
//
//
//        tomcat.getConnector();
//
//        // Context path
//        Context context =
//                tomcat.addContext("", System.getProperty("java.io.tmpdir"));
//
//        // Register servlet
//        Tomcat.addServlet(
//                context,
//                "HelloServlet",
//                new HelloServlet()
//        );
//
//        // URL Mapping
//        context.addServletMappingDecoded(
//                "/hello",
//                "HelloServlet"
//        );
//
//        tomcat.start();
//
//        System.out.println("Tomcat started successfully!");
//        System.out.println("Open:");
//        System.out.println("http://localhost:8080/hello");
//
//        tomcat.getServer().await();
//    }
//}