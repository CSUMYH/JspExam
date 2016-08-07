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
	private static Connection cnt ;
	private static ResultSet result;
	private static PreparedStatement pts;
	private Connect(){
		
	}
	
	
	public static Connect getConnect(){	
		return  cn;
	}
	 
	public static Connection getConnection(){
		
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
	
	try {
		pts = (PreparedStatement) Connect.getConnection().prepareStatement(sql);
		for(int i=0;i<strn.length;i++){
		pts.setObject(i+1, strn[i]);
		}	
		result = pts.executeQuery();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return result;
	}
	
	
	public static int excutUpdate(String sql,Object... strn){
		int count =0;
		try {
			pts = Connect.getConnection().prepareStatement(sql);
			for(int i = 0 ; i< strn.length;i++){
				pts.setObject(i+1, strn[i]);
			}
		count = pts.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	
	
	public static void close(){
		try {
			result.close();
			pts.close();
			cnt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
