package com.spring.onlinestore.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class UserPurchase {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	
	private int purchaseId;
	 @Column(nullable = false)
	private Date purchaseDate;
	 @OneToOne(cascade = CascadeType.ALL)
	   // @JoinColumn(name = "pid")
	private Product productid;
	@Column(nullable = false)
	private int TotalUnit;
	
	@OneToOne(cascade = CascadeType.ALL)
   // @JoinColumn(name = "user_id")
	private User purchaseByUser;
	
	@OneToOne(cascade = CascadeType.ALL)
   // @JoinColumn(name = "user_id")
	private  User purchaseFromUser;
	public UserPurchase() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserPurchase(Date purchaseDate, Product productid, int totalUnit, User purchaseByUser,
			User purchaseFromUser) {
		super();
		this.purchaseDate = purchaseDate;
		this.productid = productid;
		TotalUnit = totalUnit;
		this.purchaseByUser = purchaseByUser;
		this.purchaseFromUser = purchaseFromUser;
	}
	public int getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public Product getProductid() {
		return productid;
	}
	public void setProductid(Product productid) {
		this.productid = productid;
	}
	public int getTotalUnit() {
		return TotalUnit;
	}
	public void setTotalUnit(int totalUnit) {
		TotalUnit = totalUnit;
	}
	public User getPurchaseByUser() {
		return purchaseByUser;
	}
	public void setPurchaseByUser(User purchaseByUser) {
		this.purchaseByUser = purchaseByUser;
	}
	public User getPurchaseFromUser() {
		return purchaseFromUser;
	}
	public void setPurchaseFromUser(User purchaseFromUser) {
		this.purchaseFromUser = purchaseFromUser;
	}
	@Override
	public String toString() {
		return "UserPurchase [purchaseId=" + purchaseId + ", purchaseDate=" + purchaseDate + ", productid=" + productid
				+ ", TotalUnit=" + TotalUnit + ", purchaseByUser=" + purchaseByUser + ", purchaseFromUser="
				+ purchaseFromUser + "]";
	}
	
	

}
