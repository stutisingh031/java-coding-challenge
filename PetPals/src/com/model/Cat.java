package com.model;

public class Cat {
	private int catID;
    private String catColor;
    private int petID;
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(int catID, String catColor, int petID) {
		super();
		this.catID = catID;
		this.catColor = catColor;
		this.petID = petID;
	}
	public int getCatID() {
		return catID;
	}
	public void setCatID(int catID) {
		this.catID = catID;
	}
	public String getCatColor() {
		return catColor;
	}
	public void setCatColor(String catColor) {
		this.catColor = catColor;
	}
	public int getPetID() {
		return petID;
	}
	public void setPetID(int petID) {
		this.petID = petID;
	}
	@Override
	public String toString() {
		return "Cat [catID=" + catID + ", catColor=" + catColor + ", petID=" + petID + ", getCatID()=" + getCatID()
				+ ", getCatColor()=" + getCatColor() + ", getPetID()=" + getPetID() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
    
}
