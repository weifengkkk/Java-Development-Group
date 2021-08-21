package com.soft;


import com.soft.javabean.Admin;
import com.soft.mapper.AdminMapper;
import com.soft.pojo.AdminEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@Controller
//@Component
@WebServlet("/hello")
public class test extends HttpServlet {
    @Autowired
    private Admin admin;

//    AdminEntity findAdminByNameAndPwd()
//    {
//        return adminMapper.findAdminByNameAndPwd("admin",Util.passMd5("admin"));
//    }

//    @RequestMapping("/hello")
//    public void test()
//    {
//        System.out.println("链接进来了");
//        System.out.println(findAdminByNameAndPwd().toString());
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
                config.getServletContext());
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("链接进来了");
        System.out.println(admin.adminMapper.findAdminByNameAndPwd("admin",Util.passMd5("admin")).toString());
    }
}
