package com.example.demo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="usertable")
public class user {
	
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO) @Column(name="id")
		private long id;
		
		@Column(name="username")
		private String username;
		
		@Column(name="password")
		private String password;
		
		@OneToMany(mappedBy="comment")
		private List<comment> commentList;
		
		public long getId() {return id;}
		public void setId(long id) {this.id=id;}
		
		
		public String getUsername(){return username;}
		public void setUsername(String username) {this.username=username;}
		
		public String getPassword() {return password;}
		public void setPassword(String password) {this.password=password;}
		
	
		public List<comment> getList(){return commentList;}
		public void setList(List<comment> commentList) {this.commentList=commentList;}
		

}
