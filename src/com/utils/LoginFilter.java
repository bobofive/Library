package com.utils;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter extends HttpServlet implements Filter {
	public void destroy() {
	}

	public void doFilter(ServletRequest sRequest, ServletResponse sResponse,
			FilterChain filterChain) throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) sRequest;
		HttpServletResponse response = (HttpServletResponse) sResponse;
		HttpSession session = request.getSession();
		String url = request.getServletPath();
		String contextPath = request.getContextPath();
		if (url.equals(""))
			url += "/";
		//若访问后台，过滤到login
		if ((url.startsWith("/") && !url.startsWith("/index.jsp"))) {
																	
			String usr = (String) session.getAttribute("usr");
			// 转入管理员登陆页面
			if (usr == null) {
				response.sendRedirect(contextPath + "/index.jsp");
				return;
			}
		}
		filterChain.doFilter(sRequest, sResponse);
	}

	public void init(FilterConfig arg0) throws ServletException {

	}
}