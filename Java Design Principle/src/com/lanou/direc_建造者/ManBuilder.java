package com.lanou.direc_������;

public class ManBuilder implements PersonBuilder {
	Person person;
	public ManBuilder() {
		person = new Person();
	}
	@Override
	public void buildHead() {
		person.setHead("ͷ��");
		
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		person.setHead("��");
	}

	@Override
	public void buildFoot() {
		// TODO Auto-generated method stub
		person.setHead("�Ų�");
	}

	@Override
	public Person buildPerson() {
		// TODO Auto-generated method stub
		return person;
	}
	
}
