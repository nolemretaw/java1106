package com.lanou.practice;

//��Ҫ�û��������ʼ�����ʵ��
//�ļ��� SendEmail2.java
//��ʵ����QQ����Ϊ��������Ҫ��qq��̨����

import java.util.Properties;
import java.util.Scanner;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendEmailAndFile {
	public static void main(String[] args) {
		// �ռ��˵�������
		String to = "1250136191@qq.com";

		// �����˵�������
		String from = "55112942@qq.com";

		// ָ�������ʼ�������Ϊ smtp.qq.com
		String host = "smtp.qq.com"; // QQ �ʼ�������

		// ��ȡϵͳ����
		Properties properties = System.getProperties();

		// �����ʼ�������
		properties.setProperty("mail.smtp.host", host);

		properties.put("mail.smtp.auth", "true");
		// ��ȡĬ��session����
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("55112942@qq.com", "jxtwrlddgfhcbjdc"); // �������ʼ��û�������Ȩ��
			}
		});

		try {
			// ����Ĭ�ϵ� MimeMessage ����
			MimeMessage message = new MimeMessage(session);

			// Set From: ͷ��ͷ�ֶ�
			message.setFrom(new InternetAddress(from));

			// Set To: ͷ��ͷ�ֶ�
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Set Subject: ͷ��ͷ�ֶ�
			//message.setSubject("This is the Subject Line!");
			message.setSubject("This is the Subject Line!"); 
			
			// ������Ϣ����
	         BodyPart messageBodyPart = new MimeBodyPart();
	 
	         // ��Ϣ
	         messageBodyPart.setText("This is message body");
			
	         // ����������Ϣ
	         Multipart multipart = new MimeMultipart();
	 
	         // �����ı���Ϣ����
	         multipart.addBodyPart(messageBodyPart);
	         
	         // ��������
	         messageBodyPart = new MimeBodyPart();
	         String filename = "C:\\Users\\admin\\Desktop\\h5\\��������.html";
	         DataSource source = new FileDataSource(filename);
	         messageBodyPart.setDataHandler(new DataHandler(source));
	         messageBodyPart.setFileName(filename);
	         multipart.addBodyPart(messageBodyPart);
	         
	         // ����������Ϣ
	         message.setContent(multipart );
	         
			// ������Ϣ
			Transport.send(message);
			System.out.println("Sent message successfully....from runoob.com");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}
}
