package com.example.business;

import java.io.Serializable;

public class Match implements Serializable{


	private static final long serialVersionUID = 1L;
	private String username;
	private String oppname;
	private String tname;
	private String score;
	
	
	public Match(String username, String oppname,
			String tname, String score) {
		
		setUsername(username);
		setOppName(oppname);
		setTName(tname);
		setScore(score);
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getOppName() {
		return oppname;
	}
	public void setOppName(String oppname) {
		this.oppname = oppname;
	}
	public String getTName() {
		return tname;
	}
	public void setTName(String tname) {
		this.tname = tname;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	
}
