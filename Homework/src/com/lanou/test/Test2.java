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
		// 从控制台输入一个文本类型文件路径,将文件中每一行内容都进行倒序输出在控制台以及另外一个文件中
		
		File pFile =null;
		File dFile = null;
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		ArrayList<String> arrList = new ArrayList<>();
		
		do{
			System.out.println("输入源、目标 文本类型文件路径及文件名，以空格隔开");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			String pAdr = str.substring(0, str.indexOf(" "));//源文件
			String dAdr = str.substring(str.indexOf(" ")+1);//目标文件
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
