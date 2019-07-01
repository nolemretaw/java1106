package com.lanou.web;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *��ǰ�����������һ��ͼƬ��֤��
 *	��ͼ:
 *	����:
 */
@WebServlet("/validate.do")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ��������
		BufferedImage image = new BufferedImage(100, 30,BufferedImage.TYPE_3BYTE_BGR );
//		for(int x = 0;x<image.getWidth();x++){
//			for (int y = 0; y < image.getHeight(); y++) {
//				int color = new Random().nextInt(0xffffff);
//				image.setRGB(x, y, color);
//			}
//		}
		
		// ��������
		Graphics g = image.getGraphics();
		//ʹ�û�������������ɫ
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		
		//���û�����ɫ
		g.setColor(Color.RED);
		
		//��������
		Font font = new Font(Font.SANS_SERIF,//����
							Font.BOLD,//����
							20);//��С
		g.setFont(font);
		
		
		
		
		//ͨ�������ڻ�����д����
		g.drawString("��Ÿ�Ƽ�", 10, 20);
		
		//��5��������
		for (int i = 0; i < 5; i++) {
			g.setColor(new Color(
					new Random().nextInt(256),
					new Random().nextInt(256),
					new Random().nextInt(256)));
			int x1 = new Random().nextInt(image.getWidth());
			int y1 = new Random().nextInt(image.getHeight());
			int x2 = new Random().nextInt(image.getWidth());
			int y2 = new Random().nextInt(image.getHeight());
			g.drawLine(x1, y1, x2, y2);
		}

		
		
		//������������ص���������
		/**
		 * mimetype����ý������
		 * text/html text/css text/js
		 * image/png
		 * */
		response.setContentType("image/png");
		
		//ͨ���ֽ�����ͼƬ��ʾ��ǰ�������
		ServletOutputStream out = response.getOutputStream();
		
		//��ͼƬѹ����out�������
		ImageIO.write(image, "PNG", out);
		
	}

}
