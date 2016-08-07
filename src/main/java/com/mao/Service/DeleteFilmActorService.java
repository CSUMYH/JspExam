package com.mao.Service;

import com.mao.DaoImp.FilmDaoImp;
import com.mao.SQLUtil.SQLUtil;

public class DeleteFilmActorService {
	public boolean deleteFilmActor(int id){
	FilmDaoImp fdi = new FilmDaoImp();
	int i =fdi.updateFilm(SQLUtil.del_fiml_actor,id);
	boolean flag = false;
	if(i!=0){
		flag = true;
	}
	return flag;
	}
}
