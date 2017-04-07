package com;

/**
 * Created by wangxin on 2017/4/7.
 */
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;

public class RestServer{
    public static void main(String[] args) {

        Server server=new Server(8086);
        ServletHolder servlet = new ServletHolder(ServletContainer.class);
        servlet.setInitParameter("jersey.config.server.provider.packages", "com"); //Rest所在的包
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        //start server
        context.setContextPath("/");
        context.addServlet(servlet, "/*");
        server.setHandler(context);
        try{
            server.start();
            System.out.println("start...in 8086");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
