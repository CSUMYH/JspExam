package com.mao.SQLUtil;

public class SQLUtil {
	public static final String get_customer = "select * from customer ";
	public static final String get_film = "select film.*,language.name as language_name from film , language where film.language_id=language.language_id"; 
}
