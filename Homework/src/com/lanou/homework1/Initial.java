package com.lanou.homework1;

import java.io.IOException;
import java.text.ParseException;

/*
 * File
��ҵ1:��һ��Ŀ¼�������ļ���С����������(������Ŀ¼)-----��printFile()
��ҵ2:����һ�����,�����ΪĿ¼,�����·�Ϊ��Ŀ¼-------��createFile()
         ����Ŀ¼���Ե�ǰ�·ݵ�����������Ӧ�ļ�
��ҵ3:����һ��Ŀ¼,ͳ�Ƹ�Ŀ¼��С(Ŀ¼�������ļ���С������)--------��countValue()
��ҵ4:ɾ��ָ��Ŀ¼�������ļ�����Ŀ¼--------->deleteFiles()
 * */
public class Initial {

	public static void main(String[] args) throws ParseException, IOException {
		FileCatalog catalog = new FileCatalog("C:/Users/xalo/Documents/Tencent Files/1913657399/FileRecv");
//		catalog.printFile(); 
		
		//���·��/���
//		FileCatalog catalog = new FileCatalog("C:/Users/xalo/Desktop/2018");
//		catalog.createFile();
		catalog.countValue();
//		catalog.deleteFiles();
	}

}
