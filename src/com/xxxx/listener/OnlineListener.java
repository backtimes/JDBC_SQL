package com.xxxx.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


/**
 * 在线人数统计
 */

@WebListener
public class OnlineListener implements HttpSessionListener {

    private Integer onlineNumber=0;

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        onlineNumber++;
        httpSessionEvent.getSession().getServletContext().setAttribute("onlineNumber",onlineNumber);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        onlineNumber--;
        httpSessionEvent.getSession().getServletContext().setAttribute("onlineNumber",onlineNumber);
    }

}
