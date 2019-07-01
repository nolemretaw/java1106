package com.lanou.factory;

//����ָ����Ϣ���ɾ���ʵ��
public class ShapeFactory {
	//ʹ�� getShape ������ȡ��״���͵Ķ���
	   public static Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }        
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	      }
	      return null;
	   }
}
