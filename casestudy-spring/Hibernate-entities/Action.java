package com.cts.training.product.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
@Entity
@Table(name="action")

public class Action {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private Integer userId;
	@Column
	private Integer mediaId;
	@Column
	private Boolean status;
	@Column
	@CreationTimestamp
	private LocalDateTime createdOn;

public Action() {}

public Action(Integer id, Integer userId, Integer mediaId, Boolean status, LocalDateTime createdOn) {
	super();
	this.id = id;
	this.userId = userId;
	this.mediaId = mediaId;
	this.status = status;
	this.createdOn = createdOn;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Integer getUserId() {
	return userId;
}

public void setUserId(Integer userId) {
	this.userId = userId;
}

public Integer getMediaId() {
	return mediaId;
}

public void setMediaId(Integer mediaId) {
	this.mediaId = mediaId;
}

public Boolean getStatus() {
	return status;
}

public void setStatus(Boolean status) {
	this.status = status;
}

public LocalDateTime getCreatedOn() {
	return createdOn;
}

public void setCreatedOn(LocalDateTime createdOn) {
	this.createdOn = createdOn;
}

@Override
public String toString() {
	return "Action [id=" + id + ", userId=" + userId + ", mediaId=" + mediaId + ", status=" + status + ", createdOn="
			+ createdOn + "]";
}




}

