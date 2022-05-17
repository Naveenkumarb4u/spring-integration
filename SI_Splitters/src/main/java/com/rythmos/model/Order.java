package com.rythmos.model;

public class Order {
	
	public enum DrinkType {
		THUMPSUP,SPRITE,KINGFISHER,BUDWEISER 
	}

	private int orderNum;
	private DrinkType drinkType;
	
	
	
	public Order() {
		super();
	}
	
	@Override
	public String toString() {
		return "Order [orderNum=" + orderNum + ", drinkType=" + drinkType + "]";
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public DrinkType getDrinkType() {
		return drinkType;
	}
	public void setDrinkType(DrinkType drinkType) {
		this.drinkType = drinkType;
	}
	

}
