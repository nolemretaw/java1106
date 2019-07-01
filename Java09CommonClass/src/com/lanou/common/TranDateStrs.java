package com.lanou.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TranDateStrs {
	private Date date;
	private String dateStr;
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDateStr() {
		return dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}

	public TranDateStrs(Date date) {
		super();
		this.date = date;
	}
	public TranDateStrs(String dateStr){
		super();
		this.dateStr = dateStr;
	}
	public TranDateStrs(){}
	
	public String datetoString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy" + " 年 " + "MM" + " 月 " + "dd" +
	" 日 " + "HH" + " 点 " + "mm" + " 分 " + "ss" + " 秒 " +  " 第 " +"ww" + " 周 ");
		return sdf.format(date);
	}
	public Date stringtoDate() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");
		return sdf.parse(dateStr);
	}
}
