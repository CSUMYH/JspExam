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
import javax.servlet.http.HttpSession;

import com.mao.Beans.FilmBean;
import com.mao.Service.ShowLanguageService;

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
		String film_id = request.getParameter("film_id");
		
		System.out.println(film_id);
		int id = Integer.valueOf(film_id);
		System.out.println(id);
		HttpSession session = request.getSession();
		session.setAttribute("edit_id",id );
		Configuration cf = new Configuration();
		cf.setDirectoryForTemplateLoading(new File("templates"));
		
		Map root =new HashMap();
		List list = new ArrayList();
		FilmBean fb  = new FilmBean();
		fb.setTitle(title);
		fb.setDescription(description);
		fb.setLanguage_name(language);
		System.out.println(title);
		System.out.println(description);
		System.out.println(language);
		ShowLanguageService sls = new ShowLanguageService();
		List language_list = sls.showLanguage();
		list.add(fb);
		root.put("film", list);
		root.put("lan", language_list);
		Template t1 = cf.getTemplate("a.ftl");
		response.setContentType("text/html;charset="+t1.getEncoding());
		Writer out = response.getWriter();
		try {
			t1.process(root, out);
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.flush();
		out.close();
	}

}
