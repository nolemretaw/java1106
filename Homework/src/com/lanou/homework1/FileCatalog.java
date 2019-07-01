package com.lanou.homework1;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
/*
 * File
��ҵ1:��һ��Ŀ¼�������ļ���С����������(������Ŀ¼)----->printFile()
��ҵ2:����һ�����,�����ΪĿ¼,�����·�Ϊ��Ŀ¼------->createFile()
         ����Ŀ¼���Ե�ǰ�·ݵ�����������Ӧ�ļ�
��ҵ3:����һ��Ŀ¼,ͳ�Ƹ�Ŀ¼��С(Ŀ¼�������ļ���С������)-------->countValue()
��ҵ4:ɾ��ָ��Ŀ¼�������ļ�����Ŀ¼--------->deleteFiles()
 * */
public class FileCatalog {
	private static String addStr;//��ַ���ļ���,��̬������
	private static ArrayList<File> fileArr = new ArrayList<File>();//���ڴ���ļ�
	public FileCatalog() {}
	public FileCatalog(String addString) {
		addStr = addString;
	}
	
	public static void printFile() {
		
		File file = new File(addStr);
		printGo(file);
		Collections.sort(fileArr,new SizeComparator());//����
		System.out.println("\t�ļ���\t�ߴ�\t");
		for (int i = 0;i < fileArr.size();i++ ) {
			if (fileArr.get(i).getName()!=null) {
				System.out.println("\t"+fileArr.get(i).getName()+"\t"+fileArr.get(i).length()/1024.0 + " KB\t" );	
			}		
		} 
	}
	
	private static void printGo(File file) {//��С��������ļ�
		if (file != null ) {//�Ƿ����
			if (file.isDirectory()) {//�Ƿ�Ŀ¼
				File f[] = file.listFiles();//�ɵõ�һ���ļ�����ȫ�����ļ�����
				for (File file2 : f) {
				printGo(file2);	//�ݹ�
				}//foreach
				//System.out.println("��Ŀ¼");
			}//��Ŀ¼���ļ�
		else {
			fileArr.add(file);
			}//��Ŀ¼���ļ�	
		}	
	}	
	
	//�������մ���Ŀ¼���ļ�
	public static void createFile() throws ParseException, IOException {
		String root = addStr.substring(0, addStr.lastIndexOf("/")+1);//�ػ��Ŀ¼
		File rootFiles = new File(root);
		
		addStr = addStr.substring(addStr.lastIndexOf("/") + 1 );//���
		File yFiles = new File(rootFiles, addStr);
		boolean dir = yFiles.mkdirs();
		if (dir) {
			System.out.println("�����ɹ�");
		}else {
		System.out.println("ʧ��");	
		}
//		new File(files, child);
		int[] month = new int[12];//��12������
		for (int i = 0; i < 12; i++) {
			StringBuffer strb = new StringBuffer(addStr);
			strb.append("-" + String.valueOf(i+1));
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
			Date date = sdf.parse(strb.toString());
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			month[i]= calendar.getActualMaximum(Calendar.DATE);
		}
		
		StringBuffer strbBuffer = new StringBuffer(addStr);
		for (int i = 0; i < month.length; i++) {
			strbBuffer = new StringBuffer(String.valueOf(i+1));//������Ϊ�����ļ�����
		
			File mFiles = new File(yFiles,strbBuffer.append("/").toString());
			mFiles.mkdirs();//�¼�Ŀ¼
			for (int j = 0; j < month[i]; j++) {
				strbBuffer = new StringBuffer(String.valueOf(j+1));//������Ϊ�ļ���
				
				File dFile = new File(mFiles,strbBuffer.append("��").toString());
				dFile.createNewFile();
			}
		}	
	}
	
	//����Ŀ¼��С
	public static void countValue () {
		File file = new File(addStr);
		printGo(file);
		double value = 0.0;//����/1024byte;
		int i = 0;
		for (; i < fileArr.size(); i++) {
			value += fileArr.get(i).length();
		}
		System.out.println( "�����ļ�" + (i+1) + "��" + " ������Ϊ"+value / 1024 + "KB");
	}
	
	//ɾ��ȫ���ļ���Ŀ¼
	public static void deleteFiles() throws IOException {
		File file = new File(addStr);
		if (file.exists()) {
			deleteGo(file);	
		}else {
			System.out.println("�ļ�������");
		}
		file.createNewFile();//�ָ���Ŀ¼
	}
	
	private static void deleteGo(File file) {
		//�ļ����Ƿ�Ϊ��
		if (file.isDirectory()) {//�Ƿ����ļ����ҷǿ�
			File[] files = file.listFiles();
			for (File file2 : files) {
				deleteGo(file2);
			}
		}
		file.delete();
	}
}
