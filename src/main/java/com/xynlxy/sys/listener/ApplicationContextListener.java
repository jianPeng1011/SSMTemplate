package com.xynlxy.sys.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ApplicationContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext context = servletContextEvent.getServletContext();
        String jianpeng = context.getContextPath();
        context.setAttribute("path",jianpeng);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
