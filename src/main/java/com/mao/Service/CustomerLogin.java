package com.mao.Service;

import java.util.List;

import com.mao.Beans.CustomerBean;
import com.mao.DaoImp.CustomeDaoImp;
import com.mao.SQLUtil.SQLUtil;

public class CustomerLogin {
	
	public boolean Login(String name){
	CustomeDaoImp cdi =new CustomeDaoImp();
	boolean flag =false;
    List<CustomerBean> list =  cdi.getCustomer(SQLUtil.get_customer);
    for(int i =0 ;i<list.size();i++){
 
    	if(list.get(i).getFirst_name().equals(name)){
    		flag = true;
    	}
    }
	return flag;
	}
}
