package com.domain;

/**
 * Historyinfo entity. @author MyEclipse Persistence Tools
 */

public class Historyinfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userId;
	private String select;
	private String date;

	// Constructors

	/** default constructor */
	public Historyinfo() {
	}

	/** full constructor */
	public Historyinfo(Integer userId, String select, String date) {
		this.userId = userId;
		this.select = select;
		this.date = date;
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

	public String getSelect() {
		return this.select;
	}

	public void setSelect(String select) {
		this.select = select;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}