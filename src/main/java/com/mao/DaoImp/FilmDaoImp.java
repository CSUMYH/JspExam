package com.mao.DaoImp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mao.Beans.FilmBean;
import com.mao.DBUtil.Connect;
import com.mao.Dao.FilmDao;

public class FilmDaoImp implements FilmDao {

	public List<FilmBean> getFilmBeans(String sql, Object... strn) {
		ResultSet rs =Connect.excutQuey(sql, strn);
		List<FilmBean> list = new ArrayList<FilmBean>();
		try {
			while(rs.next()){
			FilmBean fb = new FilmBean();
			fb.setDescription(rs.getString("description"));
			fb.setFilm_id(rs.getInt("film_id"));
			fb.setLanguage_id(rs.getInt("language_id"));
			fb.setLast_update(rs.getDate("last_update"));
			fb.setOriginal_language_id(rs.getInt("original_language_id"));
			fb.setLength(rs.getInt("length"));
			fb.setRating(rs.getString("rating"));
			fb.setRelease_year(rs.getInt("release_year"));
			fb.setRental_duration(rs.getInt("rental_duration"));
			fb.setRental_rate(rs.getDouble("rental_rate"));
			fb.setReplacement_cost(rs.getDouble("replacement_cost"));
			fb.setSpecial_features(rs.getString("special_features"));
			fb.setTitle(rs.getString("title"));
			fb.setLanguage_name(rs.getString("language_name"));
			list.add(fb);
			}
			
			Connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list	;
	}
	
	public int updateFilm(String sql,Object...strn){
		int i =Connect.excutUpdate(sql, strn);
		Connect.close();
		return i;
	}

}
