package com.cricket.service;

import java.util.List;

import com.cricket.dao.CricketDao;
import com.cricket.dao.CricketDaoImpl;
import com.cricket.modelclass.Cricketer;

public class CricketServiceImpl implements CricketService{
	
	CricketDao cricketDao = new CricketDaoImpl();

	@Override
	public boolean addListOfCricketer(List<Cricketer> list) {

		return cricketDao.addListOfCricketer(list);
	}

	@Override
	public List<Cricketer> getListOfCricketerByType(String typeOfCricketer) {
		
		return cricketDao.getListOfCricketerByType(typeOfCricketer);
	}



	

}
