/**
 * 
 */
package com.examplle.root.pet.bean;

/**
 * @author 黄东东
 * @date 2017年10月4日
 * @version 1.0
 * @Description 寄养师实体类
 */
public class Member {
  private Integer mid;
  private String username;
  private String truename;
  private String password;
  private String city;
  private String sex;
  private String address;
  private String cardid;
  private String cardtype;
  private String tel;
  private String email;
  private byte[] image;
  private byte[] carda;
  private byte[] cardb;
  private Integer price;
  private String category;
  
  public Member() {
	  
  }
  
  
/**
 * @param mid
 * @param username
 * @param truename
 * @param password
 * @param city
 * @param sex
 * @param address
 * @param cardid
 * @param cardtype
 * @param tel
 * @param email
 * @param image
 * @param carda
 * @param cardb
 * @param price
 */
public Member(Integer mid, String username, String truename, String password, String city, String sex, String address,
		String cardid, String cardtype, String tel, String email, byte[] image, byte[] carda, byte[] cardb,
		Integer price) {
	super();
	this.mid = mid;
	this.username = username;
	this.truename = truename;
	this.password = password;
	this.city = city;
	this.sex = sex;
	this.address = address;
	this.cardid = cardid;
	this.cardtype = cardtype;
	this.tel = tel;
	this.email = email;
	this.image = image;
	this.carda = carda;
	this.cardb = cardb;
	this.price = price;
}


public Member(Integer mid, String username, String truename, String password, String city, String address,
		String cardid, String cardtype, String tel, String email, byte[] image,Integer price) {
	this.mid = mid;
	this.username = username;
	this.truename = truename;
	this.password = password;
	this.city = city;
	this.address = address;
	this.cardid = cardid;
	this.cardtype = cardtype;
	this.tel = tel;
	this.email = email;
	this.image = image;
	this.price=price;
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
 * @return the username
 */
public String getUsername() {
	return username;
}

/**
 * @param username the username to set
 */
public void setUsername(String username) {
	this.username = username;
}

/**
 * @return the truename
 */
public String getTruename() {
	return truename;
}

/**
 * @param truename the truename to set
 */
public void setTruename(String truename) {
	this.truename = truename;
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

/**
 * @return the city
 */
public String getCity() {
	return city;
}

/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
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
 * @return the cardid
 */
public String getCardid() {
	return cardid;
}

/**
 * @param cardid the cardid to set
 */
public void setCardid(String cardid) {
	this.cardid = cardid;
}

/**
 * @return the cardtype
 */
public String getCardtype() {
	return cardtype;
}

/**
 * @param cardtype the cardtype to set
 */
public void setCardtype(String cardtype) {
	this.cardtype = cardtype;
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
 * @return the email
 */
public String getEmail() {
	return email;
}

/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}

/**
 * @return the image
 */
public byte[] getImage() {
	return image;
}

/**
 * @param image the image to set
 */
public void setImage(byte[] image) {
	this.image = image;
}


/**
 * @return the carda
 */
public byte[] getCarda() {
	return carda;
}

/**
 * @param carda the carda to set
 */
public void setCarda(byte[] carda) {
	this.carda = carda;
}

/**
 * @return the cardb
 */
public byte[] getCardb() {
	return cardb;
}

/**
 * @param cardb the cardb to set
 */
public void setCardb(byte[] cardb) {
	this.cardb = cardb;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Member [mid=" + mid + ", username=" + username + ", truename=" + truename + ", password=" + password
			+ ", city=" + city + ", address=" + address + ", cardid=" + cardid + ", cardtype=" + cardtype + ", tel="
			+ tel + ", email=" + email + ", image=" + image + "]";
}

/**
 * @return the price
 */
public Integer getPrice() {
	return price;
}

/**
 * @param price the price to set
 */
public void setPrice(Integer price) {
	this.price = price;
}

/**
 * @return the sex
 */
public String getSex() {
	return sex;
}

/**
 * @param sex the sex to set
 */
public void setSex(String sex) {
	this.sex = sex;
}


/**
 * @return the category
 */
public String getCategory() {
	return category;
}


/**
 * @param category the category to set
 */
public void setCategory(String category) {
	this.category = category;
}
  
  
}
