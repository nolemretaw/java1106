package com.lanou.generic;

import java.util.List;
import java.util.ArrayList;

public class GenericDemo {

	public static void main(String[] args) {
		/*实际开发时,集合内部类型一致,为了限制存储对象的类型,可以在创建集合时指定泛型
		 * 泛型一般是以字母表示E T
		 */
		List<String> list = new ArrayList<String>();
		//当指定泛型之后,添加的数据必须与泛型一致
		/*指定泛型之后,除了可以添加泛型对象之外,子类也可以添加
		 */
		list.add("大黄");
//		List<Student> list2 = new ArrayList<Student>();
		
	}

}
