package com.notice.entity;

import java.util.Date;

public class Notice {
	private int no;
	private String title;
	private String content;
	private String author;
	private String writeday;
	
	public Notice() {
		// TODO Auto-generated constructor stub
}

public Notice(int no, String title, String content, String author, String writeday) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.author = author;
		this.writeday = writeday;
}

public int getNo() {
		return no;
}

public void setNo(int no) {
		this.no = no;
}

public String getTitle() {
		return title;
}

public void setTitle(String title) {
		this.title = title;
}

public String getContent() {
		return content;
}

public void setContent(String content) {
		this.content = content;
}

public String getAuthor() {
		return author;
}

public void setAuthor(String author) {
		this.author = author;
}

public String getWriteday() {
		return writeday;
}

public void setWriteday(String writeday) {
		this.writeday = writeday;
}
	


	
	
	
}
