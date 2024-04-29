package com.model;

public class Pet {
	private int petID;
    private String name;
    private int age;
    private String breed;
    private String  type;
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pet(int petID, String name, int age, String breed, String type) {
		super();
		this.petID = petID;
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Pet [petID=" + petID + ", name=" + name + ", age=" + age + ", breed=" + breed + ", type=" + type + "]";
	}
	public int getPetID() {
		return petID;
	}
	public void setPetID(int petID) {
		this.petID = petID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
