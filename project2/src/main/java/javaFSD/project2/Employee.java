package javaFSD.project2;

import java.util.Date;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
 
@Entity
@DynamicUpdate
public class Employee {

	
	/* private attr of an emp*/
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)  //start by and inc by 1
	/*@GeneratedValue(strategy = GenerationType.AUTO, generator = "empid_generator")  //start by and inc by 1
	@SequenceGenerator(name = "empid_generator", initialValue = 10, allocationSize = 2, sequenceName = "empid_seq" )*/
	/*@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empid_generator") 
	@SequenceGenerator(name = "empid_generator", initialValue = 1, allocationSize = 5, sequenceName = "empid_seq" )*/
	
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "empid_generator") 
	@TableGenerator(name = "empid_generator", initialValue = 10, allocationSize = 2, table = "empid_seq" )
	
	
	private Integer employeeId;
	
	@Column(name = "emp_name", length = 20, nullable = false)
	private String employeeName;
	
	@Column(name = "emp_mail", unique = true)
	private String email;
	
	private Double salary;
	
	private Date doj;
	
	/*getter and setters */
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	@Override
	public String toString() {
		//this.employeeId
		//emp
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email
				+ ", salary=" + salary + ", doj=" + doj + "]";
	}


}
