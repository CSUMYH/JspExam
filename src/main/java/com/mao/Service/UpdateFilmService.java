package com.mao.Service;

import com.mao.DaoImp.FilmDaoImp;
import com.mao.SQLUtil.SQLUtil;

public class UpdateFilmService {
	public boolean updateFilm(Object...strn){
		FilmDaoImp fdi = new FilmDaoImp();
		int i=fdi.updateFilm(SQLUtil.update_film, strn);
		boolean flag = false;
		if(i!=0){
			flag= true;
		}
		return flag;
	}
}
