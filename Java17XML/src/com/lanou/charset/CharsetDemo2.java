package com.lanou.charset;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class CharsetDemo2 {
	public static void write() {
		OutputStreamWriter owriter = null;
		try {
			owriter = new OutputStreamWriter(new FileOutputStream("a.txt"), "utf-8");
			owriter.write("ÄãºÃ");
			owriter.flush();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (owriter != null) {
				try {
					owriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void read() {
		InputStreamReader iReader = null;
		try {
			iReader = new InputStreamReader(new FileInputStream("a.txt"),"utf-8");
			char[] chs = new char[1024];
			int num = -1;
			try {
				while ((num = iReader.read(chs)) != -1) {
					System.out.print(new String(chs,0,num));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (iReader != null) {
				try {
					iReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
//		write();
		read();
	}

}
