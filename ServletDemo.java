package org.westos.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletDemo",value ="/demo")
public class ServletDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("heheh");
        System.out.println("haha");
        System.out.println("heheh");
        System.out.println("ihadfshffhdihfhjdhshfdshhdsfdskjklkjfjkjljfd;jlsajlfdsjl");
        System.out.println("神仙，妖怪");
        System.out.println("hbhj");
        System.out.println("神妖怪");
        System.out.println("小乌龟");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
