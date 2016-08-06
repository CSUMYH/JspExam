package com.mao.Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mao.Beans.FilmBean;
import com.mao.DaoImp.FilmDaoImp;
import com.mao.SQLUtil.SQLUtil;

/**
 * Servlet implementation class ShowFilmServlet
 */
public class ShowFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowFilmServlet() {
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
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		FilmDaoImp fdi = new FilmDaoImp();
		List<FilmBean> list =fdi.getFilmBeans(SQLUtil.get_film);
		session.setAttribute("film", list);
		request.getRequestDispatcher("film.jsp").forward(request, response);
	}

}
