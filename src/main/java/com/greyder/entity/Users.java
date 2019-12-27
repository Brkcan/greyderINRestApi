package com.greyder.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "username")
	private String username;
	@Column(name = "email")
	private String email;
	@Column(name = "email_verified_at")
	private String email_verified_at;
	@Column(name = "memberof")
	private String memberof;
	@Column(name = "phone")
	private String phone;
	@Column(name = "password")
	private String password;
	@Column(name = "remember_token")
	private String remember_token;
	@Column(name = "created_at")
	private Date created_at;
	@Column(name = "updated_at")
	private Date updated_at;
	@Column(name = "is_admin")
	private boolean is_admin;
	@Column(name = "logo_number")
	private int logo_number;

	public Users() {
		super();
	}

	public Users(String name, String username, String email, String email_verifed_at, String memberof, String phone,
			String password, String remember_token, Date created_at, Date updated_at, boolean is_admin,
			int logo_number) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.email_verified_at = email_verifed_at;
		this.memberof = memberof;
		this.phone = phone;
		this.password = password;
		this.remember_token = remember_token;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.is_admin = is_admin;
		this.logo_number = logo_number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail_verifed_at() {
		return email_verified_at;
	}

	public void setEmail_verifed_at(String email_verifed_at) {
		this.email_verified_at = email_verifed_at;
	}

	public String getMemberof() {
		return memberof;
	}

	public void setMemberof(String memberof) {
		this.memberof = memberof;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRemember_token() {
		return remember_token;
	}

	public void setRemember_token(String remember_token) {
		this.remember_token = remember_token;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public boolean isIs_admin() {
		return is_admin;
	}

	public void setIs_admin(boolean is_admin) {
		this.is_admin = is_admin;
	}

	public int getLogo_number() {
		return logo_number;
	}

	public void setLogo_number(int logo_number) {
		this.logo_number = logo_number;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email
				+ ", email_verifed_at=" + email_verified_at + ", memberof=" + memberof + ", phone=" + phone
				+ ", password=" + password + ", remember_token=" + remember_token + ", created_at=" + created_at
				+ ", updated_at=" + updated_at + ", is_admin=" + is_admin + ", logo_number=" + logo_number + "]";
	}

}
