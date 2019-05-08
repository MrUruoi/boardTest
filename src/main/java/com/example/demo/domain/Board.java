package com.example.demo.domain;

import java.util.Date;

public class Board {
	private Integer bno;
	private String userid;
	private String title;
	private String content;
	private Integer viewcnt;
	private Date regdate;
	private String originalfile;
	private String savedfile;
	
	public Board() {
		super();
	}

	public Board(Integer bno, String userid, String title, String content, Integer viewcnt, Date regdate,
			String originalfile, String savedfile) {
		super();
		this.bno = bno;
		this.userid = userid;
		this.title = title;
		this.content = content;
		this.viewcnt = viewcnt;
		this.regdate = regdate;
		this.originalfile = originalfile;
		this.savedfile = savedfile;
	}

	public Integer getBno() {
		return bno;
	}

	public void setBno(Integer bno) {
		this.bno = bno;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
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

	public Integer getViewcnt() {
		return viewcnt;
	}

	public void setViewcnt(Integer viewcnt) {
		this.viewcnt = viewcnt;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getOriginalfile() {
		return originalfile;
	}

	public void setOriginalfile(String originalfile) {
		this.originalfile = originalfile;
	}

	public String getSavedfile() {
		return savedfile;
	}

	public void setSavedfile(String savedfile) {
		this.savedfile = savedfile;
	}

	@Override
	public String toString() {
		return "Board [bno=" + bno + ", userid=" + userid + ", title=" + title + ", content=" + content + ", viewcnt="
				+ viewcnt + ", regdate=" + regdate + ", originalfile=" + originalfile + ", savedfile=" + savedfile
				+ "]";
	}
	
}
