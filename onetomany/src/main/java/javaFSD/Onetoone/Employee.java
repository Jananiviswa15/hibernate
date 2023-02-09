package javaFSD.Onetoone;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;

@Entity
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
	 
	//@OneToMany(cascade = CascadeType.ALL)
	//@JoinTable(name = "thirdTable", joinColumns = @JoinColumn(name = "firstKey"), inverseJoinColumns = @JoinColumn(name = "secondKey"))
	//private List<Address> address = new ArrayList<Address>();

	/*getter and setters */


/*	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}*/
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
				+ ", salary=" + salary + ", doj=" + doj + ", address=]"; /*+ address + "]";*/
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}

	

}
