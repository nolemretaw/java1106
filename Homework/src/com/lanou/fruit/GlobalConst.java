package com.lanou.fruit;

public class GlobalConst {
	private static BaseConfig config = new Config();
	
	public static final double APPLE_PRICE = config.getDoubleValue("apple_price");
	public static final double ORANGE_PRICE = config.getDoubleValue("orange_price");
	public static final double BANANA_PRICE = config.getDoubleValue("banana_price");
	
	public static final String FRUIT_TYPE_APPLE = config.getStringValue("fruit_type_apple");
	public static final String FRUIT_TYPE_ORANGE = config.getStringValue("fruit_type_orange");
	public static final String FRUIT_TYPE_BANANA = config.getStringValue("fruit_type_banana");
	
}
