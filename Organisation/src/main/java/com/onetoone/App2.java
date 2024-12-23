package com.onetoone;

//import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import com.orgnize.Employee;

public class App2 {
	 public static void main( String[] args )
	    {
	    	
	        Configuration cfg = new Configuration();
	    	cfg.configure();
	    	
	    	SessionFactory sf = cfg.buildSessionFactory();
	    	Session sess = sf.openSession();
	    	
	    	Question q1 = new Question();
	    	q1.setQid(101);
	    	q1.setQuestion("What is local variable?");
	    	
	    	Question q2 = new Question();
	    	q2.setQid(102);
	    	q2.setQuestion("What is size of boolean variable?");
	    	
	    	Question q3 = new Question();
	    	q3.setQid(103);
	    	q3.setQuestion("List Java IDE's.");
	    	
	    	Answer a1 = new Answer();
	    	a1.setAid(01);
	    	a1.setAnswer("Variable defined inside method.");
	    	
	    	Answer a2 = new Answer();
	    	a2.setAid(02);
	    	a2.setAnswer("16-bit.");
	    	
	    	Answer a3 = new Answer();
	    	a3.setAid(03);
	    	a3.setAnswer("Eclipse and Netbeans.");
	    	
	    	q1.setAns(a1);
	    	q2.setAns(a2);
	    	q3.setAns(a3);
	    	
	    	a1.setQues(q1);
	    	a2.setQues(q2);
	    	a3.setQues(q3);
	    	
	    	Transaction tx = sess.beginTransaction();
	    	sess.save(q1);
	    	sess.save(q2);
	    	sess.save(q3);
	    	
	    	sess.save(a1);
	    	sess.save(a2);
	    	sess.save(a3);
	    	
	    	tx.commit();
	    	sess.close();
	    	System.out.println( "Successfull!" );
	    }

}
