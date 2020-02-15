package com.cts.training.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="authorities")

public class Authorities {
	@Column
	private String userName;
	@Column(name = "authority")
	private String user;
	
	public Authorities() {}
	public Authorities(String userName, String user) {
		super();
		this.userName = userName;
		this.user = user;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAuthority() {
		return user;
	}
	public void setAuthority(String authority) {
		this.user = authority;
	}
	@Override
	public String toString() {
		return "Authorities [userName=" + userName + ", authority=" + user + "]";
	}
	
}
