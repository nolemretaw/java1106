package com.house.bean;

public class Location {
	private int lid;
	private String address;
	private int beam;
	private int storey;
	private int room;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getBeam() {
		return beam;
	}
	public void setBeam(int beam) {
		this.beam = beam;
	}
	public int getStorey() {
		return storey;
	}
	public void setStorey(int storey) {
		this.storey = storey;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public Location(int lid, String address, int beam, int storey, int room) {
		super();
		this.lid = lid;
		this.address = address;
		this.beam = beam;
		this.storey = storey;
		this.room = room;
	}
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Location [lid=" + lid + ", address=" + address + ", beam=" + beam + ", storey=" + storey + ", room="
				+ room + "]";
	}
	
}
