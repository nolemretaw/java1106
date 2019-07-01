package com.lanou.common;

public class MutableString {
	public static void main(String[] args) {
	/*string是不可变字符串类,只要对字符串进行操作之后,得到的是全新的字符串,并不是修改本身
	 * stringBuilder StringBuffer 这两个类是java中的可变字符串类
	 * 可变字符串操作完之后并未的得到新的字符串,只是修改的原有字符串
	 * 
	 * StringBuilder 线程不安全,效率高,性能低
	 * StringBuffer线程安全,但是效率低,性能低
	 * 通常使用StringBuilder来创建可变字符串
	 */
	//创建一个可变字符串对象
	StringBuilder stringBuilder = new StringBuilder("Hello");	
	//拼接
	stringBuilder.append(" World");
	System.out.println(stringBuilder);
	//插入	
	//会指定下标插入新的内容,并将原有内容往后偏移
		stringBuilder.insert(5, "Tom");
		System.out.println(stringBuilder);
		//删除
		//删除开始下标到结束下标的前一位
		stringBuilder.delete(5, 13);
		System.out.println(stringBuilder);
		//反转
		stringBuilder.reverse();
		System.out.println(stringBuilder);
		
		/*to be or not to be
		 *反转 
		 * 
		 */
		String str = " to be or not to be ";
		System.out.println(str.trim());//去除前后空格
		String[] strs = str.split(" ");
		String rStr = "";
		for(String s : strs){
		System.out.println(s);
		//将不可变字符串转换为可变字符串,在进行反转
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);
		rStr += sb + " ";
		}
		System.out.println(rStr.trim());
	}
}
