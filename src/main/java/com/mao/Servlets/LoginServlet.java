package com.mao.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mao.Service.CustomerLogin;
import com.mao.Service.ShowFilmService;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerLogin ctl = new CustomerLogin();
		String username =  request.getParameter("username").toString();
		HttpSession session = request.getSession();
		if(ctl.Login(username)==true){	
			session.setAttribute("user",username);
			session.setAttribute("film", new ShowFilmService().showFilm());
			request.getRequestDispatcher("film.jsp").forward(request, response);
		}else{
			System.out.println(2);			
			request.getRequestDispatcher("login_faild.jsp").forward(request, response);
		}
	}

}
