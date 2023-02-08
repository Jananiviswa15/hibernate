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
		emp.setEmployeeName("harini");
		emp.setEmail("harini@gmail.com");
		emp.setSalary(14500.00);
		emp.setDoj(new Date());
		
		Address adrs = new Address();
		adrs.setCity("chn");
		adrs.setStreet("abc");
		
		emp.setAddress(adrs);
		
    	Configuration config = new Configuration().configure("newfile.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Address.class);
		SessionFactory sessionFact = config.buildSessionFactory(); 
		Session session = sessionFact.openSession();
		session.beginTransaction();
		session.save(emp);
		
		/*if you dont give cacscade type all u neeed to save child and parent separ*/
		//session.save(emp)
		//session.save(adrs)
		session.getTransaction().commit();
		Employee empFromDB = session.get(Employee.class, 1);
		if(empFromDB != null) {
			System.out.println(empFromDB);
			System.out.println(empFromDB.getAddress());
		}
    }
}
