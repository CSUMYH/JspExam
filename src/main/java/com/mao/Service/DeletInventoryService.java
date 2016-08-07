package com.mao.Service;

import java.util.List;

import com.mao.DaoImp.FilmDaoImp;
import com.mao.DaoImp.RentalDaoImp;
import com.mao.SQLUtil.SQLUtil;

public class DeletInventoryService {
	public boolean deleteInventory(int film_id){
	FilmDaoImp fdi = new FilmDaoImp();
	int i=fdi.updateFilm(SQLUtil.del_inventory_by_filmid,film_id);
	boolean flag = false;
	if(i!=0){
		flag = true;
	}
	return flag;
	}
}
