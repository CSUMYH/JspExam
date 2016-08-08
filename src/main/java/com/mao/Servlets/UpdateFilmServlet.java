package com.mao.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mao.Service.SelectLanguageIdByNameService;
import com.mao.Service.UpdateFilmService;

/**
 * Servlet implementation class UpdateFilmServlet
 */
public class UpdateFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateFilmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UpdateFilmService ufs = new UpdateFilmService();
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String language = request.getParameter("language");
		int film_id=  (Integer) request.getSession().getAttribute("edit_id");
		boolean flag = ufs.updateFilm(title,description,new SelectLanguageIdByNameService().selectIdByName(language),film_id);
		if(flag){
			request.getRequestDispatcher("update_success.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("update_faild.jsp").forward(request, response);
		}
	}
}
