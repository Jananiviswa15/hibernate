package javaFSD.javaFSD.project1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		Employee emp1 = new Employee();
		emp1.setEmployeeName("ragul455");

		Employee emp2 = new Employee();
		emp2.setEmployeeId(1);
		emp2.setEmployeeName("ragul455");

		Employee emp3 = new Employee();
		emp3.setEmployeeName("ragul455");

		//read the default config file with name hibernate.cfg.xml
		//not default name --> new Configuration().configure("pass the file name here)
		Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class);//<hibernate-configuration> </hibernate-configuration>
		SessionFactory sessionFact = config.buildSessionFactory(); //<sessionFactory> </sessionFactory>
		Session session = sessionFact.openSession();
		session.beginTransaction();
		Integer id = (Integer) session.save(emp1);  //return the primary key of the obj insert into db
		System.out.println(id);
		Integer id1 = (Integer) session.save(emp2);
		System.out.println(id1);
		session.save(emp3);
		session.persist(emp1);
		session.getTransaction().commit();

	}
}
