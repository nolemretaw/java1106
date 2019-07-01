package com.house.bean;

public class Infor {
	private int iid;
	private String kind;
	private double housingArea;
	private double rentalArea;
	private String structure;
	private String charac;
	private String state;
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public double getHousingArea() {
		return housingArea;
	}
	public void setHousingArea(double housingArea) {
		this.housingArea = housingArea;
	}
	public double getRentalArea() {
		return rentalArea;
	}
	public void setRentalArea(double rentalArea) {
		this.rentalArea = rentalArea;
	}
	public String getStructure() {
		return structure;
	}
	public void setStructure(String structure) {
		this.structure = structure;
	}
	public String getCharac() {
		return charac;
	}
	public void setCharac(String charac) {
		this.charac = charac;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Infor(int iid, String kind, double housingArea, double rentalArea, String structure, String charac,
			String state) {
		super();
		this.iid = iid;
		this.kind = kind;
		this.housingArea = housingArea;
		this.rentalArea = rentalArea;
		this.structure = structure;
		this.charac = charac;
		this.state = state;
	}
	public Infor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Infor [iid=" + iid + ", kind=" + kind + ", housingArea=" + housingArea + ", rentalArea=" + rentalArea
				+ ", structure=" + structure + ", charac=" + charac + ", state=" + state + "]";
	}
		
}
