package com.mao.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginFilter
 */
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	    HttpServletRequest req = (HttpServletRequest) request; 
	    HttpServletResponse res = (HttpServletResponse) response; 
	    
	    HttpSession session = req.getSession(); 

	    //从session里取的用户名信息 
	    String username = (String) session.getAttribute("user");
	    StringBuffer url = req.getRequestURL();
	    //判断如果没有取到用户信息,就跳转到登陆页面 
	    if(url.indexOf("Login.jsp")>0||url.indexOf("index.jsp")>0||url.indexOf("LoginServlet")>0){
	    	 chain.doFilter(request,response); 
	    	 return;
	    }
	    if (username == null ||"".equals(username)) { 
	      //跳转到登陆页面 
	      req.getRequestDispatcher("Login.jsp").forward(request, response); 
	   
	    } 
	    else { 
	      //已经登陆,继续此次请求 
	      chain.doFilter(request,response); 
	      
	    } 
	} 

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
