package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Pet;
import com.utility.DBConnection;

public class PetDaoImpl implements PetDao {

	@Override
	public int addPet(Pet pet) throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql = "INSERT INTO Pet (PetID, Name, Age,Breed,Type ) VALUES (?,?,?,?,?)";
		// prepare the statement
		PreparedStatement pstmt = con.prepareStatement(sql);
		// attach the data
		pstmt.setInt(1, pet.getPetID());
		pstmt.setString(2, pet.getName());
		pstmt.setInt(3, pet.getAge());
		pstmt.setString(4, pet.getBreed());
		pstmt.setString(5, pet.getType());
		// execute the query
		int status = pstmt.executeUpdate(); // 1: if all good., 0 - if op fails
		DBConnection.dbClose();
		return status;
	}

	@Override
	public boolean remove(int petId) throws SQLException {

		Connection con = DBConnection.dbConnect();
		String sql = "delete from pet where petID =?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, petId);
		pstmt.executeUpdate();
		DBConnection.dbClose();
		return false;
	}

	@Override
	public List<Pet> findAll() throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql = "SELECT * FROM Pet";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rst = pstmt.executeQuery();
		List<Pet> list = new ArrayList<>();
		while (rst.next() == true) {
			int id = rst.getInt("PetID");
			String name = rst.getString("Name");
			int age = rst.getInt("Age");
			String breed = rst.getString("Breed");
			String type = rst.getString("Type");
			Pet pet = new Pet(id, name, age, breed, type);
			list.add(pet);
		}
		DBConnection.dbClose();
		return list;

	}

}
