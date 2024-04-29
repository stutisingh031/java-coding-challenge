package com.model;

public class Donation {
	private int donationID;
    private String donorName;
    private double amount;
    private String  donationType;
	public Donation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Donation(int donationID, String donorName, double amount, String donationType) {
		super();
		this.donationID = donationID;
		this.donorName = donorName;
		this.amount = amount;
		this.donationType = donationType;
	}
	public int getDonationID() {
		return donationID;
	}
	public void setDonationID(int donationID) {
		this.donationID = donationID;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDonationType() {
		return donationType;
	}
	public void setDonationType(String donationType) {
		this.donationType = donationType;
	}
	@Override
	public String toString() {
		return "Donation [donationID=" + donationID + ", donorName=" + donorName + ", amount=" + amount
				+ ", donationType=" + donationType + "]";
	}
    
}
