package javaFSD.Onetoone;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;

@Entity
public class Address {

	@Id
	@Column(name = "address_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "street_name", length = 10)
	private String street;
		
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_id")
	private Employee emp;
	
	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "city_name", length = 10)
	private String city;
	
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + "]";
	}
}
