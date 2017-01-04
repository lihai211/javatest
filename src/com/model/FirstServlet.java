package com.model;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.fabric.xmlrpc.base.Data;

/**
 * Servlet implementation class FirstServlet
 */
//@WebServlet(asyncSupported = true, urlPatterns = { "/FirstServlet" })
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
	  public  void service(ServletRequest req, ServletResponse rsp)
			    throws ServletException, IOException{
		  //设置编码方式
		//  req.setCharacterEncoding("utf8");
	//  rsp.setContentType("text/html;charSet=utf8");
		  rsp.setContentType("json;charSet=utf8");
		  //获取name的请求参数值
		  String name=req.getParameter("name");
		  //获取color的请求参数值
		  String gender=req.getParameter("gender");
		  String [] color=req.getParameterValues("color");
		  String national=req.getParameter("country");
		  //获取页面输出流
		  PrintStream out =new PrintStream(rsp.getOutputStream());
		  out.println("飞虎群英"+new Date());
		
		  System.out.println("我的servlet");
	  }
	
	
	
}
