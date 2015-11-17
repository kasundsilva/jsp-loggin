package org.wso2.kube.sample.two;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import javax.servlet.http.HttpServlet;

public class ServletTwo extends HttpServlet {

    private static final Log log = LogFactory.getLog(ServletTwo.class);
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException{
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(2000);
                log.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ : Sample Loggin Application TWO");
            } catch (InterruptedException e) {
                log.error("Error occurred by doing post " + e);
            }
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException {
        doPost(request, response);
    }
}
