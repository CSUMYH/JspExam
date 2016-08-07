package com.mao.Service;

import com.mao.DaoImp.FilmDaoImp;
import com.mao.SQLUtil.SQLUtil;

public class DeleteFilmTextService {
	public boolean deleteFilmText(int film_id){
	FilmDaoImp fdi = new FilmDaoImp();
	int i =fdi.updateFilm(SQLUtil.del_film_text,film_id);
	boolean flag = false;
	if(i!=0){
		flag = true;
	}
	return flag;
	}
}
