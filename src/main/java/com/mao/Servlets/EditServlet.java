package com.mao.Servlets;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mao.Beans.FilmBean;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * Servlet implementation class EditServlet
 */
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
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
		String language = request.getParameter("language");
		Configuration cf = new Configuration();
		cf.setDirectoryForTemplateLoading(new File("templates"));
		
		Map root =new HashMap();
		List list = new ArrayList();
		FilmBean fb  = new FilmBean();
		fb.setTitle(title);
		fb.setDescription(description);
		fb.setLanguage_name(language);
		list.add(fb);
		root.put("film", list);
		Template t1 = cf.getTemplate("a.ftl");
		
		Writer out =  new OutputStreamWriter( System.out);
		try {
			t1.process(root, out);
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.flush();
		out.close();
		request.getRequestDispatcher("edit_success.jsp").forward(request, response);
	}

}
