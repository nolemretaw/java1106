package com.house.bean;

public class House {
	private int houseId;
	private Infor infor;
	private Location location;
	public int getHouseId() {
		return houseId;
	}
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	public Infor getInfor() {
		return infor;
	}
	public void setInfor(Infor infor) {
		this.infor = infor;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public House(int houseId, Infor infor, Location location) {
		super();
		this.houseId = houseId;
		this.infor = infor;
		this.location = location;
	}
	public House() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "House [houseId=" + houseId + ", infor=" + infor + ", location=" + location + "]";
	}
	
}
