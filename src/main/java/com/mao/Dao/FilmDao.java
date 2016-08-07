package com.mao.Dao;

import java.util.List;

import com.mao.Beans.FilmBean;

public interface FilmDao {

	public abstract List<FilmBean> getFilmBeans(String sql,Object...strn);
	public abstract int updateFilm(String sql,Object...strn);
}
