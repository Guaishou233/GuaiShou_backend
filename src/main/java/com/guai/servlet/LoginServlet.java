//package com.guai.servlet;
//
//import com.guai.pojo.SmbmsUser;
//import com.guai.service.user.UserService;
//import com.guai.util.Constance;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class LoginServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//       String userCode = req.getParameter("userCode");
//       String userPassword = req.getParameter("userPassword");
//
//       //输入到业务层
//        UserService userService = new UserServiceImp();
//        SmbmsUser user  = userService.login(userCode,userPassword);
//        if (user != null){
//            req.getSession().setAttribute(Constance.USER_SESSION,user);
//            resp.sendRedirect("jsp/frame.jsp");
//        }
//        else {
//            req.setAttribute("error","用户名或密码不正确");
//            req.getRequestDispatcher("login.jsp").forward(req, resp);
//        }
//    }
//}
