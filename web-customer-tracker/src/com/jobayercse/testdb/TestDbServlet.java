package com.jobayercse.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = "hbstudent";
		String pass = "springstudent";
		
		String jdcUrl = "jdbc:mysql://localhost:3307/web_customer_tracker?useSSL=false&serverTimezone=UTC";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		
		try {
			PrintWriter out = response.getWriter();
			
			out.println("Connecting to database: \n");
			
			Class.forName(driver);
			Connection myconn = DriverManager.getConnection(jdcUrl, user, pass);
			
			out.println("Successfully connected");
		}
		catch(Exception exc){
			exc.printStackTrace();
			throw new ServletException();
		}
	}

}
