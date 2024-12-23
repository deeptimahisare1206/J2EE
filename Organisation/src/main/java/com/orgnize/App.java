package com.orgnize;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Employee Name:");
    	String name = sc.nextLine();
    	System.out.println("Enter Employee id:");
    	int id= sc.nextInt();
    	System.out.println("Enter Salary:");
    	double salary = sc.nextDouble();
        
        Configuration cfg = new Configuration();
    	cfg.configure();
    	
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session sess = sf.openSession();
    	
    	Employee ep = new Employee();
    	ep.setEmp_id(id);
    	ep.setEmp_name(name);
    	ep.setSalary(salary);
    	
    	Transaction tx = sess.beginTransaction();
    	sess.save(ep);
    	tx.commit();
    	sess.close();
    	System.out.println( "Registered successfull!" );
    }
}
