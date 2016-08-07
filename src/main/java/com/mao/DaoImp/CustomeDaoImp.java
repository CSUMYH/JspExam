package com.mao.DaoImp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mao.Beans.CustomerBean;
import com.mao.DBUtil.Connect;
import com.mao.Dao.CustomerDao;

public class CustomeDaoImp implements CustomerDao{
	
	public Connection getConnetion() {
		// TODO Auto-generated method stub
		return Connect.getConnection();
	}
	public List <CustomerBean>  getCustomer(String sql,Object...strn) {

		
		ResultSet result = Connect.excutQuey(sql,strn);
		List <CustomerBean> list = new ArrayList<CustomerBean>();
		try {
			while(result.next()){
				CustomerBean cb = new CustomerBean();
				cb.setActive(result.getInt("active")); 
				cb.setAddress_id(result.getInt("address_id"));
				cb.setCreate_date(result.getString("create_date"));
				cb.setCustomer_id(result.getInt("customer_id"));
				cb.setEmail(result.getString("email"));
				cb.setFirst_name(result.getString("first_name"));
				cb.setLast_name(result.getString("last_name"));
				cb.setLast_update(result.getString("last_update"));
				cb.setStore_id(result.getInt("store_id"));
				list.add(cb);
			}
			Connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
}
