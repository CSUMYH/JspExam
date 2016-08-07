package com.mao.DaoImp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mao.DBUtil.Connect;
import com.mao.Dao.RentalDao;

public class RentalDaoImp implements RentalDao {

	public List<Integer> getInventoryId(String sql,Object...str) {
		
		ResultSet rs = Connect.excutQuey(sql, str);
		List<Integer> list = new ArrayList<Integer>();
		try {
			while (rs.next()) {
				list.add(rs.getInt("inventory_id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connect.close();
		return list;
	}

}
