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
作业1:将一个目录中所有文件从小到大进行输出(包括子目录)----->printFile()
作业2:输入一个年份,以年份为目录,所有月份为子目录------->createFile()
         在子目录中以当前月份的天数创建相应文件
作业3:输入一个目录,统计该目录大小(目录下所有文件大小加起来)-------->countValue()
作业4:删除指定目录下所有文件和子目录--------->deleteFiles()
 * */
public class FileCatalog {
	private static String addStr;//地址及文件名,静态类属性
	private static ArrayList<File> fileArr = new ArrayList<File>();//用于存放文件
	public FileCatalog() {}
	public FileCatalog(String addString) {
		addStr = addString;
	}
	
	public static void printFile() {
		
		File file = new File(addStr);
		printGo(file);
		Collections.sort(fileArr,new SizeComparator());//排序
		System.out.println("\t文件名\t尺寸\t");
		for (int i = 0;i < fileArr.size();i++ ) {
			if (fileArr.get(i).getName()!=null) {
				System.out.println("\t"+fileArr.get(i).getName()+"\t"+fileArr.get(i).length()/1024.0 + " KB\t" );	
			}		
		} 
	}
	
	private static void printGo(File file) {//由小到大输出文件
		if (file != null ) {//是否存在
			if (file.isDirectory()) {//是否目录
				File f[] = file.listFiles();//可得到一个文件夹下全部子文件对象
				for (File file2 : f) {
				printGo(file2);	//递归
				}//foreach
				//System.out.println("是目录");
			}//是目录非文件
		else {
			fileArr.add(file);
			}//非目录是文件	
		}	
	}	
	
	//按年月日创建目录及文件
	public static void createFile() throws ParseException, IOException {
		String root = addStr.substring(0, addStr.lastIndexOf("/")+1);//截获根目录
		File rootFiles = new File(root);
		
		addStr = addStr.substring(addStr.lastIndexOf("/") + 1 );//年份
		File yFiles = new File(rootFiles, addStr);
		boolean dir = yFiles.mkdirs();
		if (dir) {
			System.out.println("创建成功");
		}else {
		System.out.println("失败");	
		}
//		new File(files, child);
		int[] month = new int[12];//放12月天数
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
			strbBuffer = new StringBuffer(String.valueOf(i+1));//将月作为二级文件夹名
		
			File mFiles = new File(yFiles,strbBuffer.append("/").toString());
			mFiles.mkdirs();//月级目录
			for (int j = 0; j < month[i]; j++) {
				strbBuffer = new StringBuffer(String.valueOf(j+1));//将日作为文件名
				
				File dFile = new File(mFiles,strbBuffer.append("日").toString());
				dFile.createNewFile();
			}
		}	
	}
	
	//计算目录大小
	public static void countValue () {
		File file = new File(addStr);
		printGo(file);
		double value = 0.0;//容量/1024byte;
		int i = 0;
		for (; i < fileArr.size(); i++) {
			value += fileArr.get(i).length();
		}
		System.out.println( "共有文件" + (i+1) + "个" + " 总容量为"+value / 1024 + "KB");
	}
	
	//删除全部文件及目录
	public static void deleteFiles() throws IOException {
		File file = new File(addStr);
		if (file.exists()) {
			deleteGo(file);	
		}else {
			System.out.println("文件不存在");
		}
		file.createNewFile();//恢复总目录
	}
	
	private static void deleteGo(File file) {
		//文件夹是否为空
		if (file.isDirectory()) {//是否是文件夹且非空
			File[] files = file.listFiles();
			for (File file2 : files) {
				deleteGo(file2);
			}
		}
		file.delete();
	}
}
