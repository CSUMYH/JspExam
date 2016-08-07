package com.mao.Service;

import com.mao.DaoImp.FilmDaoImp;
import com.mao.SQLUtil.SQLUtil;

public class AddFilmService {
	public boolean addFilm(Object... strn){
		boolean flag = false;
		FilmDaoImp fdi = new FilmDaoImp();
		int  i=fdi.updateFilm(SQLUtil.add_fiml,strn);
		if(i!=0){
			flag=true;
		}
		return flag;			
	}
}
