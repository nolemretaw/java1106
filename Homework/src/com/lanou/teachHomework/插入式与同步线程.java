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

public class 插入式与同步线程 {

	public static void main(String[] args) {
		//锁对象
		final Object lock = new Object();
		//下载图片的线程
		Thread t1 = new Thread(){
			@Override
			public void run() {
				System.out.println("开始下载");
				//图片下载
				downloadImage();
				//下载完成通知
				synchronized (lock) {
					lock.notify();	
				}
				System.out.println("下载完成");
			}

			private void downloadImage() {
				// 输入流
				InputStream in=null;
				//输出流
				OutputStream out=null;
				try {
					File src = new File("C:\\Users\\xalo\\Desktop\\girl.jpg");
					in = new FileInputStream(src);
					out = new FileOutputStream("girl.jpg");
					//循环读写
					long byteCount = 0;
					int b;
					while((b=in.read())!=-1){
						out.write(b);
						byteCount++;
						//统计下载百分比
						String progress = 
								(byteCount*1.0/src.length())*100+"%";
						System.out.println("下载了："+progress);
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
		//显示图片的线程
		Thread t2 = new Thread(){
			@Override
			public void run() {
				System.out.println("等待下载");
				/*try {
				 * //插入式线程，显示图片之前，让t1插队，先下载完图片
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				*/
				//线程先等待
				synchronized (lock) {
					try {
						lock.wait();//等待下载完成再唤醒显示
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				showImage();
			}
			//显示t1线程下载的图片
			private void showImage() {
				//窗口
				JFrame jf = new JFrame("图片显示");
				//设置窗口大小
				jf.setSize(600,400);
				//设置窗口显示位置
				jf.setLocationRelativeTo(null);
				//创建面板
				JPanel jp = new JPanel();
				//创建图片按钮
				Icon icon = new ImageIcon("girl.jpg");
				JButton jb = new JButton(icon);
				//按钮添加到面板上
				jp.add(jb);
				//面板添加到窗口上
				jf.setContentPane(jp);
				//显示窗口
				jf.setVisible(true);
				
			}
		};
		//启动线程
				t1.start();
				t2.start();
	}

}
