package org.cuatrovientos.dam2.sge.backend.data.model;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "email")
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return first_name;
	}

	public void setFirstName(String firstName) {
		this.first_name = firstName;
	}

	public String getLastName() {
		return last_name;
	}

	public void setLastName(String lastName) {
		this.last_name = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer(String first_name, String last_name, String email) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + "]";
	}
}
