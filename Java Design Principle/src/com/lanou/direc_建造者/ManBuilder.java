package com.lanou.direc_建造者;

public class ManBuilder implements PersonBuilder {
	Person person;
	public ManBuilder() {
		person = new Person();
	}
	@Override
	public void buildHead() {
		person.setHead("头部");

	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		person.setHead("身部");
	}

	@Override
	public void buildFoot() {
		// TODO Auto-generated method stub
		person.setHead("脚部");
	}

	@Override
	public Person buildPerson() {
		// TODO Auto-generated method stub
		return person;
	}

}
