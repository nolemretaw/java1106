package com.lanou.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// �ӿ���̨����һ���ı������ļ�·��,���ļ���ÿһ�����ݶ����е�������ڿ���̨�Լ�����һ���ļ���
		
		File pFile =null;
		File dFile = null;
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		ArrayList<String> arrList = new ArrayList<>();
		
		do{
			System.out.println("����Դ��Ŀ�� �ı������ļ�·�����ļ������Կո����");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			String pAdr = str.substring(0, str.indexOf(" "));//Դ�ļ�
			String dAdr = str.substring(str.indexOf(" ")+1);//Ŀ���ļ�
			pFile = new File(pAdr);
			dFile = new File(dAdr);
		}while(!(pFile.isFile()&&pFile.exists()&&
				dFile.isFile()&&dFile.exists())); 
		
		try {
			fileReader = new FileReader(pFile);
			fileWriter = new FileWriter(dFile);
			bufferedReader = new BufferedReader(fileReader);
//			bufferedWriter = new BufferedWriter(fileWriter);
			int ch = 0;
			while ((ch=bufferedReader.read())!=-1) {
//				arrList.add((String)ch);
				System.out.print((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
