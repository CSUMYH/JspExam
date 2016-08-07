package com.mao.Dao;

import java.util.List;

public interface RentalDao {
	public abstract List<Integer> getInventoryId(String sql,Object...str);
}
