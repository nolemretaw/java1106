package com.lanpu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		/*Map集合是存储键值对的集合,每一个键值对 包含一个key,一个value,
		 * 在map中key值不允许重复,而一个key值只能映射一个value,获取value值只能通过key值
		 */
		Map<String, String> map = new HashMap<String,String>();//多态
		//1. 添加键值对的方法:
		/*添加时,因为map集合中key值不允许重复,所以HashMap先去通过hashCode()与
		 * equals()方法对添加的key进行处理,看是否存在,若存在,则修改value
		 * 若不存在则添加键值对
		 */
		/*
		 * HashMap是基于哈希表实现的, HashMap是无序的
		 * 允许null键,null值存在的,但是null键只能有一个
		 * 线程不同步
		 */
		map.put("黑旋风", "逵逵");
		map.put("孝义黑三郎", "宋江");
		map.put("小李广", "花荣");
		map.put("豹子头", "林冲");
		
		map.put("神行太保","戴宗");
		map.put("黑旋风", "李逵");
		System.out.println(map);

		//2. 添加一组键值对
		Map<String, String> map1 = new HashMap<String,String>();
		map1.put("菜园子", "张青");
		map1.put("双鞭","呼延灼");
		map.putAll(map1);
		System.out.println(map);
		
		//3. 通过key值获取对应的value值
		System.out.println(map.get("孝义黑三郎"));
		
		//4. 通过key值删除键值对
		map.remove("双鞭");
		System.out.println(map);
		
		//5. 判断map集合中是否包含某一个key
		System.out.println(map.containsKey("孝义黑三郎"));
		System.out.println(map.containsKey("双鞭"));
		
		//6. 判断map集合中是否包含某个value
		System.out.println(map.containsValue("林冲"));
		
		//7. 清空map集合
//		map.clear();
//		System.out.println(map);
	
		//8. 判断map集合是否为空
		System.out.println(map.isEmpty());
		
		//9.得到map集合中的键值对个数
		System.out.println(map.size());
		
		//10. 遍历map集合
		/*遍历map集合实在为了拿到value值,但是value值的获取需要先得到key,所以遍历
		 * map的第一步先拿到所有的key,再遍历所有的key,得到对应的value
		 */
		//拿到所有的key
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			System.out.println(map.get(keySet));
		}
		//2.
		/*得到所有键值对所在的集合,遍历此集合,拿到一个键值对对象Entry,此对象提供了getKey()
		 * 获取到key值,getValue()获取到value值
		 */
		Set<Entry<String,String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println("key = " + entry.getKey());
			System.out.println("value = " + entry.getValue());
		}
	}

}
