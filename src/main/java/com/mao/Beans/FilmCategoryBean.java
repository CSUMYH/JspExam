package com.mao.Beans;

import java.util.Date;

public class FilmCategoryBean {
private int film_id;
private int category_id;
private Date last_update;
public int getFilm_id() {
	return film_id;
}
public void setFilm_id(int film_id) {
	this.film_id = film_id;
}
public int getCategory_id() {
	return category_id;
}
public void setCategory_id(int category_id) {
	this.category_id = category_id;
}
public Date getLast_update() {
	return last_update;
}
public void setLast_update(Date last_update) {
	this.last_update = last_update;
}
}
