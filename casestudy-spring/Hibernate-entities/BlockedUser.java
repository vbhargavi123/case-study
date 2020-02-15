package com.cts.training.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="blockeduser")

public class BlockedUser {
	@Column
	private Integer userId;
	@Column
	private Integer blockeduserId;
	public BlockedUser() {}
	public BlockedUser(Integer userId, Integer blockeduserId) {
		super();
		this.userId = userId;
		this.blockeduserId = blockeduserId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getBlockeduserId() {
		return blockeduserId;
	}
	public void setBlockeduserId(Integer blockeduserId) {
		this.blockeduserId = blockeduserId;
	}
	@Override
	public String toString() {
		return "BlockedUser [userId=" + userId + ", blockeduserId=" + blockeduserId + "]";
	}
	

}
