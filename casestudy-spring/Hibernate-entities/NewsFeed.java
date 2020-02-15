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
@Table(name="newsfeed")

public class NewsFeed {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private Integer userId;
	@Column
	private Integer mediaId;
	@Column
	private String feed;
	@Column
	@CreationTimestamp
	private LocalDateTime createdOn;
	public NewsFeed() {}
	public NewsFeed(Integer id, Integer userId, Integer mediaId, String feed, LocalDateTime createdOn) {
		super();
		this.id = id;
		this.userId = userId;
		this.mediaId = mediaId;
		this.feed = feed;
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
	public String getFeed() {
		return feed;
	}
	public void setFeed(String feed) {
		this.feed = feed;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	@Override
	public String toString() {
		return "NewsFeed [id=" + id + ", userId=" + userId + ", mediaId=" + mediaId + ", feed=" + feed + ", createdOn="
				+ createdOn + "]";
	}
	
	
	


}
