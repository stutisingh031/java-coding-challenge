package com.model;

public class ItemDonation {
	private int itemDonationID;
    private String itemType;
    private int donationID;
	public ItemDonation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemDonation(int itemDonationID, String itemType, int donationID) {
		super();
		this.itemDonationID = itemDonationID;
		this.itemType = itemType;
		this.donationID = donationID;
	}
	@Override
	public String toString() {
		return "ItemDonation [itemDonationID=" + itemDonationID + ", itemType=" + itemType + ", donationID="
				+ donationID + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public int getItemDonationID() {
		return itemDonationID;
	}
	public void setItemDonationID(int itemDonationID) {
		this.itemDonationID = itemDonationID;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public int getDonationID() {
		return donationID;
	}
	public void setDonationID(int donationID) {
		this.donationID = donationID;
	}
    

}
