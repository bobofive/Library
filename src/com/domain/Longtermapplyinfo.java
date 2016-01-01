package com.domain;

/**
 * Longtermapplyinfo entity. @author MyEclipse Persistence Tools
 */

public class Longtermapplyinfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userId;
	private Integer seatId;
	private Integer time;

	// Constructors

	/** default constructor */
	public Longtermapplyinfo() {
	}

	/** full constructor */
	public Longtermapplyinfo(Integer userId, Integer seatId, Integer time) {
		this.userId = userId;
		this.seatId = seatId;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getSeatId() {
		return this.seatId;
	}

	public void setSeatId(Integer seatId) {
		this.seatId = seatId;
	}

	public Integer getTime() {
		return this.time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

}