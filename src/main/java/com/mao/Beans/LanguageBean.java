package com.mao.Beans;

import java.util.Date;

public class LanguageBean {
private int languae_id;
private String name	;
private Date last_update;
public int getLanguae_id() {
	return languae_id;
}
public void setLanguae_id(int languae_id) {
	this.languae_id = languae_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getLast_update() {
	return last_update;
}
public void setLast_update(Date last_update) {
	this.last_update = last_update;
}
}
