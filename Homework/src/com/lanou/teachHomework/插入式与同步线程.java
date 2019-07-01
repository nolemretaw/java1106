package com.lanou.teachHomework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ����ʽ��ͬ���߳� {

	public static void main(String[] args) {
		//������
		final Object lock = new Object();
		//����ͼƬ���߳�
		Thread t1 = new Thread(){
			@Override
			public void run() {
				System.out.println("��ʼ����");
				//ͼƬ����
				downloadImage();
				//�������֪ͨ
				synchronized (lock) {
					lock.notify();	
				}
				System.out.println("�������");
			}

			private void downloadImage() {
				// ������
				InputStream in=null;
				//�����
				OutputStream out=null;
				try {
					File src = new File("C:\\Users\\xalo\\Desktop\\girl.jpg");
					in = new FileInputStream(src);
					out = new FileOutputStream("girl.jpg");
					//ѭ����д
					long byteCount = 0;
					int b;
					while((b=in.read())!=-1){
						out.write(b);
						byteCount++;
						//ͳ�����ذٷֱ�
						String progress = 
								(byteCount*1.0/src.length())*100+"%";
						System.out.println("�����ˣ�"+progress);
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					if (in!=null) {
						try {
							in.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if (out!=null) {
						try {
							out.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				
			}
		};
		//��ʾͼƬ���߳�
		Thread t2 = new Thread(){
			@Override
			public void run() {
				System.out.println("�ȴ�����");
				/*try {
				 * //����ʽ�̣߳���ʾͼƬ֮ǰ����t1��ӣ���������ͼƬ
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				*/
				//�߳��ȵȴ�
				synchronized (lock) {
					try {
						lock.wait();//�ȴ���������ٻ�����ʾ
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				showImage();
			}
			//��ʾt1�߳����ص�ͼƬ
			private void showImage() {
				//����
				JFrame jf = new JFrame("ͼƬ��ʾ");
				//���ô��ڴ�С
				jf.setSize(600,400);
				//���ô�����ʾλ��
				jf.setLocationRelativeTo(null);
				//�������
				JPanel jp = new JPanel();
				//����ͼƬ��ť
				Icon icon = new ImageIcon("girl.jpg");
				JButton jb = new JButton(icon);
				//��ť��ӵ������
				jp.add(jb);
				//�����ӵ�������
				jf.setContentPane(jp);
				//��ʾ����
				jf.setVisible(true);
				
			}
		};
		//�����߳�
				t1.start();
				t2.start();
	}

}
