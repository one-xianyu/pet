/**
 * 
 */
package com.examplle.root.pet.bean;

/**
 * @author 黄东东
 * @date 2017年10月4日
 * @version 1.0
 * @Description 这是user用户实体类
 */
public class User {

 private Integer uid;
 private String username;
 private String password;
 private String sex;
 private String city;
 private String address;
 private String email;
 private String tel;
 private byte[] image;
 private String petid;
 private String petname;
 private String petage;
 private String petsex;
 private String petcategory;
 private byte[] petimage;
 private String freeze;
 
 /**
  * 无参构造器
  */
 public User() {
	 
 }

/**
 * 全部参数的构造器
 */
public User(Integer uid, String username, String password, String sex, String city, String address, String email,
		String tel, byte[] image, String petid, String petname, String petage, String petsex, String petcategory,
		byte[] petimage) {
	this.uid = uid;
	this.username = username;
	this.password = password;
	this.sex = sex;
	this.city = city;
	this.address = address;
	this.email = email;
	this.tel = tel;
	this.image = image;
	this.petid = petid;
	this.petname = petname;
	this.petage = petage;
	this.petsex = petsex;
	this.petcategory = petcategory;
	this.petimage = petimage;
}

public User(Integer uid, String username, String password, String sex, String city, String address, String email,
		String tel, byte[] image, String petname, String petage, String petsex, String petcategory,
		byte[] petimage) {
	this.uid = uid;
	this.username = username;
	this.password = password;
	this.sex = sex;
	this.city = city;
	this.address = address;
	this.email = email;
	this.tel = tel;
	this.image = image;
	this.petname = petname;
	this.petage = petage;
	this.petsex = petsex;
	this.petcategory = petcategory;
	this.petimage = petimage;
}

public User(String username, String password,String tel,String email) {
	this.username = username;
	this.password = password;
	this.email = email;
	this.tel = tel;
}

public User(String username, String password) {
	this.username = username;
	this.password = password;
}
/**
 * 不含uid的构造器
 */
public User(String username, String password, String sex, String city, String address, String email,
		String tel, byte[] image, String petid, String petname, String petage, String petsex, String petcategory,
		byte[] petimage) {
	this.username = username;
	this.password = password;
	this.sex = sex;
	this.city = city;
	this.address = address;
	this.email = email;
	this.tel = tel;
	this.image = image;
	this.petid = petid;
	this.petname = petname;
	this.petage = petage;
	this.petsex = petsex;
	this.petcategory = petcategory;
	this.petimage = petimage;
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
 * @return the petid
 */
public String getPetid() {
	return petid;
}

/**
 * @param petid the petid to set
 */
public void setPetid(String petid) {
	this.petid = petid;
}

/**
 * @return the petname
 */
public String getPetname() {
	return petname;
}

/**
 * @param petname the petname to set
 */
public void setPetname(String petname) {
	this.petname = petname;
}

/**
 * @return the petage
 */
public String getPetage() {
	return petage;
}

/**
 * @param petage the petage to set
 */
public void setPetage(String petage) {
	this.petage = petage;
}

/**
 * @return the petsex
 */
public String getPetsex() {
	return petsex;
}

/**
 * @param petsex the petsex to set
 */
public void setPetsex(String petsex) {
	this.petsex = petsex;
}

/**
 * @return the petcategory
 */
public String getPetcategory() {
	return petcategory;
}

/**
 * @param petcategory the petcategory to set
 */
public void setPetcategory(String petcategory) {
	this.petcategory = petcategory;
}

/**
 * @return the blob
 */
public byte[] getpetimage() {
	return petimage;
}

/**
 * @param blob the blob to set
 */
public void setBlob(byte[] petimage) {
	this.petimage = petimage;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", sex=" + sex + ", city=" + city
			+ ", address=" + address + ", email=" + email + ", tel=" + tel + ", image=" + image + ", petid=" + petid
			+ ", petname=" + petname + ", petage=" + petage + ", petsex=" + petsex + ", petcategory=" + petcategory
			+ ", petimage=" + petimage + "]";
}

/**
 * @return the freeze
 */
public String getFreeze() {
	return freeze;
}

/**
 * @param freeze the freeze to set
 */
public void setFreeze(String freeze) {
	this.freeze = freeze;
}


}
