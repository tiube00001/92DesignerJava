package com.designer_two.compoent;



import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        Object token = request.getSession().getAttribute("token");

        if (token == null) {
            response.sendRedirect("/login");
            return false;
        }

        Object menu = request.getSession().getAttribute("menu");
        //将菜单数据写入session
        if (menu == null) {

        }

        return  true;
    }
}
