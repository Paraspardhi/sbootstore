package com.spring.onlinestore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class UserRole {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	private int RoleId;
	private String RoleName;
	private String RoleDesc;
	public UserRole() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRole( String roleName, String roleDesc) {
		super();
		
		RoleName = roleName;
		RoleDesc = roleDesc;
	}
	public int getRoleId() {
		return RoleId;
	}
	public void setRoleId(int roleId) {
		RoleId = roleId;
	}
	public String getRoleName() {
		return RoleName;
	}
	public void setRoleName(String roleName) {
		RoleName = roleName;
	}
	public String getRoleDesc() {
		return RoleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		RoleDesc = roleDesc;
	}
	@Override
	public String toString() {
		return "UserRole [RoleId=" + RoleId + ", RoleName=" + RoleName + ", RoleDesc=" + RoleDesc + "]";
	}
	
	

}
