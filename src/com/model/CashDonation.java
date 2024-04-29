package com.model;

public class CashDonation {
	private int cashDonationID;
    private String donationDate;
    private int donationID;
	public CashDonation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CashDonation(int cashDonationID, String donationDate, int donationID) {
		super();
		this.cashDonationID = cashDonationID;
		this.donationDate = donationDate;
		this.donationID = donationID;
	}
	@Override
	public String toString() {
		return "CashDonation [cashDonationID=" + cashDonationID + ", donationDate=" + donationDate + ", donationID="
				+ donationID + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public int getCashDonationID() {
		return cashDonationID;
	}
	public void setCashDonationID(int cashDonationID) {
		this.cashDonationID = cashDonationID;
	}
	public String getDonationDate() {
		return donationDate;
	}
	public void setDonationDate(String donationDate) {
		this.donationDate = donationDate;
	}
	public int getDonationID() {
		return donationID;
	}
	public void setDonationID(int donationID) {
		this.donationID = donationID;
	}
    
}
