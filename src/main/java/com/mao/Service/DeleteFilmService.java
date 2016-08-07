package com.mao.Service;

import com.mao.DaoImp.FilmDaoImp;
import com.mao.SQLUtil.SQLUtil;

public class DeleteFilmService {
	public boolean deleteFilm(int film_id){
		FilmDaoImp fdi = new FilmDaoImp();
		int i=fdi.updateFilm(SQLUtil.del_fiml, film_id);
		boolean flag =false;
		if(i!=0){
			flag=true;
		}
		return flag;	
	}
}
