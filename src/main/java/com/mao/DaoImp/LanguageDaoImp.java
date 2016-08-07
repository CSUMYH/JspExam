package com.mao.DaoImp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mao.Beans.LanguageBean;
import com.mao.DBUtil.Connect;
import com.mao.Dao.LanguageDao;

public class LanguageDaoImp implements LanguageDao {

	public List<LanguageBean> getLanguage(String sql, Object...strn) {
		ResultSet rs = (ResultSet) Connect.excutQuey(sql,strn);
		List<LanguageBean> list = new ArrayList<LanguageBean>();
		try {
			while(rs.next()){
				LanguageBean lb = new LanguageBean();
				lb.setLanguage_id(rs.getInt("language_id"));
				lb.setLast_update(rs.getDate("last_update"));
				lb.setName(rs.getString("name"));
				list.add(lb);
			}			
		Connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public int updateLanguage(String sql,Object...strn){
		int i =Connect.excutUpdate(sql, strn);
		Connect.close();
		return i;
	}
}
