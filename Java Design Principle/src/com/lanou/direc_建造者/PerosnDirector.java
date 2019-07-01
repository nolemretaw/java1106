package com.lanou.direc_������;

public class PerosnDirector {
	public Person constructPerson(PersonBuilder pb){
		pb.buildHead();
		pb.buildBody();
		pb.buildFoot();
		return pb.buildPerson();	
	}
}
