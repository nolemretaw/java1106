package com.lanou.decoration;

public class TestWriter {
	public static void main(String[] args) {
		Mp3Writer mp3Writer = new Mp3Writer();
		Mp4Writer mp4Writer = new Mp4Writer();
		TextWriter textWriter = new TextWriter();
		
		BufferedWriter bufferedWriter1 = new BufferedWriter(mp3Writer); 
		BufferedWriter bufferedWriter2 = new BufferedWriter(mp4Writer);
		BufferedWriter bufferedWriter3 = new BufferedWriter(textWriter);
		
		bufferedWriter1.write();
		bufferedWriter2.write();
		bufferedWriter3.write();
	}
}
