package com.mao.Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mao.DaoImp.CustomeDaoImp;
import com.mao.SQLUtil.SQLUtil;

/**
 * Servlet implementation class CustomerServlete
 */
public class CustomerServlete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlete() {
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
		// TODO Auto-generated method stub
	  CustomeDaoImp cdi = new CustomeDaoImp();
	  HttpSession session = request.getSession();
	  session.setAttribute("customer",cdi.getCustomer(SQLUtil.get_customer));
	  session.setAttribute("language",cdi.getCustomer(SQLUtil.get_customer));
	  request.getRequestDispatcher("hello.jsp").forward(request, response);
	}

}
