package com.mao.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.jdbc.PreparedStatement;


public  class Connect {
	private static String Driver="com.mysql.jdbc.Driver";
	private static String username="root";
	private static String password="root";
	private static String url="jdbc:mysql://localhost:3306/sakila";
	
	private static Connect cn = new Connect();
	
	private Connect(){
		
	}
	
	
	public static Connect getConnect(){	
		return  cn;
	}
	 
	public static Connection getConnection(){
		Connection cnt = null;
		try {
			Class.forName(Driver);
			cnt = DriverManager.getConnection(url, username, password);
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}
	
	public static ResultSet excutQuey(String sql,Object ... strn){ 
		ResultSet result=null;
	try {
		PreparedStatement pts= (PreparedStatement) Connect.getConnection().prepareStatement(sql);
		for(int i=1;i<strn.length;i++){
		pts.setObject(i, strn[i]);
		}	
		result = pts.executeQuery();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return result;
	}
	
	public static void excutUpdate(String sql,Object... strn){
		
	}
}
