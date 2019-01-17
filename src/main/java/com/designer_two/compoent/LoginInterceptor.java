package com.designer_two.compoent;

import com.designer_two.entity.AdminMenuEntity;
import com.designer_two.repository.AdminMenuRepository;

import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Optional;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException {
        Object token = request.getSession().getAttribute("token");

        if (token == null) {
            response.sendRedirect("/login");
            return false;
        }

        Object menu = request.getSession().getAttribute("menu");
        //将菜单数据写入session
        if (menu == null) {
            AdminMenuRepository menuRepository = SpringUtils.getApplicationContext().getBean(AdminMenuRepository.class);
            Iterable<AdminMenuEntity> all = menuRepository.findAll();
            request.getSession().setAttribute("menu", all);
        }

        return  true;
    }
}
