package com.model;

public class Dog {
	     private int dogID;
	    private String dogBreed;
	    private int petID;
		public Dog(int dogID, String dogBreed, int petID) {
			super();
			this.dogID = dogID;
			this.dogBreed = dogBreed;
			this.petID = petID;
		}
		public Dog() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Dog [dogID=" + dogID + ", dogBreed=" + dogBreed + ", petID=" + petID + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		public int getDogID() {
			return dogID;
		}
		public void setDogID(int dogID) {
			this.dogID = dogID;
		}
		public String getDogBreed() {
			return dogBreed;
		}
		public void setDogBreed(String dogBreed) {
			this.dogBreed = dogBreed;
		}
		public int getPetID() {
			return petID;
		}
		public void setPetID(int petID) {
			this.petID = petID;
		}
	    
}
