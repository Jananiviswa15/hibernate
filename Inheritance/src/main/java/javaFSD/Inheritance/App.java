package javaFSD.Inheritance;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Person person = new Person();
       person.setName("jayasri");
       
       Employee emp = new Employee();
       emp.setDepName("java");
       emp.setDoj(new Date());
       emp.setName("divya");
       emp.setSalary(67.67);
       
       Student std = new Student();
       std.setGrade("fifth");
       std.setName("vivega");
       std.setSchoolName("abc");
 
       Configuration config = new Configuration().configure("newfile.cfg.xml").addAnnotatedClass(Person.class).addAnnotatedClass(Employee.class).addAnnotatedClass(Student.class);
		SessionFactory sessionFact = config.buildSessionFactory(); 
		Session session = sessionFact.openSession();
		session.beginTransaction();
		session.save(emp);
		session.save(person);
		session.save(std);
		
		session.getTransaction().commit();
       
    }
}
