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
		// 1������һ������
		JFrame jf = new JFrame("java����");
		//���ô���Ĭ�Ͽ�߳ߴ�
		jf.setSize(600, 400);
		//���ô�������Ļ���м䵯��
		jf.setLocationRelativeTo(null);
		//�����Ų��رմ���
//		jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//�ô�����ʾ����
//		jf.setVisible(true);
		//����һ�����
		JPanel jp = new JPanel();
		
		//�������ӵ�������
//		jf.add(jp);
//		//����ǰ�����Ϊ���������
//		jf.setContentPane(jp);
		
		//����屳��ɫ�ں���֮���л�
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
//				//������屳����ɫ
//				jp.setBackground(Color.GREEN);
//			} else {
//				jp.setBackground(Color.red);
//			}
//		}
		//�ñ�����ɫ����л�
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
		//�������ֱ�ǩ
		JLabel label = new JLabel("���ֱ�ǩ");
		//�����ֱ�ǩ��������
		jp.add(label);
		//����һ����ť
		JButton jbt1= new JButton("ȷ��");
		JButton jbt2= new JButton("ȡ��");
		jp.add(jbt1);
		jp.add(jbt2);
		
		//�ı���
		JTextField field = new JTextField(10);
		jp.add(field);
		
		//ͼƬ��ť
		Icon icon = new ImageIcon("ͼƬ.jpg");
		JButton imgaeBtn = new JButton(icon);
		jp.add(imgaeBtn);
		//����ǰ�����Ϊ���������
		jf.setContentPane(jp);
		
//		�ô�����ʾ����
		jf.setVisible(true);
	}

}
