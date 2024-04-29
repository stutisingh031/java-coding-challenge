package com.dao;

import java.sql.SQLException;
import java.util.List;


import com.model.Pet;



public interface PetDao {
	int addPet(Pet pet) throws SQLException; 
	boolean remove(int petId)throws SQLException;
	List<Pet> findAll() throws SQLException;
	
}
