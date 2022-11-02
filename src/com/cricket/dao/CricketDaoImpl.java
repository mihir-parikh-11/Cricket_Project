package com.cricket.dao;

import java.util.ArrayList;
import java.util.List;

import com.cricket.modelclass.Cricketer;

public class CricketDaoImpl implements CricketDao {
	
	List<Cricketer> list = new ArrayList<Cricketer>();

	@Override
	public boolean addListOfCricketer(List<Cricketer> list) {
		
		boolean addAll = this.list.addAll(list);
		
		return addAll;
	}

	@Override
	public List<Cricketer> getListOfCricketerByType(String typeOfCricketer) {
		List<Cricketer> list = new ArrayList<Cricketer>();
		for (Cricketer cricketer : this.list) {
			
			if(cricketer.getTypeOfCricketer().equalsIgnoreCase(typeOfCricketer)) {
				list.add(cricketer);
			}
		}

		return list;
	}
	
	

}
