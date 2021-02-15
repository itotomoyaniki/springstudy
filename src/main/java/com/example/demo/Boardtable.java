//package com.example.demo;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
//
//@Entity
//@Table(name="boardtabledata")
//public class Boardtable {
//	
//	@Id 
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private long id;
//	
//	@JoinColumn(name="name")
//	@ManyToOne(fetch=FetchType.LAZY)
//	private User user;
//	
//	@Column(name="mail")
//	private String mail;
//
//	public long getId() {return id;}
//	public void setId(long id) {this.id=id;}
//	
//	public User getUser() {return user;}
//	public void setuser(User user) {this.user=user;}
//
//	public String getMail() {return mail;}
//	public void setMail(String mail) {this.mail=mail;}
//
//}
