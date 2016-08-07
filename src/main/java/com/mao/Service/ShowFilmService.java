package com.mao.Service;

import java.util.List;

import com.mao.Beans.FilmBean;
import com.mao.DaoImp.FilmDaoImp;
import com.mao.SQLUtil.SQLUtil;

public class ShowFilmService {
	public List<FilmBean> showFilm(){
		FilmDaoImp fdl = new FilmDaoImp();
		List<FilmBean> list =fdl.getFilmBeans(SQLUtil.get_film);
//		for(int i = 0;i<list.size();i++){
//			System.out.println(i+":"+list.get(i).getTitle());
//		}
		return list;
	}
}
