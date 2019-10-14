package com.lanou.direc_建造者;

public interface PersonBuilder {
	public void buildHead();
	public void buildBody();
	public void buildFoot();
	Person buildPerson();
}
