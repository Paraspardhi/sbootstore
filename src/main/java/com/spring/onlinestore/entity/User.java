package com.spring.onlinestore.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class User {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	private int UserId;
	 @Column(nullable = false)
	private String FirstName;
	 @Column(nullable = false)
	private String LastName;
	 @Column(nullable = false)
	private Date DOB;
	 @Column(nullable = false)
	private String EmailId;
	 @Column(nullable = false)
	private String MblNo;
	 @Column(nullable = false)
	private double Balance;
	 @Column(nullable = false)
	private String Password;
	@Column(nullable = true)
	private String Adress;
	@OneToOne
	@Column(nullable = false)
	private UserRole UserR;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User( String firstName, String lastName, Date dOB, String emailId, String mblNo, double balance,
			String password, String adress, UserRole userR) {
		super();
		
		FirstName = firstName;
		LastName = lastName;
		DOB = dOB;
		EmailId = emailId;
		MblNo = mblNo;
		Balance = balance;
		Password = password;
		Adress = adress;
		UserR = userR;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getMblNo() {
		return MblNo;
	}
	public void setMblNo(String mblNo) {
		MblNo = mblNo;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public UserRole getUserR() {
		return UserR;
	}
	public void setUserR(UserRole userR) {
		UserR = userR;
	}
	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", DOB=" + DOB
				+ ", EmailId=" + EmailId + ", MblNo=" + MblNo + ", Balance=" + Balance + ", Password=" + Password
				+ ", Adress=" + Adress + ", UserR=" + UserR + "]";
	}
	
}
