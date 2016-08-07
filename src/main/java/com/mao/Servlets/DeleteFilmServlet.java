package com.mao.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mao.Service.DeletInventoryService;
import com.mao.Service.DeleteFilmActorService;
import com.mao.Service.DeleteFilmCategoryService;
import com.mao.Service.DeleteFilmService;
import com.mao.Service.DeleteFilmTextService;
import com.mao.Service.DeleteRentalService;

/**
 * Servlet implementation class DeleteFilmServlet
 */
public class DeleteFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFilmServlet() {
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
			String film_id = request.getParameter("film_id");
			int id = Integer.valueOf(film_id);
			if(new DeleteRentalService().deleteRental(id)&&new DeletInventoryService().deleteInventory(id)&&new DeleteFilmActorService().deleteFilmActor(id)&&new DeleteFilmCategoryService().deleteFilmCategory(id)&&new DeleteFilmTextService().deleteFilmText(id)&&new DeleteFilmService().deleteFilm(id)){
				request.getRequestDispatcher("del_success.jsp").forward(request, response);
			}else{
				request.getRequestDispatcher("del_faild.jsp").forward(request, response);
			}
	}

}
