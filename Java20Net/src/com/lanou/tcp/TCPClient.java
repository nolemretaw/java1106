package com.lanou.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) {
		Socket socket = null;
		BufferedWriter bufferedWriter = null;
		BufferedReader bufferedReader = null;
		try {
			//1. �����ͻ��˵�Socket,ָ��ip��˿�
			socket = new Socket("localhost", 10010);
			//2. ͨ��socket����������������ݵ������
			OutputStream outputStream = socket.getOutputStream();
			OutputStreamWriter oWriter = new OutputStreamWriter(outputStream);
			bufferedWriter = new BufferedWriter(oWriter);
			bufferedWriter.write("���˧");
			bufferedWriter.flush();
			socket.shutdownOutput();
			//3. ��ȡ������,��д���ݸ������
			InputStream inputStream = socket.getInputStream();
			//���ֽ���ת�����ַ���
			InputStreamReader iReader = new InputStreamReader(inputStream);
			//���ַ���ת��Ϊ��Ч���ַ���
			bufferedReader = new BufferedReader(iReader);
			String info =null;
			while ((info = bufferedReader.readLine()) != null) {
				System.out.println("����˷�������ϢΪ: " + info);
			}
			//�ر�socket�е���
			socket.shutdownInput();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (bufferedWriter != null) {
					bufferedWriter.close();
				}
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				if (socket != null) {
					socket.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
