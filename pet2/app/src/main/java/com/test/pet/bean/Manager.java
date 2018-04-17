/**
 * 
 */
package com.test.pet.bean;

/**
 * @author 黄东东
 * @date 2017年10月8日
 * @version 1.0
 * @Description 管理表
 */
public class Manager {

	private Integer id;
	private String mname;
	private String password;
	
	public Manager() {
		
	}

	public Manager( String mname, String password) {
		this.mname = mname;
		this.password = password;
	}

	/**
	 * @param id
	 * @param mname
	 * @param password
	 */
	public Manager(Integer id, String mname, String password) {
		this.id = id;
		this.mname = mname;
		this.password = password;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the mname
	 */
	public String getMname() {
		return mname;
	}

	/**
	 * @param mname the mname to set
	 */
	public void setMname(String mname) {
		this.mname = mname;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
