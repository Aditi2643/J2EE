package com.qn.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qn.model.Student;

public class StudentRegister extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String confirmPassword=request.getParameter("confirmPassword");
		String email=request.getParameter("email");
		String qualification=request.getParameter("qualification");
		String cgpa=request.getParameter("cgpa");
		
		
		if(password.equals(confirmPassword)) {
			Student s=new Student(name,username,password,email,qualification,cgpa);
			int status=s.studentRegister();
			if(status==0) {
			response.sendRedirect("/Student_Registration/studentRegistrationFailure.jsp");
			}else {
				response.sendRedirect("/Student_Registration/studentRegistrationSuccess.jsp");			
		   }
		}else {
			response.sendRedirect("/Student_Registration/studentPasswordMisMatch.jsp");
		}
	}

}
