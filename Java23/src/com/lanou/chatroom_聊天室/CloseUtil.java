package com.lanou.chatroom_������;

import java.io.Closeable;
import java.io.IOException;

//�ر�io���Ĺ�����
public class CloseUtil {
	public static void close(Closeable... io) {//�ӿڶ�̬
		for (Closeable tmp : io) {
			if (tmp != null) {
				try {
					tmp.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
