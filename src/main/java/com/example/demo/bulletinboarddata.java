package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

@Entity
@Table
public class bulletinboarddata {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long id;
	
	@ManyToOne
	@JoinColumn(name="username")
	private HomePageData homepagedata;
	
	@Column
//	@NotBlank(message="空欄にしないでください")
	private String text;
	
	public long getId() {return id;}
	public void setId(long id) {this.id=id;}
	
	public HomePageData getHomepagedata() {return homepagedata;}
	public void setHomepagedata(HomePageData homepagedata) {this.homepagedata=homepagedata;}
	
	public String getText() {return text;}
	void setText(String text) {this.text=text;}
}
