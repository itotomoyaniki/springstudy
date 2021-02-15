package com.example.demo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;



@Entity
@Table(name="homepagedata")
public class HomePageData {

//	@Id @GeneratedValue(strategy=GenerationType.AUTO)
//	@Column
//	private long id;
	
	@Id
	@Column
	private String name;
	
	@Column
	private String sex;
	
	@Column
	private String age;
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="bulletinboarddata")
	private List<bulletinboarddata> bulletinboarddatalist;
	
//	public long getId() {return id;}
//	void setId(long id) {this.id=id;}
	
	public String getName(){return name;}
	void setName(String name) {this.name=name;}
	
	public String getSex() {return sex;}
	void setSex(String sex) {this.sex=sex;}
	
	public String  getAge() {return age;}
	void setAge(String age) {this.age=age;}
	
	public List getList() {return bulletinboarddatalist;}
	void setList(List<bulletinboarddata> bulletinboarddatalist) {this.bulletinboarddatalist=bulletinboarddatalist;}

		// TODO Auto-generated method stub
		
	}
	
	
	
		// TODO Auto-generated method stub
		
	
	
		// TODO Auto-generated method stub
		
	


