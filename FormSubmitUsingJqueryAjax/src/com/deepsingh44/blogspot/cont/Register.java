package com.deepsingh44.blogspot.cont;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deepsingh44.blogspot.dao.StudentDao;
import com.deepsingh44.blogspot.model.Student;
@WebServlet("/register")
public class Register extends HttpServlet {
private StudentDao sd=new StudentDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		String role=req.getParameter("role");
		
		Student std=new Student();
		std.setName(name);
		std.setEmail(email);
		std.setPass(pass);
		std.setRole(role);
		
		int i=sd.insert(std);
		
		if(i>0){
			pw.print("Successfully register");
		}else{
			pw.print("Register failed");
		}
		
	}

}


