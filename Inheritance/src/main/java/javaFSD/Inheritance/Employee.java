package javaFSD.Inheritance;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
//use table(name and enittiy name
@Table(name = "emp_tab")
//@DiscriminatorValue(value = "empVal")
public class Employee extends Person{
	
	@Column(name = "emp_salary", columnDefinition = "DECIMAL(4,2)")
	//4 is int part , 2 decimal part 
	private Double Salary;
	
	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	private String depName;
	
	private Date doj;

}
