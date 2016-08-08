package com.mao.Service;

import java.util.List;

import com.mao.Beans.LanguageBean;
import com.mao.DaoImp.LanguageDaoImp;
import com.mao.SQLUtil.SQLUtil;

public class ShowLanguageService {
	public List<LanguageBean> showLanguage(){
		LanguageDaoImp ldi = new LanguageDaoImp();
	
		List<LanguageBean> list =ldi.getLanguage(SQLUtil.get_language);
		return list;
	}
}
