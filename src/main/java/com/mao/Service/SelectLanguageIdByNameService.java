package com.mao.Service;

import java.util.List;

import com.mao.Beans.LanguageBean;
import com.mao.DaoImp.LanguageDaoImp;
import com.mao.SQLUtil.SQLUtil;

public class SelectLanguageIdByNameService {
	public int selectIdByName(String name){
		LanguageDaoImp ldi = new LanguageDaoImp();
		int z=0;
		List<LanguageBean> list = ldi.getLanguage(SQLUtil.get_language);
		for(int i = 0; i< list.size() ;i++){
			if(list.get(i).getName().equals(name)){
				 z=list.get(i).getLanguage_id();
			}
		}
		return z;	
	}
}
