package com.mao.Service;

import java.util.List;

import com.mao.DaoImp.FilmDaoImp;
import com.mao.DaoImp.RentalDaoImp;
import com.mao.SQLUtil.SQLUtil;

public class DeleteRentalService {
	public boolean deleteRental(int film_id){
	RentalDaoImp rdi = new RentalDaoImp();
	List <Integer> list = rdi.getInventoryId(SQLUtil.get_inventory_id, film_id);
	FilmDaoImp fdi = new FilmDaoImp();
	int i=0;
	for(int z = 0 ;z<list.size();z++){
	 i+=fdi.updateFilm(SQLUtil.del_rental_by_inventoryid,list.get(z));
	}
	boolean flag = false;
	if(i!=0){
		flag = true;
	}
	return flag;
	}
}
