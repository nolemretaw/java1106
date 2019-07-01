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
 * 处理文件下载的处理器
 * */
@Controller
public class FileController {
	/**
	 * 访问文件上传下载页面
	 * */
	@RequestMapping("/toUpload.do")
	public String toUpdate(){
		return "upload";
	}
	
	/**
	 * 处理文件上传的方法
	 * uploadFile:要与表单上上传组件的name属性值一致，代表上传的临时文件
	 * @throws IOException 
	 * @throws IllegalStateException 
	 * */
	@RequestMapping("/upload.do")
	public String upload(MultipartFile uploadFile,HttpServletRequest request) throws IllegalStateException, IOException{
		//1、从上传的临时文件中取出文件名
		String fileName = uploadFile.getOriginalFilename();
//		System.out.println("文件名"+fileName);
		
		//2、将文件保存到指定目录下
		String dirName = request.getServletContext().getRealPath("/upload");
		File dir = new File(dirName);
		if (dir.isFile()) {
			dir.delete();
		}
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir, fileName);
		
		//3、将临时文件数据写入到指定的目标文件
		uploadFile.transferTo(file);
//		System.out.println(file);
		
		//判断上传的图片是否为图片
		String suffix = fileName.substring(fileName.lastIndexOf(".")+1);
		if (suffix.toLowerCase().matches("png|gif|jpg")) {
			request.setAttribute("isImg", true);
		}
		request.setAttribute("filePath", "/upload/"+fileName);
		return "upload";
	}
	
		/**处理文件下载
		 * @throws IOException */
	@RequestMapping("/download.do")
	public ResponseEntity<byte[]> download(String fileName,HttpServletRequest request) throws IOException{
		//1、根据文件名找到要下载的文件
		fileName = fileName.substring(fileName.lastIndexOf("/")+1);
		
		//防止下载的文件中文名称乱码
		String name = new String(fileName.getBytes("UTF-8"),"ISO-8859-1");
		
		
		String dirName = request.getServletContext().getRealPath("/upload");
		System.out.println("fileName:"+fileName);
		System.out.println("dirName:"+dirName);
		File file = new File(dirName,fileName);
		System.out.println("file:"+fileName);
		//2、添加下载的mimetype媒体类型和下载响应消息头
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		headers.setContentDispositionFormData("attachment", name);
		
		//3、将要下载的文件压缩到字节数组中，然后再存入响应数据包的响应实体中
		//再以流的形式返回给前端浏览器
		ResponseEntity<byte[]> data = new ResponseEntity<>(
				FileUtils.readFileToByteArray(file), 
				headers, 
				HttpStatus.OK);
		
		return data;
	}
}
