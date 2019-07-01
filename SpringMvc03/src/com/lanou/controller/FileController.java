package com.lanou.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;


/**
 * �����ļ����صĴ�����
 * */
@Controller
public class FileController {
	/**
	 * �����ļ��ϴ�����ҳ��
	 * */
	@RequestMapping("/toUpload.do")
	public String toUpdate(){
		return "upload";
	}
	
	/**
	 * �����ļ��ϴ��ķ���
	 * uploadFile:Ҫ������ϴ������name����ֵһ�£������ϴ�����ʱ�ļ�
	 * @throws IOException 
	 * @throws IllegalStateException 
	 * */
	@RequestMapping("/upload.do")
	public String upload(MultipartFile uploadFile,HttpServletRequest request) throws IllegalStateException, IOException{
		//1�����ϴ�����ʱ�ļ���ȡ���ļ���
		String fileName = uploadFile.getOriginalFilename();
//		System.out.println("�ļ���"+fileName);
		
		//2�����ļ����浽ָ��Ŀ¼��
		String dirName = request.getServletContext().getRealPath("/upload");
		File dir = new File(dirName);
		if (dir.isFile()) {
			dir.delete();
		}
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir, fileName);
		
		//3������ʱ�ļ�����д�뵽ָ����Ŀ���ļ�
		uploadFile.transferTo(file);
//		System.out.println(file);
		
		//�ж��ϴ���ͼƬ�Ƿ�ΪͼƬ
		String suffix = fileName.substring(fileName.lastIndexOf(".")+1);
		if (suffix.toLowerCase().matches("png|gif|jpg")) {
			request.setAttribute("isImg", true);
		}
		request.setAttribute("filePath", "/upload/"+fileName);
		return "upload";
	}
	
		/**�����ļ�����
		 * @throws IOException */
	@RequestMapping("/download.do")
	public ResponseEntity<byte[]> download(String fileName,HttpServletRequest request) throws IOException{
		//1�������ļ����ҵ�Ҫ���ص��ļ�
		fileName = fileName.substring(fileName.lastIndexOf("/")+1);
		
		//��ֹ���ص��ļ�������������
		String name = new String(fileName.getBytes("UTF-8"),"ISO-8859-1");
		
		
		String dirName = request.getServletContext().getRealPath("/upload");
		System.out.println("fileName:"+fileName);
		System.out.println("dirName:"+dirName);
		File file = new File(dirName,fileName);
		System.out.println("file:"+fileName);
		//2��������ص�mimetypeý�����ͺ�������Ӧ��Ϣͷ
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		headers.setContentDispositionFormData("attachment", name);
		
		//3����Ҫ���ص��ļ�ѹ�����ֽ������У�Ȼ���ٴ�����Ӧ���ݰ�����Ӧʵ����
		//����������ʽ���ظ�ǰ�������
		ResponseEntity<byte[]> data = new ResponseEntity<>(
				FileUtils.readFileToByteArray(file), 
				headers, 
				HttpStatus.OK);
		
		return data;
	}
}
