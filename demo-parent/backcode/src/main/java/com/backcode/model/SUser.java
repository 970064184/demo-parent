package com.backcode.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the s_user database table.
 * 
 */
@Entity
@Table(name="s_user")
public class SUser extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7112874092709002377L;

	private String address;//地址

	private Date create;//创建时间

	@Column(name="department_id")
	private String departmentId;//部门ID

	private String email;//邮件

	private String password;//密码

	private String phone;//电话

	private Date update;//更新时间

	@Column(name="user_code")
	private String userCode;//用户账号

	@Column(name="user_name")//用户名
	private String userName;

	public SUser() {
	}


	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreate() {
		return this.create;
	}

	public void setCreate(Date create) {
		this.create = create;
	}

	public String getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getUpdate() {
		return this.update;
	}

	public void setUpdate(Date update) {
		this.update = update;
	}

	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}