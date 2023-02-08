package javaFSD.Onetoone;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;

@Entity
@Table(name = "address_table")
public class Address {

	@Id
	@Column(name = "address_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "street_name", length = 10)
	private String street;
	
	
	/*@OneToOne // it ll craete an extra col in adrs also 
	 * already emp is having extra col(ref to adrs)
	 */
	@OneToOne(mappedBy = "address")  //extra col in adrs tab is not created
	private Employee emp;
	
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


/*@OneToOne   //cascade type all
	private Employee emp;
	1. add getters and setter for emp
2. remove one to one from emp 
3. create emp set a;ll the value for it 
4. craete adrs obj set city strt 
5. adrs.setEmp(emp)
6. session.save(adrs)*/


/*Adrs adrs =  get(Address.class , 1)
sysout adrs 
adrs.getEMpl()*/