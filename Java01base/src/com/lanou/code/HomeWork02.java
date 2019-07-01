package com.lanou.code;

public class HomeWork02 {

	public static void main(String[] args) {
	int $1=1, $5=5, $10=10, $20=20, allMoney=0,
			items=0,items1=0,items2=0,items3=0, items4=0;
	allMoney =567;
	System.out.println("×Ü¼Æ"+allMoney);
	items1=allMoney / $20;
	allMoney=allMoney%$20;
	items2=allMoney/$10 ;
	allMoney=allMoney %$10;
	items3=allMoney/$5 ;
	allMoney=allMoney %$5;
	items4=allMoney/$1 ;
	items=items1+items2+items3+items4;
	System.out.printf("20$=%d 10$=%d 5$=%d 1$=%d all=%d",items1,items2,items3,items4,items);
	}

}
