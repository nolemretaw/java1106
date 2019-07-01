package com.lanou.fruit;

public class WrongFruitCheckedException extends RuntimeException{
	public WrongFruitCheckedException(String message){
		super(message);
	}
}
