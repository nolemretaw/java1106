package com.lanou.common;

public class MutableString {
	public static void main(String[] args) {
	/*string�ǲ��ɱ��ַ�����,ֻҪ���ַ������в���֮��,�õ�����ȫ�µ��ַ���,�������޸ı���
	 * stringBuilder StringBuffer ����������java�еĿɱ��ַ�����
	 * �ɱ��ַ���������֮��δ�ĵõ��µ��ַ���,ֻ���޸ĵ�ԭ���ַ���
	 * 
	 * StringBuilder �̲߳���ȫ,Ч�ʸ�,���ܵ�
	 * StringBuffer�̰߳�ȫ,����Ч�ʵ�,���ܵ�
	 * ͨ��ʹ��StringBuilder�������ɱ��ַ���
	 */
	//����һ���ɱ��ַ�������
	StringBuilder stringBuilder = new StringBuilder("Hello");	
	//ƴ��
	stringBuilder.append(" World");
	System.out.println(stringBuilder);
	//����	
	//��ָ���±�����µ�����,����ԭ����������ƫ��
		stringBuilder.insert(5, "Tom");
		System.out.println(stringBuilder);
		//ɾ��
		//ɾ����ʼ�±굽�����±��ǰһλ
		stringBuilder.delete(5, 13);
		System.out.println(stringBuilder);
		//��ת
		stringBuilder.reverse();
		System.out.println(stringBuilder);
		
		/*to be or not to be
		 *��ת 
		 * 
		 */
		String str = " to be or not to be ";
		System.out.println(str.trim());//ȥ��ǰ��ո�
		String[] strs = str.split(" ");
		String rStr = "";
		for(String s : strs){
		System.out.println(s);
		//�����ɱ��ַ���ת��Ϊ�ɱ��ַ���,�ڽ��з�ת
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);
		rStr += sb + " ";
		}
		System.out.println(rStr.trim());
	}
}
