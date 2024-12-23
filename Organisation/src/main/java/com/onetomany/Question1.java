package com.onetomany;

import java.util.List;

import com.onetoone.Answer;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Question1 {
	@Id
	int qid;
	String question;
	@OneToMany(mappedBy = "ques", cascade = CascadeType.ALL)
	List<AnswerM> ans;
	
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<AnswerM> getAns() {
		return ans;
	}
	public void setAns(List<AnswerM> ans) {
		this.ans = ans;
	}
	

}
