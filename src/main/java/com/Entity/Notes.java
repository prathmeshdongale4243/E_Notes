package com.Entity;

public class Notes
{
	int userId;
	int noid;
	String createdat;
	String question;
	String answear;
	
	
	public Notes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswear() {
		return answear;
	}
	public void setAnswear(String answear) {
		this.answear = answear;
	}
	
	public int getNoid() {
		return noid;
	}
	public void setNoid(int noid) {
		this.noid = noid;
	}
	public String getCreatedat() {
		return createdat;
	}
	public void setCreatedat(String createdat) {
		this.createdat = createdat;
	}
}
