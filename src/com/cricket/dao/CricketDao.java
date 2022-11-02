package com.cricket.dao;

import java.util.List;

import com.cricket.modelclass.Cricketer;

public interface CricketDao {
	
	public boolean addListOfCricketer(List<Cricketer> list);
	
	public List<Cricketer> getListOfCricketerByType(String typeOfCricketer);
	

}
