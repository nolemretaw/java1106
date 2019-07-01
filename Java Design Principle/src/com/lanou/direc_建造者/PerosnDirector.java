package com.lanou.direc_НЈдьеп;

public class PerosnDirector {
	public Person constructPerson(PersonBuilder pb){
		pb.buildHead();
		pb.buildBody();
		pb.buildFoot();
		return pb.buildPerson();	
	}
}
