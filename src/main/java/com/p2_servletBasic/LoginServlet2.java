package com.p2_servletBasic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login2")
public class LoginServlet2 extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public void init() throws ServletException {
        System.out.println("init 메서드 호출");
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        
        String id = request.getParameter("user_id");
        String pw = request.getParameter("user_pw");
        
        String data = "<html>";
        data += "<body>";
        data += "아이디 : " + id;
        data += "<br>";
        data += "비밀번호 : " + pw;
        data += "</body>";
        data += "</html>";
        out.print(data);
        // out.print("good");
    }
    
    public void destroy() {
        System.out.println("destroy 메서드 호출");
    }
    
}