package com.mao.Servlets;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mao.Service.AddFilmService;
import com.mao.Service.SelectLanguageIdByNameService;

/**
 * Servlet implementation class AddFilmServlet
 */
public class AddFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFilmServlet() {
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
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String language_name = request.getParameter("language");
		
		int i = new SelectLanguageIdByNameService().selectIdByName(language_name);
		Date nowTime = new Date(System.currentTimeMillis());
		 if(new AddFilmService().addFilm(title,description,i)){
			 request.getRequestDispatcher("add_success.jsp").forward(request, response);
		 }
		 else{
			 request.getRequestDispatcher("add_faild.jsp").forward(request, response);
		 }
	}

}
