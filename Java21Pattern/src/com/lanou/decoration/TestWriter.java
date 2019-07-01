package com.lanou.decoration;

public class TestWriter {

	public static void main(String[] args) {
		Mp3Writer mp3Writer = new Mp3Writer();
		Mp4 mp4 = new Mp4();
		TextWriter textWriter = new TextWriter();
		
		BuffereWriter buffereWriter1 = new BuffereWriter(mp3Writer);
		BuffereWriter buffereWriter2 = new BuffereWriter(mp4);
		BuffereWriter buffereWriter3 = new BuffereWriter(textWriter);
		
		buffereWriter1.write();
		buffereWriter2.write();
		buffereWriter3.write();
	}

}
