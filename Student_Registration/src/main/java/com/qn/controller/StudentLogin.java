package com.qn.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qn.model.Student;


public class StudentLogin extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		Student s=new Student();
		s.setUsername(username);
		s.setPassword(password);
		int status=s.studentLogin();
		if(status==1) {
			response.sendRedirect("/Student_Registration/studentLoginSuccess.jsp");
		}else if(status == -1) {
			response.sendRedirect("/Student_Registration/invalidStudentUsername.jsp");
		}else {
			response.sendRedirect("/Student_Registration/invalidStudentPassword.jsp");
		}
	}
}
