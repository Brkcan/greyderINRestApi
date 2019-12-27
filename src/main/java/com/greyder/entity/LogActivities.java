package com.greyder.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "log_activities")
public class LogActivities {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "subject")
	private String subject;
	@Column(name = "url")
	private String url;
	@Column(name = "method")
	private String method;
	@Column(name = "ip")
	private String ip;
	@Column(name = "agent")
	private String agent;
	@Column(name = "user_id")
	private String user_id; // user tablosuyla ilişkili
	@Column(name = "country")
	private String country;
	@Column(name = "city")
	private String city;
	@Column(name = "created_at")
	private Date created_at;
	@Column(name = "updated_at")
	private Date updated_at;
	
	public LogActivities() {
		super();
	}

	public LogActivities(String subject, String url, String method, String ip, String agent, String user_id,
			String country, String city, Date created_at, Date updated_at) {
		super();
		this.subject = subject;
		this.url = url;
		this.method = method;
		this.ip = ip;
		this.agent = agent;
		this.user_id = user_id;
		this.country = country;
		this.city = city;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	@Override
	public String toString() {
		return "LogActivities [id=" + id + ", subject=" + subject + ", url=" + url + ", method=" + method + ", ip=" + ip
				+ ", agent=" + agent + ", user_id=" + user_id + ", country=" + country + ", city=" + city
				+ ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}
	
	
	
	

}
