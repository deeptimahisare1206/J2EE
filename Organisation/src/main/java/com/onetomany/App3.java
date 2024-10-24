package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App3 {
	 public static void main( String[] args )
	    {
	    	
	        Configuration cfg = new Configuration();
	    	cfg.configure();
	    	
	    	SessionFactory sf = cfg.buildSessionFactory();
	    	Session sess = sf.openSession();
	    	
	    	Question1 q1 = new Question1();
	    	q1.setQid(101);
	    	q1.setQuestion("List Java IDE's.");
	    	
	    	AnswerM a1 = new AnswerM();
	    	a1.setAid(01);
	    	a1.setAnswer("Eclipse.");
	    	
	    	AnswerM a2 = new AnswerM();
	    	a2.setAid(02);
	    	a2.setAnswer("Intelli-J.");
	    	
	    	AnswerM a3 = new AnswerM();
	    	a3.setAid(03);
	    	a3.setAnswer("Netbeans.");
	    	
	    	List<AnswerM> li = new ArrayList<AnswerM>();
	    	li.add(a1);
	    	li.add(a2);
	    	li.add(a3);
	    	
	    	q1.setAns(li);
	    	
	    	for(AnswerM a:li) {
	    		a.setQues(q1);
	    	}
	    	
	    	Transaction tx = sess.beginTransaction();
	    	sess.save(q1);
	    	
	    	tx.commit();
	    	sess.close();
	    	System.out.println( "Successfull!" );
	    }


}
