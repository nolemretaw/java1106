package com.lanou.code;

public class LoopControl {
	public static void main(String[] args) {
		/*
		 	通过循环控制的关键字,可以实现在循环过程中改变循环的执行流程,从而达到灵活控制循环的作用
		 	break  continue
		 */
		//数7,遇到第一个是7的倍数时,终止游戏
		int num = 1;
		while (true) {
			if (num % 7 == 0) {
				//终止循环
				break;
				/*
				 	break放在循环内部,可以立马终止循环,哪怕循环条件依旧满足,也可以终止
				 	终止的是本层循环,break写在哪个循环内部终止的就是那个循环
				 */
			}
			System.out.println(num++);
		}
		
		
		//打印1-100之间奇数的和
		/*num = 1;
		int sum = 0;
		while (num < 101) {
			if (num % 2 != 0){
				sum = sum + num; //sum += num;
			}
			num++;
		}
		System.out.println(sum);*/
		
		/*
		 	continue 终止本次循环
		 	在循环语句中 continue之后的代码在当次循环中都不执行!
		 */
		num = 0;
		int sum =0;
		while (num < 100) {
			num++;
			if (num % 2 == 0) {
				continue;
			}
			sum = sum + num;
		}
		System.out.println(sum);
	}
}

		/*
		 	break 小明腿断了
		 	continue小明尿急
		 	这两个关键字在循环中使用时,通常会与if语句连用
		 */
