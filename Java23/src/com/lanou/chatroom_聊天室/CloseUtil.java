package com.lanou.chatroom_聊天室;

import java.io.Closeable;
import java.io.IOException;

//关闭io流的工具类
public class CloseUtil {
	public static void close(Closeable... io) {//接口多态
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
