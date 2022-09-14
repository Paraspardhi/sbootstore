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
public class Product {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	 @Column(nullable = false)
	private String pname;
	 @Column(nullable = false)
	private String pdesc;
	 @Column(nullable = false)
	private String pimg;
	 @Column(nullable = false)
	private double psellprice;
	 @Column(nullable = false)
	private double pcostprice;
	 @Column(nullable = false)
	private int pstockunit;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserId")
	private User user;
	@Column(nullable = false)
	private Date createDate;
	@Column(nullable = false)
	private boolean isdelete;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String pname, String pdesc, String pimg, double psellprice, double pcostprice, int pstockunit,
			User user, Date createDate, boolean isdelete) {
		super();
		this.pname = pname;
		this.pdesc = pdesc;
		this.pimg = pimg;
		this.psellprice = psellprice;
		this.pcostprice = pcostprice;
		this.pstockunit = pstockunit;
		this.user = user;
		this.createDate = createDate;
		this.isdelete = isdelete;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	public String getPimg() {
		return pimg;
	}
	public void setPimg(String pimg) {
		this.pimg = pimg;
	}
	public double getPsellprice() {
		return psellprice;
	}
	public void setPsellprice(double psellprice) {
		this.psellprice = psellprice;
	}
	public double getPcostprice() {
		return pcostprice;
	}
	public void setPcostprice(double pcostprice) {
		this.pcostprice = pcostprice;
	}
	public int getPstockunit() {
		return pstockunit;
	}
	public void setPstockunit(int pstockunit) {
		this.pstockunit = pstockunit;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public boolean isIsdelete() {
		return isdelete;
	}
	public void setIsdelete(boolean isdelete) {
		this.isdelete = isdelete;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pdesc=" + pdesc + ", pimg=" + pimg + ", psellprice="
				+ psellprice + ", pcostprice=" + pcostprice + ", pstockunit=" + pstockunit + ", user=" + user
				+ ", createDate=" + createDate + ", isdelete=" + isdelete + "]";
	}
	
	


}
