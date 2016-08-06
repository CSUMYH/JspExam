package com.mao.Dao;

import java.sql.Connection;
import java.util.List;

import com.mao.Beans.CustomerBean;

public interface CustomerDao {
	public abstract  Connection getConnetion() ;
	
	public abstract  List<CustomerBean> getCustomer(String sql,Object...strn);
	
}