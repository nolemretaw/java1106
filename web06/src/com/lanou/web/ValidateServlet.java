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
 *给前端浏览器返回一个图片验证码
 *	画图:
 *	画笔:
 */
@WebServlet("/validate.do")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 创建画布
		BufferedImage image = new BufferedImage(100, 30,BufferedImage.TYPE_3BYTE_BGR );
//		for(int x = 0;x<image.getWidth();x++){
//			for (int y = 0; y < image.getHeight(); y++) {
//				int color = new Random().nextInt(0xffffff);
//				image.setRGB(x, y, color);
//			}
//		}
		
		// 创建画笔
		Graphics g = image.getGraphics();
		//使用画笔描述画布颜色
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		
		//设置画笔颜色
		g.setColor(Color.RED);
		
		//设置字体
		Font font = new Font(Font.SANS_SERIF,//字体
							Font.BOLD,//字形
							20);//大小
		g.setFont(font);
		
		
		
		
		//通过画笔在画布上写文字
		g.drawString("蓝鸥科技", 10, 20);
		
		//画5条干扰线
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

		
		
		//告诉浏览器返回的数据类型
		/**
		 * mimetype数据媒体类型
		 * text/html text/css text/js
		 * image/png
		 * */
		response.setContentType("image/png");
		
		//通过字节流将图片显示给前端浏览器
		ServletOutputStream out = response.getOutputStream();
		
		//将图片压缩到out输出流中
		ImageIO.write(image, "PNG", out);
		
	}

}
