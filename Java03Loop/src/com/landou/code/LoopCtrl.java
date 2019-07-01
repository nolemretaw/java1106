package com.landou.code;

public class LoopCtrl {

	public static void main(String[] args) {
		/*
		 * 通过循环控制的关键字可以实现在循环的过程中,改变循环的执行流程,从而达到灵活控制循环的作用
		 * break  continue
		 */
		//"逢7过"
		int num = 1;
		while (true) {
			if (num % 7 == 0) {
				break;
				/*
				 * break放在循环内部,可以立马终止!此层!循环
				 */
			}
			System.out.print((num++) +" ");
		}
			
			//打印1~100之间奇数的和
		num=0;
		int sum=0;	
		while (num<100) {
			num++;
			if (num%2==0) {
				continue;
				/*
				 * continue终止!本次!循环,在循环语句中continue之后的代码在本次循环中都不执行
				 */
			}
			sum+=num;
			/*
			 * break  continue 这两个关键字通常会与if连用
			 */
		}
		System.out.println(sum);
	}

}
