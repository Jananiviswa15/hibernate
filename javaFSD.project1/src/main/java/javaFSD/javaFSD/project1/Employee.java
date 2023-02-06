package javaFSD.javaFSD.project1;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//plain old java objec 
@Entity
//@Entity(name = "dummyTable")
@Table(name = "newName")
public class Employee {

	
	/* private attr of an emp*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //start by and inc by 1
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


}
