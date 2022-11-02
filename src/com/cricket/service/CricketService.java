package com.cricket.service;

import java.util.List;

import com.cricket.modelclass.Cricketer;

public interface CricketService {
	
	public boolean addListOfCricketer(List<Cricketer> list);
	
	public List<Cricketer> getListOfCricketerByType(String typeOfCricketer);
	

}
