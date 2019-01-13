package com.designer_two.compoent;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException {
        Object token = request.getSession().getAttribute("token");
        if (token == null) {
//            request.getRequestDispatcher("/login").forward(request, response);
            System.out.println("this is interceptor");
            response.sendRedirect("/login");
            return false;
        }

        return  true;
    }
}
