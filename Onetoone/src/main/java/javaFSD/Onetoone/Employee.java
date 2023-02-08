package javaFSD.Onetoone;


import java.util.Date;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;

@Entity
@DynamicUpdate
@Table(name = "employee_table")
public class Employee {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private Integer employeeId;

	@Column(name = "emp_name", length = 20, nullable = false)
	private String employeeName;

	@Column(name = "emp_mail", unique = true)
	private String email;

	private Double salary;

	private Date doj;
	
	//@OneToOne(cascade = CascadeType.PERSIST)
	//u shuld save ur obj by persist method only in app.java
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "adrs_id")
	//cascade typoe all -> it will store the parent and child objat the same time 
	private Address address;

	/*getter and setters */

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
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
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email
				+ ", salary=" + salary + ", doj=" + doj + ", address=" + address + "]";
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}

	

}
