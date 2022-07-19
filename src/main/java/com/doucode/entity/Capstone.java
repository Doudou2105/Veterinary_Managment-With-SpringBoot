package com.doucode.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pharma")
   public class Capstone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private int id;
	
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "address")
	private String address;
	@Column(name = "City")
	private String city;
	@Column(name = "Telephone")
	private int telephone;
	
	// About the pet declaration
	@Column(name = "Name_of_pets")
	private String name;
	@Column(name = "Date_of_birthday")
	 private String date;
	@Column(name = "Pets_Type")
	 private String petType;
	 
	
	  // About the visits
	@Column(name = "Description")
	  private String description;
	@Column(name = "Registration")
	  private  LocalDate RegistrationDate =  LocalDate.now();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getRegistrationDate() {
		return RegistrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		RegistrationDate = registrationDate;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Capstone [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", city=" + city + ", telephone=" + telephone + ", name=" + name + ", date=" + date + ", petType="
				+ petType + ", description=" + description + ", RegistrationDate=" + RegistrationDate + "]";
	}



	
	}
	  
	  


