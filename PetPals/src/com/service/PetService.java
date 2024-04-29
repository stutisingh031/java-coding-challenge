package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.PetDao;
import com.dao.PetDaoImpl;
import com.model.Pet;

public class PetService {
	PetDao petdao = new PetDaoImpl();

	public int insert(Pet pet) throws SQLException {
		return petdao.addPet(pet);
	}

	public boolean deleteByid(int id) throws SQLException {
		return petdao.remove(id);
	
	}

	public List<Pet> findAll() throws SQLException {
		return petdao.findAll();
	}

}
