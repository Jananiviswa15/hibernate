package javaFSD.Onetoone;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Employee emp = new Employee();
		emp.setEmployeeName("divya");
		emp.setEmail("divya@gmail.com");
		emp.setSalary(14500.00);
		emp.setDoj(new Date());
		
		Address adrs1 = new Address();
		adrs1.setCity("chn");
		adrs1.setStreet("abc");
		
		Address adrs2 = new Address();
		adrs2.setCity("blre");
		adrs2.setStreet("bcd");
		
		Address adrs3 = new Address();
		adrs3.setCity("hyd");
		adrs3.setStreet("abc");
		
		Address adrs4 = new Address();
		adrs4.setCity("calicut");
		adrs4.setStreet("bcd");
		
	/*	emp.getAddress().add(adrs4);
		emp.getAddress().add(adrs3);
		emp.getAddress().add(adrs1);
		emp.getAddress().add(adrs2);*/
		
		/* many to one*/
		adrs1.setEmp(emp);
		adrs2.setEmp(emp);
		adrs3.setEmp(emp);
		adrs4.setEmp(emp);
		
    	Configuration config = new Configuration().configure("newfile.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Address.class);
		SessionFactory sessionFact = config.buildSessionFactory(); 
		Session session = sessionFact.openSession();
		session.beginTransaction();
		session.save(adrs1);
		session.save(adrs2);
		session.save(adrs3);
		session.save(adrs4);
		session.getTransaction().commit();
		
    }
}
