package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.model.Pet;
import com.service.PetService;

public class PetController {
	public static void main(String[] args) {
		PetService petService = new PetService();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("----------pet -------------");
			System.out.println("Press 1. Insert PET ");
			System.out.println("Press 2. Delete PET ");
			System.out.println("Press 3. Display all pet");
			System.out.println("Press 0. to Exit");
			int input = sc.nextInt();
			if (input == 0) {
				System.out.println("Exiting Pet Module..");
				break;
			}
			switch (input) {
			case 1:

				Random random = new Random();
				int randomNumber = random.nextInt();
				int id = randomNumber < 0 ? randomNumber * -1 : randomNumber;
				System.out.println("Enter Name");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Enter age");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter breed");
				String breed = sc.nextLine();
				System.out.println("Enter type");
				String type = sc.nextLine();

				Pet pet = new Pet(id, name, age, breed, type);
				try {
					int status = petService.insert(pet);
					if (status == 1)
						System.out.println("pet  record added to DB..");
					else
						System.out.println("Insert op failed");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}

				break;
			case 2:
				System.out.println("Enter Pet ID");
				try {
					petService.deleteByid(sc.nextInt());
					System.out.println("pet record deleted..");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				} 
			
				break;
			case 3:
				try {
					List<Pet> list = petService.findAll();
					for (Pet p : list) {
						System.out.println(p);
					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;

			}
		}
		sc.close();
	}
}
