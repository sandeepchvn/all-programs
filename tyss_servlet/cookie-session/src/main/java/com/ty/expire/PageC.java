package com.ty.expire;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/page-c")
public class PageC extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie=new Cookie("s_name", "sandeep");
		cookie.setMaxAge(50000);//50000 seconds
		resp.addCookie(cookie);
		
		Cookie cookie2=new Cookie("phone","3456");
		cookie2.setMaxAge(1*24*60*60);//1 day
		resp.addCookie(cookie2);
		
		System.out.println("cookie created and added on response");
	}
}
