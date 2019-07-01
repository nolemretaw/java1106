package com.lanou.tcp1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) {
		Socket socket = null;
		BufferedWriter bufferedWriter = null;
		BufferedReader bufferedReader = null;
		try {
			while (true) {
				socket = new Socket("localhost", 10090);
				//д��
				OutputStream outputStream = socket.getOutputStream();//�Է��������
				bufferedReader = new BufferedReader(new InputStreamReader(System.in));//��������
				String info = bufferedReader.readLine();
				byte[] data = info.getBytes();
				outputStream.write(data, 0, data.length);
				outputStream.flush();
				socket.shutdownOutput();
				
				InputStream inputStream = socket.getInputStream();//�Է���������
				InputStreamReader iReader = new InputStreamReader(inputStream);
				bufferedReader = new BufferedReader(iReader);
				info =null;
				while ((info = bufferedReader.readLine()) != null) {
					System.out.println("����˷�������ϢΪ: " + info);
				}
				//�ر�socket�е���
				socket.shutdownInput();
				
			}
			
			
			
			
			
			
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
