package javaFSD.project2;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class App 
{
	//private stat scanner 
	public static void main( String[] args )
	{
		try {
		Configuration config = new Configuration().configure("newfile.cfg.xml").addAnnotatedClass(Employee.class);
		SessionFactory sessionFact = config.buildSessionFactory(); 
		Session session = sessionFact.openSession();
	createEmployee(session);
	//sessionFact.close(); //-->  create-drop
		//deleteById(session);
		//updateById(session);
		//displayById(session);
		}catch(HibernateException obj) {
			
		}
		catch(Exception obj) {
			
		}
	}
	
	private static void createEmployee(Session session) {
		session.beginTransaction();
		Integer id = (Integer) session.save(getEmployee());
		System.out.println("EMployee is created with id :"+id);
		session.getTransaction().commit();
	
	}

	private static void deleteById(Session session) {
		Employee emp = session.get(Employee.class, 2);
		
		if(emp != null) {
			session.beginTransaction();
			session.remove(emp);
			session.getTransaction().commit();
		}
		else {
			System.out.println("employee id doesnt exists..");
			
		}	
	}
	private static void updateById(Session session) {
		Employee emp = session.get(Employee.class, 2);
		if(emp != null) {
			//scanner obj 
			emp.setEmail("harinistar1234@gmail.com");
			emp.setSalary(50000.00);
			session.beginTransaction();
			session.persist(emp);
			session.getTransaction().commit();
		}
		else {
			System.out.println("employee id doesnt exists..");
			
		}	
	}
	private static void displayById(Session session){
		Employee emp = session.get(Employee.class, 2);
		if(emp != null) {
			System.out.println(emp);
		}
		else {
			System.out.println("employee id doesnt exists..");
			
		}
	}
	private static Employee getEmployee() {
		Employee emp = new Employee();
		emp.setEmployeeName("harini");
		emp.setEmail("harini123@gmail.com");
		emp.setSalary(14500.00);
		emp.setDoj(new Date());
		return emp;
	}
}
