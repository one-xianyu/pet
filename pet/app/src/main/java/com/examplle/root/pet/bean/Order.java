/**
 * 
 */
package com.examplle.root.pet.bean;

import java.sql.Date;

/**
 * @author 黄东东
 * @date 2017年10月8日
 * @version 1.0
 * @Description 订单实体类
 */
public class Order {

	private Integer oid;
	private Integer mid;
	private Integer uid;
	private Integer petid;
	private Date odata;
	private String starttime;
	private String endtime;
	private String address;
	private String tel;
	private String pay;
	private String bz;
	private String price;
	
	public Order() {
		
	}
	
	public Order(Integer oid, Integer mid, Integer uid, Integer petid, Date odata, String starttime, String endtime,
			String address, String tel, String pay, String bz) {
		super();
		this.oid = oid;
		this.mid = mid;
		this.uid = uid;
		this.petid = petid;
		this.odata = odata;
		this.starttime = starttime;
		this.endtime = endtime;
		this.address = address;
		this.tel = tel;
		this.pay = pay;
		this.bz = bz;
	}
	
	public Order( Integer mid, Integer uid,  String starttime, String endtime,
			String address, String tel, String pay, String bz) {
		super();
		this.mid = mid;
		this.uid = uid;
		this.starttime = starttime;
		this.endtime = endtime;
		this.address = address;
		this.tel = tel;
		this.pay = pay;
		this.bz = bz;
	}

	/**
	 * @return the oid
	 */
	public Integer getOid() {
		return oid;
	}

	/**
	 * @param oid the oid to set
	 */
	public void setOid(Integer oid) {
		this.oid = oid;
	}

	/**
	 * @return the mid
	 */
	public Integer getMid() {
		return mid;
	}

	/**
	 * @param mid the mid to set
	 */
	public void setMid(Integer mid) {
		this.mid = mid;
	}

	/**
	 * @return the uid
	 */
	public Integer getUid() {
		return uid;
	}

	/**
	 * @param uid the uid to set
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
	}

	/**
	 * @return the petid
	 */
	public Integer getPetid() {
		return petid;
	}

	/**
	 * @param petid the petid to set
	 */
	public void setPetid(Integer petid) {
		this.petid = petid;
	}

	/**
	 * @return the odata
	 */
	public Date getOdata() {
		return odata;
	}

	/**
	 * @param odata the odata to set
	 */
	public void setOdata(Date odata) {
		this.odata = odata;
	}

	/**
	 * @return the starttime
	 */
	public String getStarttime() {
		return starttime;
	}

	/**
	 * @param starttime the starttime to set
	 */
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	/**
	 * @return the endtime
	 */
	public String getEndtime() {
		return endtime;
	}

	/**
	 * @param endtime the endtime to set
	 */
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * @return the pay
	 */
	public String getPay() {
		return pay;
	}

	/**
	 * @param pay the pay to set
	 */
	public void setPay(String pay) {
		this.pay = pay;
	}

	/**
	 * @return the bz
	 */
	public String getBz() {
		return bz;
	}

	/**
	 * @param bz the bz to set
	 */
	public void setBz(String bz) {
		this.bz = bz;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
