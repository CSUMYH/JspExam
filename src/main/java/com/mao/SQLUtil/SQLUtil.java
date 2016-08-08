package com.mao.SQLUtil;

public class SQLUtil {
	public static final String get_customer = "select * from customer ";
	public static final String get_film = "select film.*,language.name as language_name from film , language where film.language_id=language.language_id"; 
	public static final String add_fiml ="insert into film (title,description,language_id,rental_duration,rental_rate , replacement_cost ,last_update ) value (?,?,?,1,1,1,SYSDATE())";
	public static final String get_language="select * from language";
	public static final String del_fiml ="delete  from film where film_id = ? ";
	public static final String del_fiml_actor="delete  from film_actor where film_id = ?";
	public static final String del_fiml_category="delete  from film_category where film_id = ?";
	public static final String del_film_text="delete  from film_text where film_id = ?";
	
	public static final String get_inventory_id	= "select  inventory_id from inventory where film_id =?";
	public static final String del_rental_by_inventoryid = "delete from rental where inventory_id = ?";
	public static final String del_inventory_by_filmid= "delete from inventory where film_id = ?";
	public static final String update_film ="update film set title = ? , description =? , language_id = ? where film_id =? ";
}
