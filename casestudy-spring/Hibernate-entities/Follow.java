package com.cts.training.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="follow")
public class Follow {
	@Column
	private Integer userId;
	@Column
	private Integer followerId;
	public Follow() {}
	
	public Follow(Integer userId, Integer followerId) {
		super();
		this.userId = userId;
		this.followerId = followerId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getFollowerId() {
		return followerId;
	}

	public void setFollowerId(Integer followerId) {
		this.followerId = followerId;
	}

	@Override
	public String toString() {
		return "Follow [userId=" + userId + ", followerId=" + followerId + "]";
	}
	

}
