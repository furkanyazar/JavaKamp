package Entities;

import java.util.Date;

public class Gamer {
	
	private int id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String identityNumber;
	
	public Gamer() {
		
	}

	public Gamer(int id, String firstName, String lastName, Date dateOfBirth, String identityNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.identityNumber = identityNumber;
	}

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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

}
