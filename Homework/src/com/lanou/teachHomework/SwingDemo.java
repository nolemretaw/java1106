package com.lanou.teachHomework;

import java.awt.Color;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingDemo {

	public static void main(String[] args) {
		// 1、创建一个窗口
		JFrame jf = new JFrame("java窗口");
		//设置窗口默认宽高尺寸
		jf.setSize(600, 400);
		//设置窗口在屏幕正中间弹出
		jf.setLocationRelativeTo(null);
		//点击叉号不关闭窗口
//		jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//让窗口显示出来
//		jf.setVisible(true);
		//创建一个面板
		JPanel jp = new JPanel();
		
		//把面板添加到窗口上
//		jf.add(jp);
//		//将当前面板设为窗口主面板
//		jf.setContentPane(jp);
		
		//让面板背景色在红绿之间切换
		int i = 1;
//		while (true) {
//			i= i==1?0:1;
//			try {
//				Thread.sleep(600);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			if (i==1) {
//				//设置面板背景颜色
//				jp.setBackground(Color.GREEN);
//			} else {
//				jp.setBackground(Color.red);
//			}
//		}
		//让背景颜色随机切换
//		while (true) {
//			try {
//				Thread.sleep(600);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			jp.setBackground(new Color(
//					new Random().nextInt(256),
//					new Random().nextInt(256),
//					new Random().nextInt(256)));
//		}
		//创建文字标签
		JLabel label = new JLabel("文字标签");
		//将文字标签添加至面板
		jp.add(label);
		//创建一个按钮
		JButton jbt1= new JButton("确定");
		JButton jbt2= new JButton("取消");
		jp.add(jbt1);
		jp.add(jbt2);
		
		//文本框
		JTextField field = new JTextField(10);
		jp.add(field);
		
		//图片按钮
		Icon icon = new ImageIcon("图片.jpg");
		JButton imgaeBtn = new JButton(icon);
		jp.add(imgaeBtn);
		//将当前面板设为窗口主面板
		jf.setContentPane(jp);
		
//		让窗口显示出来
		jf.setVisible(true);
	}

}
