package com.example.demo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.stream.events.Comment;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

@Entity
@Table(name="commenttable")
public class comment {
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="")
	private comment comment;
	
	@Id 
	@Column(name="name")
	private String name;
	
	public comment getComment() {return comment;}
	public void setComment(comment comment) {this.comment=comment;}
	
	public String getName() {return name;}
	public void setName(String name) {this.name=name;}
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	
		// TODO Auto-generated method stub
		
	}
		
	
		
	

