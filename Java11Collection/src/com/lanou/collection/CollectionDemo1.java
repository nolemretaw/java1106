package com.lanou.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
	public static void main(String[] args) {
		//创建一个Collection集合
		Collection col = new ArrayList();
		//1. 添加元素
		col.add("浪子燕青");
		col.add("九纹龙史进");
		col.add("花和尚鲁智深");
		col.add("母夜叉孙二娘");
		System.out.println(col);
		//2. 添加一组元素
		Collection col1 = new ArrayList();
		col1.add("大刀关胜");
		col1.add("行者武松");
		col1.add("玉麒麟卢俊义");
		col.addAll(col1);
//		System.out.println(col);
//		//3. 获取集合中元素的个数
//		System.out.println(col.size());
//		//4. 判断是否包含某个元素
//		System.out.println(col.contains("行者武松"));
//		//5. 判断是否包含一组元素
//		System.out.println(col.containsAll(col1));
//		//6. 删除集合中的某个元素
//		col.remove("大刀关胜");
//		System.out.println(col);
//		//7. 删除集合中的一组元素
//		col.removeAll(col1);
//		System.out.println(col);
//		//8. 清空集合
////		col.clear();
//		System.out.println(col);
//		//9. 判断集合是否为空
//		System.out.println(col.isEmpty());
//		//集合的遍历
//		//1. foreach
//		for(Object object : col) {
//			if (object instanceof String) {
//				String string = (String)object;
//				System.out.println(string);
//			}
//		}
		//2. 采用迭代器
		Iterator iterator = col.iterator();
		while (iterator.hasNext()) {
			Object object = (Object)iterator.next();
			if (object instanceof String) {
				String string = (String)object;
				System.out.println(string);
			}
		}
	}
}
