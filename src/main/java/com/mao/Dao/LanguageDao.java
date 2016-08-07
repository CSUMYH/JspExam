package com.mao.Dao;

import java.util.List;

import com.mao.Beans.LanguageBean;

public interface LanguageDao {
	public abstract List<LanguageBean> getLanguage(String sql,Object...strn);
	public int updateLanguage(String sql,Object...strn);
}
