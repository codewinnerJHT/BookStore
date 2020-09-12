package com.athaitao.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.athaitao.bean.User;
import com.athaitao.service.UserService;
import com.athaitao.service.impl.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("username:"+username+"password:"+password);
		
	   UserService userService = new UserServiceImpl();
	   User user = userService.getUser(new User(null,username,password,null));
	   if (user != null) {
		   request.getRequestDispatcher("/pages/user/login_success.html").forward(request, response);
	}else {
		response.sendRedirect(request.getContextPath()+"/pages/user/login.html");
	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
