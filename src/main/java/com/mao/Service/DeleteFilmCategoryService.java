package com.mao.Service;

import com.mao.DaoImp.FilmDaoImp;
import com.mao.SQLUtil.SQLUtil;

public class DeleteFilmCategoryService {
	public boolean deleteFilmCategory(int id){
	FilmDaoImp fdi = new FilmDaoImp();
	int i =fdi.updateFilm(SQLUtil.del_fiml_category,id);
	boolean flag = false;
	if(i!=0){
		flag = true;
	}
	return flag;
	}
}
