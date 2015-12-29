package com.domain;

/**
 * Historyinfo entity. @author MyEclipse Persistence Tools
 */

public class Historyinfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userId;
	private String history1;
	private String history2;
	private String history3;
	private String history4;
	private String history5;
	private String history6;

	// Constructors

	/** default constructor */
	public Historyinfo() {
	}

	/** minimal constructor */
	public Historyinfo(Integer id, Integer userId) {
		this.id = id;
		this.userId = userId;
	}

	/** full constructor */
	public Historyinfo(Integer id, Integer userId, String history1,
			String history2, String history3, String history4, String history5,
			String history6) {
		this.id = id;
		this.userId = userId;
		this.history1 = history1;
		this.history2 = history2;
		this.history3 = history3;
		this.history4 = history4;
		this.history5 = history5;
		this.history6 = history6;
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

	public String getHistory1() {
		return this.history1;
	}

	public void setHistory1(String history1) {
		this.history1 = history1;
	}

	public String getHistory2() {
		return this.history2;
	}

	public void setHistory2(String history2) {
		this.history2 = history2;
	}

	public String getHistory3() {
		return this.history3;
	}

	public void setHistory3(String history3) {
		this.history3 = history3;
	}

	public String getHistory4() {
		return this.history4;
	}

	public void setHistory4(String history4) {
		this.history4 = history4;
	}

	public String getHistory5() {
		return this.history5;
	}

	public void setHistory5(String history5) {
		this.history5 = history5;
	}

	public String getHistory6() {
		return this.history6;
	}

	public void setHistory6(String history6) {
		this.history6 = history6;
	}

}