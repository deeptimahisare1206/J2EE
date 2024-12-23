package manytomany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class QuestionM {
	
	@Id
	int qid;
	String question;
	@ManyToMany(mappedBy = "que" , cascade = CascadeType.ALL)
	List<Answer2> ans;
	
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
	public List<Answer2> getAns() {
		return ans;
	}
	public void setAns(List<Answer2> ans) {
		this.ans = ans;
	}
	

}
